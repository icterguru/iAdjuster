package com.iadjuster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iadjuster.model.Task;
import com.iadjuster.model.Work;
import com.iadjuster.repository.WorkRepository;


@Service("workService")
public class WorkServiceImpl implements WorkService {

	@Autowired
	private WorkRepository workRepository;
	
	
	public List<Task> findAllTasks() {
		
		List<Task> adjtasks = new ArrayList<Task>();
		
		
		Task open = new Task();
		open.setTaskdesc("Auto");
		adjtasks.add(open);
		
		Task cp = new Task();
		cp.setTaskdesc("CP");
		adjtasks.add(cp);
		
		Task pending = new Task();
		pending.setTaskdesc("Fire");
		adjtasks.add(pending);
		
		Task closed = new Task();
		closed.setTaskdesc("Hail");
		adjtasks.add(closed);
		

		return adjtasks;
	}

	@Transactional
	public Work save(Work work) {
		
		work = workRepository.save(work);
		
		
		return work;
	}


	
}
