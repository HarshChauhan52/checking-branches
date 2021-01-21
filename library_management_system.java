import java.util.*;

class Book
{
	public String book_name,author_name,subject;
	public int pno;

	Book(String book_name,String author_name,String subject,int pno)
	{
		this.book_name = book_name;
		this.author_name = author_name;
		this.subject = subject;
		this.pno = pno;
	}
}

class librarian
{
	List <Book> ar=new ArrayList();
	List <Book> ra=new ArrayList();

	Scanner sc=new Scanner(System.in);

	void liblogin()
	{

		String id,pass;
		System.out.println("enter id :");
		id=sc.next();

		System.out.println("enter password :");
		pass=sc.next();

        if(id.equals("hello") && pass.equals("123"))
		{
			System.out.println("Login successful");
			int continu=1;
			do
			{
			System.out.println("what do you want to do... \n 1).Add books \n 2).List of books \n 3).Books loaned");
            int b=sc.nextInt();

            switch(b)
		    {
		        case 1:

		           int no=1;
		           do
		           {
					   System.out.println("Enter book name :");
		    	       String bn=sc.next();
		    	       System.out.println("Enter author name :");
					   String an=sc.next();
		    	       System.out.println("Enter subject name :");
					   String sn=sc.next();
		    	       System.out.println("Enter page no :");
					   int pn=sc.nextInt();

		    	       Book book1=new Book(bn,an,sn,pn);

		    	       ar.add(book1);
		    	       System.out.println("Press 1 to continue adding books else press 2");
		    	       no=sc.nextInt();
				   }
				   while(no==1);

                break;

		    	case 2:

                    int cont=1;
                    do
                    {
		            Iterator i1=ar.iterator();
				    while(i1.hasNext())
			        {
				   	    Book book2=(Book)i1.next();
				   	    System.out.println(book2.book_name);
				   		System.out.println(book2.author_name);
				   	    System.out.println(book2.subject);
				        System.out.println(book2.pno);
				    }
				    System.out.println("Press 1 to continue to see books list else press 2");
		            cont=sc.nextInt();
				    }
				    while(cont==1);

                break;

	            case 3:

                    int conti=1;
                    do
                    {
		            Iterator i2=ra.iterator();
				    while(i2.hasNext())
			        {
				   	    Book book2=(Book)i2.next();
				   	    System.out.println(book2.book_name);
				   		System.out.println(book2.author_name);
				   	    System.out.println(book2.subject);
				        System.out.println(book2.pno);
				    }
				    System.out.println("Press 1 to continue seeing books that have been loaned else press 2");
		            cont=sc.nextInt();
				    }
				    while(conti==1);


                break;

		        default:
		    	System.out.println("Invalid choice");
		    	break;
		    }
		    System.out.println("If you want to continue press 1 else 2");
		    continu=sc.nextInt();
		    }
		    while(continu==1);
		}
		else
		{
			System.out.println("invalid credentials");
		}
	}


