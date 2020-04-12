INSERT INTO welcome VALUES
(1, 'Hello'),
(2, 'Hi'),
(3, 'Hey'),
(4, 'Welcome');

SELECT setval('welcome_id_seq', 5, true);