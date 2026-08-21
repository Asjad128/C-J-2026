1. Create 3 test files. Use chmod to set different permission combinations (e.g., 644, 755, 600) and run ls -l after each. For each, explain in your own words what the three permission groups (owner/group/other) and each digit actually control.

files created: test.py, file_report_exe.sh, docs.txt.

permission before:

1. test.py:  
2. file_report_exe.sh: 
3. docs.txt: 

permission code:

    >In linux, the permissions are changed with the help of chmod command and permission codes.
    >permissions here are: read, write, execute
    >permission are applied for: user, group users, others.

    codes:

        4 - read    r
        2 - write   w
        1 - execute x

    combinaions should be like:

        r+w = 4+2 = 6
    
ls -l, permission format:

    -rwxrw-r--

    rwx - user/owner
    rw- - group users
    r-- - others

    here "-" mean the permission is not set.

    from here the file permission code would be like: 764

syntax:

chmod permission_code filename

ex: chmod 751 test.py


chmod 777 test.py


2. Start a background process: sleep 300 &. Find it with ps aux | grep sleep, note its PID, then kill it with kill <PID>. Confirm it's gone.

start bg process by command sleep


with ps aux find pid of sleep

kill it using sleep process id.

again ps aux to ensure it is killed.

