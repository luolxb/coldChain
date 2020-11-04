create table cp_device_correlation_sensor
(
    id        varchar(64) not null comment '主键'
        primary key,
    device_id varchar(64) not null comment '设备编号（主键）',
    sensor_id varchar(64) not null comment '传感器编号（主键）'
)
    comment '设备-传感器关联表';

INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('050e309677943aaa29ee92df439d3d8c', '12e6f84fcbc46f3116f00bb379da83ab', '75964e280ea0d556be10795ffa6499df');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('0834b808faee76d2aca7a8e23d7806c8', '01f3074eef654a69a387c8cc1978f9c9', '276123fba8647f078e46fb5c8312b756');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('108a985dc802094d083beb6cbcb7e8af', '01f3074eef654a69a387c8cc1978f9c9', 'f9ea2cb9f74524efd91d06e6939b76f7');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('123', '9b7a1cd1936d45a58687fdf1bf3fa456', '00c206e4bd8141b78c23abb457ab967a');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('1232', '9b7a1cd1936d45a58687fdf1bf3fa456', '21889d148124411db1e713d615a7db31');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('18a41563f4ba450bbbb7789a745caefb', '5a66da602af843d3844502055005a9af', 'bd77419ce64941eb845496bb8af9daeb');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('278c1f4f217145f795fde9fa2eed24d7', '9b7a1cd1936d45a58687fdf1bf3fa456', 'f8a33ef211f447958caba2e59696b64e');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('29790ed29671428a97d46c62c593c4f1', '5a66da602af843d3844502055005a9af', 'af4398788cf24dc09575180770e00bf3');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('3738203ba9988d9c9bba60d481761892', '12e6f84fcbc46f3116f00bb379da83ab', '5097de36b4385bad4e439d76bb569d64');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('40d71755cfc43c21f2b03b77ad2fe816', '01f3074eef654a69a387c8cc1978f9c9', 'ebd8da5ddd090f0b3ffb230351f2759e');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('4c822a49cd47543ee78445980add0943', '01f3074eef654a69a387c8cc1978f9c9', '0709f19ee69c413caa4d227c184a084c');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('4fadc64aafd9728f9b753f4d62d8e485', '01f3074eef654a69a387c8cc1978f9c9', 'efbb30d0e16a27a132e085951805ba59');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('5021add019394835bfce2270db2b40e1', '5a66da602af843d3844502055005a9af', 'e169d4e9a48a4f7a81e06fe12e331d2a');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('5f48fb81eebf1c5a1e18dda7d45b6198', '01f3074eef654a69a387c8cc1978f9c9', 'a23430b292052c5ca858a05ca9e7dd28');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('7e7f621e05af423494a0e26775dbfd14', '01f3074eef654a69a387c8cc1978f9c9', '982d13a2628af422ebfa69e6f776e079');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('834b684ef89905abd71379b7592544f2', '01f3074eef654a69a387c8cc1978f9c9', '22e892acf33071aae3002916e55125e0');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('8673d5c49cd3443a6d225252b4f8d48e', '12e6f84fcbc46f3116f00bb379da83ab', 'ee792f275cb3134c89bc2b81d0213faf');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('8ef23ee37f98e7b18cc10054e21c8318', '12e6f84fcbc46f3116f00bb379da83ab', '3f110df02fa8a9108a64df278cc941fe');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('8f67fb9b879c48f189639cbf1975dee4', '5a66da602af843d3844502055005a9af', '18048b1f75e743b187b423860cff7a75');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('90e6169a44c9ab6a6aa6d507cc062b21', '12e6f84fcbc46f3116f00bb379da83ab', '446d551a9551b5969765cec2f58ed10d');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('983298068840ea931481dbf7cf10fd34', '12e6f84fcbc46f3116f00bb379da83ab', 'd3bb50703b47b4261a73e25511b9bb9c');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('a235c763a391c60bbb84f2607bf89cae', '01f3074eef654a69a387c8cc1978f9c9', '73845bd55364a19188991e25baff8e88');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('ad3686522d230706bf063ec459af56bd', '12e6f84fcbc46f3116f00bb379da83ab', '49fdad87875bc5367525219c082d9edc');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('badb3c9a02bb34093621a766d9c182b6', '12e6f84fcbc46f3116f00bb379da83ab', 'b752b3386cf5dc9677cccc1a27ee8ef3');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('bc2533fae03043a3aba7628e55646b51', '5a66da602af843d3844502055005a9af', '38ef1f3939b94660b3bb43dfd44e8ebf');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('cd65cdcfd7c04ad589f5d837782a40db', '5a66da602af843d3844502055005a9af', '040444c69d2e4cc1ad54b22bde5b90b4');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('cf4186b82ea04052a8fa5d710e26c3b3', '5a66da602af843d3844502055005a9af', 'ffbd329d886342758cad08b1643c7da5');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('ee73282f2a0e4c0fef0678bc5b129bf7', '12e6f84fcbc46f3116f00bb379da83ab', '8130e4f33d5c74f9038ccd4dae60946d');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('fabff0c8502c498b92f14ecadc9e9f37', '5a66da602af843d3844502055005a9af', '85e74a0733824d27b2eb6d2226e48d67');
INSERT INTO coldchain_device.cp_device_correlation_sensor (id, device_id, sensor_id) VALUES ('fd487ac453bd48a9a8c2a7010c27653e', '5a66da602af843d3844502055005a9af', 'b7f944acb0c347c9a8e897996565d1ae');