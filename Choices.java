public class Choices {
    

    public String getGreeting()
	{
		return "Hello,Look At The Default Classes , Pick One And Write The Name Of The Class To Continue";
	}




	public String getResponse(String statement)
	{
	String response = " ";
	if (statement.indexOf(" ") >= 0)
		{
			response = "Pick A Class";
		}
		else if (statement.indexOf("wizard") >= 0
				|| statement.indexOf("warrior") >= 0
				|| statement.indexOf("archer") >= 0 
				|| statement.indexOf("Valkyrie")>=0)
		{
			response = " now type: Y";
		}else{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = " Attack With ";
		}
		else if (whichResponse == 1)
		{
			response = " Weapon Attacks ";
		}
		else if (whichResponse == 2)
		{
			response = " Hit's You With ";
		}
		else if (whichResponse == 3)
		{
			response = " Shoot With ";
		}
		else if (whichResponse == 4){
			response = " Stab With ";
		}
		else if (whichResponse == 5){
			response = " Swings With ";
		}

    return response;
}

}