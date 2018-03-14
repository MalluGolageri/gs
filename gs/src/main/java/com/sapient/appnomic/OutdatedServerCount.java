package com.sapient.appnomic;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class OutdatedServerCount {
	public static int processData(ArrayList<String> array) {
		/*
		 * Modify this method to process `array` as indicated in the question. At the
		 * end, return the appropriate value.
		 *
		 * Please create appropriate classes, and use appropriate data structures as
		 * necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method) as your answer
		 */
		Map<SoftwareDetails, ServerNameVersion> map = new HashMap<>();
		Set<String> serverNames = new HashSet<>();
		for (String line : array) {
			String[] tokens = line.split(",");
			String serverName = tokens[0].trim();
			String type = tokens[1].trim();
			String name = tokens[2].trim();
			String version = tokens[3].trim();
			SoftwareDetails details = new SoftwareDetails(type, name);
			ServerNameVersion custom = new ServerNameVersion(serverName, version);
			if (map.containsKey(details)) {
				if (version.compareTo(map.get(details).getVersion()) != 0) {
					if (version.compareTo(map.get(details).getVersion()) > 0) {
						serverNames.add(map.get(details).getServerName());
						map.put(details, custom);
					} else {
						serverNames.add(serverName);
					}
				}
			} else {
				map.put(details, custom);
			}

		}
		serverNames.forEach(System.out::println);
		return serverNames.size();
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		try {
			Scanner in = new Scanner(new BufferedReader(
					new FileReader("/Users/mallu/github/gs/gs/src/main/java/com/sapient/appnomic/input.txt")));
			while (in.hasNextLine()) {
				String line = in.nextLine().trim();
				if (!line.isEmpty()) // Ignore blank lines
					inputData.add(line);
			}
			int retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(
					new FileWriter("/Users/mallu/github/gs/gs/src/main/java/com/sapient/appnomic/output.txt")));
			output.println("" + retVal);
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}

class SoftwareDetails {
	private String type;
	private String name;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareDetails other = (SoftwareDetails) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public SoftwareDetails(String type, String name) {
		this.type = type;
		this.name = name;
		// this.serverName=serverName
	}
}

class ServerNameVersion {
	private String serverName;
	private String version;
	
	public ServerNameVersion(String serverName, String version) {
		this.serverName = serverName;
		this.version = version;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}