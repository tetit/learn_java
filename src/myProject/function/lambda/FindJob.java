package myProject.function.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindJob {
	static List<String> jobSearchResult = new ArrayList<>();
	public static List<String> getResult() {
		jobSearchResult.add("Job4, the best");		jobSearchResult.add("Job1, I");
		jobSearchResult.add("Job6, for myself");	jobSearchResult.add("Job3, find");
		jobSearchResult.add("Job5, job");			jobSearchResult.add("Job2, can");
		jobSearchResult.add("No Job7, zero result");
		return jobSearchResult;
	}
	public static void main(String[] args) {
		List<String> myJob = getResult();
		List<String> rezult = myJob.stream().filter(j -> j.startsWith("Job")).sorted().map(j -> j.toString().replaceAll("Job\\d,", ""))
				.collect(Collectors.toList());
		rezult.forEach(System.out::printf);
	}
}
