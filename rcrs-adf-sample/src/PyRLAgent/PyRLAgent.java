package PyRLAgent;

import PyRLAgent.PyRLAgentGrpc.PyRLAgentImplBase;
import PyRLAgent.PyRLProto.ActionInfo;
import PyRLAgent.PyRLProto.Agent;
import PyRLAgent.PyRLProto.AgentInfo;
import io.grpc.stub.StreamObserver;

public class PyRLAgent extends PyRLAgentImplBase {

	@Override
	public void getAgentInfo(ActionInfo request, StreamObserver<AgentInfo> responseObserver) {
		System.out.println(request.getActionsList());
		
		AgentInfo.Builder resp = AgentInfo.newBuilder();
		
		Agent a = Agent.newBuilder().setAgentId(1).setX(1).setY(1).setWater(1).setHp(1).build();
		resp.addAgents(a);
		
		responseObserver.onNext(resp.build());
		responseObserver.onCompleted();
	}
	
}
