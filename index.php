<?php


$gfg_folderpath ="java1/";
// CHECKING WHETHER PATH IS A DIRECTORY OR NOT=1
if (is_dir($gfg_folderpath)) {
    // GETTING INTO DIRECTORY
    $files = opendir($gfg_folderpath); {
        // CHECKING FOR SMOOTH OPENING OF DIRECTORY
        if ($files) {
            //READING NAMES OF EACH ELEMENT INSIDE THE DIRECTORY
            while (($gfg_subfolder = readdir($files)) !== FALSE) {
                // CHECKING FOR FILENAME ERRORS
             if ($gfg_subfolder != '.' && $gfg_subfolder != '..') {

                 
                   //Open Subfolder
                    $dirpath = "hipo/" . $gfg_subfolder . "/";
                 
                   $file_path_1 = basename($dirpath);  
                   $extension_1 = pathinfo($file_path_1, PATHINFO_EXTENSION);
                   if($extension_1 != "java" && $extension_1 != "xml" && $extension_1 != ""){
                            echo $file_path_1;
                            echo "<br>";
                    }

                 
                                 
                    // GETTING INSIDE EACH SUBFOLDERS=2
                    if (is_dir($dirpath)) {
                        $file = opendir($dirpath); {
                            if ($file) {
                             //READING NAMES OF EACH FILE INSIDE SUBFOLDERS
                             while (($gfg_filename = readdir($file)) !== FALSE) {
                                 if ($gfg_filename != '.' && $gfg_filename != '..') {

                                     
                                     
                                            //Open Subfolder if exists
                                           $dirpath_2 = "hipo/" . $gfg_subfolder . "/" .$gfg_filename . "/" ;                                                             
                                          $file_path_2 = basename($dirpath_2);  
                                           $extension_2 = pathinfo($file_path_2, PATHINFO_EXTENSION);
                                           if($extension_2 != "java" && $extension_2 != "xml" && $extension_2 != ""){
                                                    echo $file_path_2;
                                                    echo "<br>";
                                            }

                                     
                                     
                                     
                                     
                                     
                                            // GETTING INSIDE EACH SUBFOLDERS=3
                                            if (is_dir($dirpath_2)) {
                                              $file_2 = opendir($dirpath_2); {
                                              if ($file_2) {
                                                   //READING NAMES OF EACH FILE INSIDE SUBFOLDERS
                                                   while (($gfg_filename_2 = readdir($file_2)) !== FALSE) {
                                                   if ($gfg_filename_2 != '.' && $gfg_filename_2 != '..') {

                                                       
                                                       
                                                       
                                                              //Open Subfolder if exists
                                                              $dirpath_3 = "hipo/" . $gfg_subfolder . "/" .$gfg_filename . "/" . $gfg_filename_2 . "/";
                                                       
                                                              $file_path_3 = basename($dirpath_3);  
                                                              $extension_3 = pathinfo($file_path_3, PATHINFO_EXTENSION);
                                                              if($extension_3 != "java" && $extension_3 != "xml" && $extension_3 != ""){
                                                                        echo $file_path_3;
                                                                        echo "<br>";
                                                              }
                                                        
                                                       
                                                       
                                                       
                                                       
                                                              // GETTING INSIDE EACH SUBFOLDERS-4
                                                              if (is_dir($dirpath_3)) {
                                                                   $file_3 = opendir($dirpath_3); {
                                                                        if ($file_3) {
                                                                              //READING NAMES OF EACH FILE INSIDE SUBFOLDERS
                                                                               while (($gfg_filename_3 = readdir($file_3)) !== FALSE) {
                                                                                    if ($gfg_filename_3 != '.' && $gfg_filename_3 != '..') {

                                                                                                                                                                               
                                                                                                                                                                         
                                                                         //Open Subfolder if exists
                                                                         $dirpath_4 = "hipo/".$gfg_subfolder."/".$gfg_filename."/".$gfg_filename_2."/".$gfg_filename_3."/";
                                                                         $file_path_4 = basename($dirpath_4);  
                                                                         $extension_4 = pathinfo($file_path_4, PATHINFO_EXTENSION);
                                                                         if($extension_4 != "java" && $extension_4 != "xml" && $extension_4 != ""){
                                                                                 echo $file_path_4;
                                                                                 echo "<br>";
                                                                         }
                                                       
                                                                                        
                                                                                        
                                                                                              // GETTING INSIDE EACH SUBFOLDERS-5
                                                                                              if (is_dir($dirpath_4)) {
                                                                                                   $file_4 = opendir($dirpath_4); {
                                                                                                          if ($file_4) {
                                                                                                              //READING NAMES OF EACH FILE INSIDE SUBFOLDERS
                                                                                                               while (($gfg_filename_4 = readdir($file_4)) !== FALSE) {
                                                                                                                   if ($gfg_filename_4 != '.' && $gfg_filename_4 != '..') {
                                                                                                                    
                                                                                                          
                                                 $dirpath_5 = "hipo/".$gfg_subfolder."/".$gfg_filename."/".$gfg_filename_2."/".$gfg_filename_3."/".$gfg_filename_4."/";
                                                 $file_path_5 = basename($dirpath_5);

                                                
                                                                                                                       
                                                 $extension_5 = pathinfo($file_path_5, PATHINFO_EXTENSION);
                                                 if($extension_5 != "java" && $extension_5 != "xml" && $extension_5 != ""){
                                                      echo $file_path_5;
                                                      echo "<br>";   
                           
                                                      $file_contents = file_get_contents($file_path_5);
                                                      echo "<br>"; 
                                                
                                                 }
                                                                 
                                                                                                                       
                                                                                                                       
                                                                                                                       
                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                                                                                                    // GETTING INSIDE EACH SUBFOLDERS-6
                                                                                                   if (is_dir($dirpath_5)) {
                                                                                                   $file_5 = opendir($dirpath_5); {
                                                                                                          if ($file_5) {
                                                                                                              //READING NAMES OF EACH FILE INSIDE SUBFOLDERS
                                                                                                               while (($gfg_filename_5 = readdir($file_5)) !== FALSE) {
                                                                                                                   if ($gfg_filename_5 != '.' && $gfg_filename_5 != '..') {
                                                                                                                    
                                                                                                          
                                $dirpath_6 = "hipo/".$gfg_subfolder."/".$gfg_filename."/".$gfg_filename_2."/".$gfg_filename_3."/".$gfg_filename_4."/".$gfg_filename_5."/";
                                $file_path_6 = basename($dirpath_6);

                                                
                                                                                                                       
                                                 $extension_6 = pathinfo($file_path_6, PATHINFO_EXTENSION);
                                                 if($extension_6 != "java" && $extension_6 != "xml" && $extension_6 != ""){
                                                      echo $file_path_6;
                                                      echo "<br>";
                                                
                                                 }
                                                                                                                       
                                                                                                                    }                 
                                                                                                                }
                                                                                                       }
                                                                                                   }
                                                                                                }
                                                                                                 echo "<br>";
                                                                                                 
                                                                                                                       
                                                                                                                       
                                                                                                                       
                                                                                                                       
                                                                                                                       
                                                                                                                       
                                                                                                                    }                 
                                                                                                                }
                                                                                                       }
                                                                                                   }
                                                                                                }
                                                                                                 echo "<br>";
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                     }                 
                                                                                }
                                                                            }
                                                                       }
                                                                  }
                                                                  echo "<br>";
                                                       
                                                               
                                                      }                 
                                                   }
                                                 }
                                               }
                                             }
                                             echo "<br>";
                                }
                            }
                         }
                      }
                   }
                    echo "<br>";
                }
            }
        }
    }
}





