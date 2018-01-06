package tabular.islam.akram;

import java.util.LinkedList;

public class Petrick {

	LinkedList<Integer>[] primeArray;
	LinkedList<LinkedList> primeImplicantsList=new LinkedList<>();


	public void toArrayOfMintermsRepresntation(MinTerm[] mineTerms,MinTerm[] primeImplicants){
		int dontCaresCount=0;
		for (int i = 0; i < mineTerms.length; i++) {
			if(mineTerms[i].dontCareCheck==true) {
				dontCaresCount++;
			}
		}

		primeArray=new LinkedList[mineTerms.length-dontCaresCount] ;
		int primeArrayCounter=0;
		for(int c=0 ;c<mineTerms.length;c++)
		{
			if(mineTerms[c].dontCareCheck==true) {
				continue;
			}
			for (int i = 1; i < primeImplicants.length+1&&primeImplicants[i-1]!=null; i++) {
				if(primeImplicants[i-1].value<=mineTerms[c].value)
				{
					//int temp=primeImplicants[i].value;
					for(int j = 0; j<Math.pow(2, primeImplicants[i-1].diffList.size());j++)
					{
						int temp=primeImplicants[i-1].value;
						final String binary = Integer.toBinaryString(j);
						for (int k = binary.length()-1; k>=0; k--) {
							if(binary.charAt(k)=='1') {
								temp=temp+(int)primeImplicants[i-1].diffList.get(binary.length()-k-1);
							}
						}
						if (temp==mineTerms[c].value)
						{
							if(primeArray[primeArrayCounter]==null) {
								primeArray[primeArrayCounter]=new LinkedList<>() ;
							}
							primeArray[primeArrayCounter].add((int) Math.pow(2, i-1));

						}

					}
				}
			}
			primeArrayCounter++;
		}

	}

	public /*MinTerm[]*/ void petricMethod(){
		for (int i = 0; i < primeArray.length; i++) {

			final LinkedList<Object> temp =new LinkedList<Object>();
			primeImplicantsList.add(temp);

		}
		for (int i = 0; i < primeArray.length; i++) {
			if(primeImplicantsList.get(i)==null) {
				final LinkedList<Object> temp =new LinkedList<Object>();
				primeImplicantsList.add(temp);
			}
			for (int j = 0; j < primeArray[i].size(); j++) {
				primeImplicantsList.get(i).add(primeArray[i].get(j));
			}

		}
		final int PrimeCounter=0;
		while(primeImplicantsList.size()!=1){
			final LinkedList<Object> temp=new LinkedList<Object>();
			for (int i = 0; i < primeImplicantsList.get(0).size(); i++) {

				for (int j = 0; j < primeImplicantsList.get(1).size(); j++) {
					final int ORing=(int)primeImplicantsList.get(0).get(i)|(int)primeImplicantsList.get(1).get(j);
					temp.add(ORing);
				}
			}
			for (int j = 0; j < temp.size(); j++) {
				for (int j2 = j+1; j2 < temp.size(); j2++) {
					final int Anding=(int)temp.get(j)&(int)temp.get(j2);
					if((int)temp.get(j)<(int)temp.get(j2)&&Anding==(int)temp.get(j))
					{
						temp.remove(j2);
						j2--;
					}
					else if((int)temp.get(j)>=(int)temp.get(j2)&&Anding==(int)temp.get(j2))
					{
						temp.remove(j);
						j--;
						break;
					}
				}
			}


			primeImplicantsList.remove(0);
			primeImplicantsList.remove(0);
			primeImplicantsList.add(0, temp);
		}


	}

	public LinkedList<Object> solutions(MinTerm[] primeImplicants){
		final LinkedList<Object> solutionsList =new LinkedList<Object>();

		//MinTerm[] solutions=new MinTerm[primeImplicantsList.size()];
		//int solutionsCounter=0;
		for (int i = 0; i < primeImplicantsList.get(0).size(); i++) {
			final String binary = Integer.toBinaryString((int)primeImplicantsList.get(0).get(i));
			final MinTerm[] temp = new MinTerm[Grouping.numOfOnes((int)primeImplicantsList.get(0).get(i))];
			int k = 0;
			for (int j = binary.length()-1; j >=0; j--) {
				if(binary.charAt(j)=='1') {
					temp[k] = primeImplicants[binary.length() -1 -j];
					k++;
				}

			}
			solutionsList.add(temp);
		}
		return solutionsList;
	}

}
