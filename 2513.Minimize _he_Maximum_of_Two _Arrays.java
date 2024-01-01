		need=n=n1+n2

        lcm=math.lcm(d1,d2)

        while need:
                        
            only1 = n // d2 - n // lcm
            
            only2 = n // d1 - n // lcm
            
            free = n - n // d1 - n // d2 + n // lcm              
            
            need= max(max(0, n1 - only1) + max(0, n2 - only2)- free,0)

            n+=need

        return n
