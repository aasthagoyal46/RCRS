# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: AgentInfo.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='AgentInfo.proto',
  package='PyRLAgent',
  syntax='proto3',
  serialized_options=_b('\n\tPyRLAgentB\tPyRLProto'),
  serialized_pb=_b('\n\x0f\x41gentInfo.proto\x12\tPyRLAgent\"-\n\tAgentInfo\x12 \n\x06\x61gents\x18\x01 \x03(\x0b\x32\x10.PyRLAgent.Agent\"0\n\nActionInfo\x12\"\n\x07\x61\x63tions\x18\x01 \x03(\x0b\x32\x11.PyRLAgent.Action\"J\n\x05\x41gent\x12\x10\n\x08\x61gent_id\x18\x01 \x01(\x05\x12\t\n\x01x\x18\x02 \x01(\x01\x12\t\n\x01y\x18\x03 \x01(\x01\x12\r\n\x05water\x18\x04 \x01(\x05\x12\n\n\x02hp\x18\x05 \x01(\x05\"-\n\x06\x41\x63tion\x12\x0f\n\x07\x61gentId\x18\x01 \x01(\x05\x12\x12\n\nbuildingId\x18\x02 \x01(\x05\x32J\n\tPyRLAgent\x12=\n\x0cgetAgentInfo\x12\x15.PyRLAgent.ActionInfo\x1a\x14.PyRLAgent.AgentInfo\"\x00\x42\x16\n\tPyRLAgentB\tPyRLProtob\x06proto3')
)




_AGENTINFO = _descriptor.Descriptor(
  name='AgentInfo',
  full_name='PyRLAgent.AgentInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='agents', full_name='PyRLAgent.AgentInfo.agents', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=30,
  serialized_end=75,
)


_ACTIONINFO = _descriptor.Descriptor(
  name='ActionInfo',
  full_name='PyRLAgent.ActionInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='actions', full_name='PyRLAgent.ActionInfo.actions', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=77,
  serialized_end=125,
)


_AGENT = _descriptor.Descriptor(
  name='Agent',
  full_name='PyRLAgent.Agent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='agent_id', full_name='PyRLAgent.Agent.agent_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='x', full_name='PyRLAgent.Agent.x', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='y', full_name='PyRLAgent.Agent.y', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='water', full_name='PyRLAgent.Agent.water', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hp', full_name='PyRLAgent.Agent.hp', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=127,
  serialized_end=201,
)


_ACTION = _descriptor.Descriptor(
  name='Action',
  full_name='PyRLAgent.Action',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='agentId', full_name='PyRLAgent.Action.agentId', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='buildingId', full_name='PyRLAgent.Action.buildingId', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=203,
  serialized_end=248,
)

_AGENTINFO.fields_by_name['agents'].message_type = _AGENT
_ACTIONINFO.fields_by_name['actions'].message_type = _ACTION
DESCRIPTOR.message_types_by_name['AgentInfo'] = _AGENTINFO
DESCRIPTOR.message_types_by_name['ActionInfo'] = _ACTIONINFO
DESCRIPTOR.message_types_by_name['Agent'] = _AGENT
DESCRIPTOR.message_types_by_name['Action'] = _ACTION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AgentInfo = _reflection.GeneratedProtocolMessageType('AgentInfo', (_message.Message,), {
  'DESCRIPTOR' : _AGENTINFO,
  '__module__' : 'AgentInfo_pb2'
  # @@protoc_insertion_point(class_scope:PyRLAgent.AgentInfo)
  })
_sym_db.RegisterMessage(AgentInfo)

ActionInfo = _reflection.GeneratedProtocolMessageType('ActionInfo', (_message.Message,), {
  'DESCRIPTOR' : _ACTIONINFO,
  '__module__' : 'AgentInfo_pb2'
  # @@protoc_insertion_point(class_scope:PyRLAgent.ActionInfo)
  })
_sym_db.RegisterMessage(ActionInfo)

Agent = _reflection.GeneratedProtocolMessageType('Agent', (_message.Message,), {
  'DESCRIPTOR' : _AGENT,
  '__module__' : 'AgentInfo_pb2'
  # @@protoc_insertion_point(class_scope:PyRLAgent.Agent)
  })
_sym_db.RegisterMessage(Agent)

Action = _reflection.GeneratedProtocolMessageType('Action', (_message.Message,), {
  'DESCRIPTOR' : _ACTION,
  '__module__' : 'AgentInfo_pb2'
  # @@protoc_insertion_point(class_scope:PyRLAgent.Action)
  })
_sym_db.RegisterMessage(Action)


DESCRIPTOR._options = None

_PYRLAGENT = _descriptor.ServiceDescriptor(
  name='PyRLAgent',
  full_name='PyRLAgent.PyRLAgent',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=250,
  serialized_end=324,
  methods=[
  _descriptor.MethodDescriptor(
    name='getAgentInfo',
    full_name='PyRLAgent.PyRLAgent.getAgentInfo',
    index=0,
    containing_service=None,
    input_type=_ACTIONINFO,
    output_type=_AGENTINFO,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_PYRLAGENT)

DESCRIPTOR.services_by_name['PyRLAgent'] = _PYRLAGENT

# @@protoc_insertion_point(module_scope)
