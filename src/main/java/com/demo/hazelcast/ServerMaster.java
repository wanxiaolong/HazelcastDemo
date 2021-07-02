package com.demo.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ServerMaster {
    public static void main(String[] args) {
        // create an instance
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();

        // Map
        Map<String, String> map = instance.getMap("MyMap");
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        // List
        List<String> list = instance.getList("MyList");
        list.add("l1");
        list.add("l2");

        // Set
        Set<String> set = instance.getSet("MySet");
        set.add("s1");
        set.add("s1");

        // Queue
        Queue<String> queue = instance.getQueue("MyQueue");
        queue.offer("q1");
        queue.offer("q2");
    }
}
