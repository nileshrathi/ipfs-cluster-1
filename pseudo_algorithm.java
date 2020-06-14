import java.util.Collection;

class dynamic_replicate
{
    public static void public static void main(String[] args) {
        //Data Structures

        Map<String, Pair<int,int>> Map_AccessCount_ReplicaCount = new HashMap<String, Pair<String,String> >();
        //Map<CID,<no_of_access,current_no_of replicas> >

        Map<String, Map<String,int> > Map_NodeId_ReqCount = new HashMap<String, Arraylist{Pair<String,String>}>();

        //Map<CID, Arraylist{<cluster_id/node_id , no_of_request >}>

        String s ;// String which we get 
        String tokens[] //string s broken up in tokens

        while(true)
        {

            if(time<TIME_INTERVAL)  //update metadata during this time_interval
        {
            if(token[0]==get)   // "get cid by node_id"
            {
                String cid=token[1];
                String requesting_node=token[3];
                
                Map_AccessCount_ReplicaCount[cid]->pair_first++; //if not create a new entry [cid,0] and then increment
                
                Map_NodeId_ReqCount[cid][requesting_node].value++;  //add to the cid the request count of node which is trying to access it .

            }
            else if(token[0]==pin)
            {
                if(token[1]==add)
                {
                    if(token[2]=="skipped")
                    {
                        //do nothing
                    }
                    else if(token[2]=="everywhere")
                    {
                        Map_AccessCount_ReplicaCount[cid]->pair_second += total_no_of_nodes
                    }
                    else
                    {
                       extract allocations[]
                       Map_AccessCount_ReplicaCount[cid]->pair_second += allocations.count();
                    }
                    

                }
                else if(token[1]==rm)
                {
                    Map_AccessCount_ReplicaCount[cid]->pair_second += 0;
                }
    
            }
            else if(token[0]==add)
            {
                
            }
            time ++;
        }
        else //now change replication 
        {
            //from the data structure find popularity of each file
            Map<String,Double> popularity_map=new Map<String,Double> //map<CID,popularity_no>
            for(each element in Map_AccessCount_ReplicaCount) //for 
            {
                cid=element.key
                int no_of_access= element.value->pair_first  //each element is of type pair <cid, pair<accessCount,replicaCount> >
                int no_of_individual_acess=Map_NodeId_ReqCount[cid].mapSize() //map size will tell me how many ubinque nodes are accessig the cluster
                int current_replica_count= element.value->pair_second // current replication factor
                Double popularity=(no_of_access*no_of_individual_acess)/current_replica_count;
                popularity_map[cid]=popularity;
            }

            int sum_of_popularity=0;
            for(each element in popularity_map)
            {
                sum_of_popularity=sum_of_popularity+element.value;
            }
            double threshhold=sum_of_popularity/popularity_map.size()
            
            for(each element in popularity_map)
            {
                cid=element.key;

                if(element.value>threshhold)
                {
                    //decrease the replication count
                    int current_replica_count=Map_AccessCount_ReplicaCount[CID].pair_second
                    int new_replication_count=min(1,current_replica_count/2);
                    execute commands
                    {
                        ipfs-cluster-ctl pim rm cid
                        ipfs-cluster-ctl pin add -r new_replication_count cid
                    }
                    Map_AccessCount_ReplicaCount[cid].pair_second=new_replication_count;
                    //cleanup code
                    Map_AccessCount_ReplicaCount[cid].pair_first=0;
                    Map_NodeId_ReqCount[cid].delete_map();      
                }
                else
                {
                    // increase the replication count

                    int current_replica_count=Map_AccessCount_ReplicaCount[CID].pair_second
                    int new_replication_count=min(total_no_of_nodes,current_replica_count*2);0
                    execute commands
                    {
                        ipfs-cluster-ctl pim rm cid
                        ipfs-cluster-ctl pin add -r new_replication_count cid
                    }
                    Map_AccessCount_ReplicaCount[CID].pair_second=new_replication_count;

                    //cleanup code 
                    Map_AccessCount_ReplicaCount[cid].pair_first=0;
                    Map_NodeId_ReqCount[cid].delete_map();
                }
            }

            
            time =0;



        }
        

        }

        

        

    }
}