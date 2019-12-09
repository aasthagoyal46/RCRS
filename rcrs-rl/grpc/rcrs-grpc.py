import grpc

import AgentInfo_pb2
import AgentInfo_pb2_grpc
import BuildingInfo_pb2
import BuildingInfo_pb2_grpc

if __name__ == '__main__':
    while True:
        with grpc.insecure_channel('localhost:3400') as channel:
	        stub = AgentInfo_pb2_grpc.PyRLAgentStub(channel)
	        response = stub.getAgentInfo(AgentInfo_pb2.ActionInfo())
	        print(response)