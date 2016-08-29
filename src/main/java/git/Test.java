/**
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved. 
 */
package git;

import java.io.File;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

/**
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		/*
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
		repositoryBuilder.setMustExist(true);
		repositoryBuilder.setGitDir(new File("D:\\temporary\\git-demo\\.git"));
		
		Repository repository = null;
		try {
			repository = repositoryBuilder.build();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (null == repository || !repository.getObjectDatabase().exists()) {
			repository = FileRepositoryBuilder.create(new File("D:\\temporary\\git-demo\\.git"));
			System.out.println(repository);
			repository.create();
		} else {
			System.out.println("existed");
		}
		*/
		/*
		Git git = new Git(repository);
		git.pull();
		git.commit();
		git.push();
		
		git.close();
		*/
		
		CloneCommand command = new CloneCommand();
		command.setDirectory(new File("D:\\temporary\\git-demo1"));
		command.setURI("http://10.15.15.171/g-euler-bpr/euler-bpr.git");
		command.setBranch("master");
		command.setTimeout(120);
		command.setCloneAllBranches(false);
		command.setCredentialsProvider(new UsernamePasswordCredentialsProvider("lizhongwen", "lizhongwen"));
		Git git = command.call();
		
		Repository repository = git.getRepository();
		System.out.println(repository);
	}
	
}