	void stulogin()
			{

				String id,pass;
				System.out.println("enter id :");
				id=sc.next();

				System.out.println("enter password :");
				pass=sc.next();

		        if(id.equals("hi") && pass.equals("123"))
				{
					System.out.println("Login successful");
					int continu=1;
								do
								{
								System.out.println("what do you want to do... \n 1).Search a book by it's name/title \n 2). Search a book by it's Author \n 3).Loan a book \n 4).Return a book");
					            int c=sc.nextInt();

					            switch(c)
							    {
							        case 1:

							           int no=1;
							           do
							           {
										   System.out.println("Enter book name :");
							    	       String bn=sc.next();
							    	       int check=0;

                                       Iterator i3=ar.iterator();
						    	       while(i3.hasNext())
						    	       {
										   check=1;

										   Book book2=(Book)i3.next();
										   if(book2.book_name.equals(bn))
										   {
										        System.out.println(book2.book_name);
						   				   		System.out.println(book2.author_name);
						   				   	    System.out.println(book2.subject);
	    				   				        System.out.println(book2.pno);
				                           }
									   }

                                       if(check==0)
                                       {
										   System.out.println("Above book not found");
									   }
                                       else
                                       {
										   System.out.println("Above book found");
									   }

                                       System.out.println("Press 1 to continue searching books else press 2");
							    	   no=sc.nextInt();
									   }
									   while(no==1);

					                break;

                                    case 2:

							           int repeat=1;
							           do
							           {
										   System.out.println("Enter author name :");
							    	       String authrn=sc.next();
							    	       int checking=0;

                                       Iterator i4=ar.iterator();
						    	       while(i4.hasNext())
						    	       {
										   checking=1;

										   Book book3=(Book)i4.next();
										   if(book3.book_name.equals(authrn))
										   {
										        System.out.println(book3.book_name);
						   				   		System.out.println(book3.author_name);
						   				   	    System.out.println(book3.subject);
	    				   				        System.out.println(book3.pno);
				                           }
									   }

                                       if(checking==0)
                                       {
										   System.out.println("Above book not found");
									   }
                                       else
                                       {
										   System.out.println("Above book found");
									   }

                                       System.out.println("Press 1 to continue searching books else press 2");
							    	   no=sc.nextInt();
									   }
									   while(repeat==1);

					                break;


							    	case 3:

                                       int f=1;
                                       do
                                       {
                                           String loan,bn1,an1,sn1;
                                           int pn1;
                                           System.out.println("Enter a book you want to loan :");
                                           loan=sc.next();


                                       Iterator i5=ar.iterator();
						    	       while(i5.hasNext())
						    	       {
                                           Book book4=(Book)i5.next();
										   if(book4.book_name.equals(loan))
										   {
											   Book book41=new Book(book4.book_name,book4.author_name,book4.subject,book4.pno);
											   ra.add(book41);
				                           }
									   }

                                           System.out.println("if you want to loan more books press 1 else 2");
							               f=sc.nextInt();
									   }
									   while(f==1);

					                break;

						            case 4:

                                       System.out.println("You can return one of these following books");
                                       Iterator i6=ra.iterator();
						    	       while(i6.hasNext())
						    	       {
                                                Book book5=(Book)i6.next();
										        System.out.println(book5.book_name);
						   				   		System.out.println(book5.author_name);
						   				   	    System.out.println(book5.subject);
	    				   				        System.out.println(book5.pno);
				                        }


						               System.out.println("Enter book name you want to return");
						               String bnr=sc.next();
                                       int chek=0;

                                       Iterator i7=ra.iterator();
						    	       while(i7.hasNext())
						    	       {
										   chek=1;
										   Book book6=(Book)i7.next();
										   if(book6.book_name.equals(bnr))
										   {
											    i7.remove();
										   }
									   }

                                       if(chek==0)
                                       {
										   System.out.println("Above book not returned");
									   }
                                       else
                                       {
										   System.out.println("Above book returned");
									   }

                                       System.out.println("Your remaining books");
						               Iterator i8=ra.iterator();
									   while(i8.hasNext())
									   {
									       Book book7=(Book)i8.next();
									       System.out.println(book7.book_name);
									   	   System.out.println(book7.author_name);
									   	   System.out.println(book7.subject);
									   	   System.out.println(book7.pno);
		                                }



					                break;

							        default:
							    	System.out.println("Invalid choice");
							    	break;
							    }
							    System.out.println("If you want to continue press 1 else 2");
							    continu=sc.nextInt();
							    }
							    while(continu==1);

				}
				else
				{
					System.out.println("invalid credentials");
				}
		}


}


class library_management_system
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
        int x=1;

        librarian l=new librarian();


        do
        {
		System.out.println("Press 1 if you are librarian or Press 2 if you are student");
		int a=sc.nextInt();

		switch(a)
		{
			case 1:

			   l.liblogin();

			break;

			case 2:

			   l.stulogin();

			break;

		    default:

			   System.out.println("Invalid choice");

			break;
		}
		System.out.println("press 1 to continue else press 2 to exit");
	    }
	    while(x==1);
	}
}