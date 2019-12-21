package org.group1;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class j1 extends javax.swing.JFrame {

    javax.swing.JFrame frame;

    public j1() {
        initComponents();
        jPanel2.setBackground(new Color(153, 153, 153, 100));
    }

    public j1(javax.swing.JFrame frame, TableModel tableModel) {
        initComponents();
        this.frame = frame;
        table.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AdressPane = new javax.swing.JScrollPane();
        Adress = new javax.swing.JTextPane();
        AnnotePane = new javax.swing.JScrollPane();
        Annote = new javax.swing.JTextPane();
        AuthorPane = new javax.swing.JScrollPane();
        Author = new javax.swing.JTextPane();
        BooktitlePane = new javax.swing.JScrollPane();
        Booktitle = new javax.swing.JTextPane();
        ChapterPane = new javax.swing.JScrollPane();
        Chapter = new javax.swing.JTextPane();
        CrossrefPane = new javax.swing.JScrollPane();
        Crossref = new javax.swing.JTextPane();
        DoiPane = new javax.swing.JScrollPane();
        Doi = new javax.swing.JTextPane();
        EditionPane = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextPane();
        EditorPane = new javax.swing.JScrollPane();
        Editor = new javax.swing.JTextPane();
        EprintPane = new javax.swing.JScrollPane();
        Eprint = new javax.swing.JTextPane();
        HowpublishedPane = new javax.swing.JScrollPane();
        Howpublished = new javax.swing.JTextPane();
        InstitutationPane = new javax.swing.JScrollPane();
        Institution = new javax.swing.JTextPane();
        JournalPane = new javax.swing.JScrollPane();
        Journal = new javax.swing.JTextPane();
        KeyPane = new javax.swing.JScrollPane();
        Key = new javax.swing.JTextPane();
        MonthPane = new javax.swing.JScrollPane();
        Month = new javax.swing.JTextPane();
        NotePane = new javax.swing.JScrollPane();
        Note = new javax.swing.JTextPane();
        NumberPane = new javax.swing.JScrollPane();
        Number = new javax.swing.JTextPane();
        OrganizationPane = new javax.swing.JScrollPane();
        Organization = new javax.swing.JTextPane();
        PagePane = new javax.swing.JScrollPane();
        Pages = new javax.swing.JTextPane();
        PublisherPane = new javax.swing.JScrollPane();
        Publisher = new javax.swing.JTextPane();
        SchoolPane = new javax.swing.JScrollPane();
        School = new javax.swing.JTextPane();
        SeriesPane = new javax.swing.JScrollPane();
        Series = new javax.swing.JTextPane();
        TitlePane = new javax.swing.JScrollPane();
        Title = new javax.swing.JTextPane();
        TypePane = new javax.swing.JScrollPane();
        Type = new javax.swing.JTextPane();
        UrlPane = new javax.swing.JScrollPane();
        Url = new javax.swing.JTextPane();
        VolumePane = new javax.swing.JScrollPane();
        Volume = new javax.swing.JTextPane();
        YearPane = new javax.swing.JScrollPane();
        Year = new javax.swing.JTextPane();
        Plus1 = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Butons = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1526, 897));

        jPanel1.setLayout(null);

        table.setBackground(new java.awt.Color(153, 153, 153));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setForeground(new java.awt.Color(0, 0, 0, 80));
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Adress", "Annote", "Author", "Booktitle", "Chapter", "Crossref", "Doi", "Edition", "Editor", "Eprint", "Howpublished", "Institution", "Journal", "Key", "Month", "Note", "Number", "Organization", "Pages", "Publisher", "School", "Series", "Title", "Type", "url", "Volume", "Year"
                }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setEditingColumn(9);
        table.setRowHeight(40);
        jScrollPane11.setViewportView(table);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(450, 140, 1050, 670);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153, 100));
        jPanel2.setMaximumSize(new java.awt.Dimension(266, 710));
        jPanel2.setMinimumSize(new java.awt.Dimension(266, 710));
        jPanel2.setLayout(null);

        Adress.setBackground(new java.awt.Color(153, 153, 153));
        Adress.setText("Adress");
        Adress.setToolTipText("");
        Adress.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Adress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdressFocusLost(evt);
            }
        });
        AdressPane.setViewportView(Adress);
        Adress.getAccessibleContext().setAccessibleName("");

        jPanel2.add(AdressPane);
        AdressPane.setBounds(10, 20, 180, 35);

        Annote.setBackground(new java.awt.Color(153, 153, 153));
        Annote.setText("Annote");
        Annote.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Annote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AnnoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AnnoteFocusLost(evt);
            }
        });
        AnnotePane.setViewportView(Annote);
        Annote.getAccessibleContext().setAccessibleName("");

        jPanel2.add(AnnotePane);
        AnnotePane.setBounds(200, 20, 190, 30);

        Author.setBackground(new java.awt.Color(153, 153, 153));
        Author.setText("Author");
        Author.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Author.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AuthorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AuthorFocusLost(evt);
            }
        });
        AuthorPane.setViewportView(Author);

        jPanel2.add(AuthorPane);
        AuthorPane.setBounds(10, 60, 180, 35);

        Booktitle.setBackground(new java.awt.Color(153, 153, 153));
        Booktitle.setText("Booktitle");
        Booktitle.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Booktitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BooktitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BooktitleFocusLost(evt);
            }
        });
        BooktitlePane.setViewportView(Booktitle);

        jPanel2.add(BooktitlePane);
        BooktitlePane.setBounds(200, 55, 190, 40);

        Chapter.setBackground(new java.awt.Color(153, 153, 153));
        Chapter.setText("Chapter");
        Chapter.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Chapter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ChapterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ChapterFocusLost(evt);
            }
        });
        ChapterPane.setViewportView(Chapter);

        jPanel2.add(ChapterPane);
        ChapterPane.setBounds(10, 100, 180, 35);

        Crossref.setBackground(new java.awt.Color(153, 153, 153));
        Crossref.setText("Crossref");
        Crossref.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Crossref.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CrossrefFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CrossrefFocusLost(evt);
            }
        });
        CrossrefPane.setViewportView(Crossref);

        jPanel2.add(CrossrefPane);
        CrossrefPane.setBounds(200, 100, 190, 35);

        Doi.setBackground(new java.awt.Color(153, 153, 153));
        Doi.setText("Doi");
        Doi.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Doi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DoiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DoiFocusLost(evt);
            }
        });
        DoiPane.setViewportView(Doi);

        jPanel2.add(DoiPane);
        DoiPane.setBounds(10, 140, 180, 35);

        Edition.setBackground(new java.awt.Color(153, 153, 153));
        Edition.setText("Edition");
        Edition.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Edition.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditionFocusLost(evt);
            }
        });
        EditionPane.setViewportView(Edition);

        jPanel2.add(EditionPane);
        EditionPane.setBounds(200, 140, 190, 35);

        Editor.setBackground(new java.awt.Color(153, 153, 153));
        Editor.setText("Editor");
        Editor.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Editor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditorFocusLost(evt);
            }
        });
        EditorPane.setViewportView(Editor);

        jPanel2.add(EditorPane);
        EditorPane.setBounds(10, 180, 180, 35);

        Eprint.setBackground(new java.awt.Color(153, 153, 153));
        Eprint.setText("Eprint");
        Eprint.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Eprint.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EprintFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EprintFocusLost(evt);
            }
        });
        EprintPane.setViewportView(Eprint);

        jPanel2.add(EprintPane);
        EprintPane.setBounds(10, 620, 180, 40);

        Howpublished.setBackground(new java.awt.Color(153, 153, 153));
        Howpublished.setText("Howpublished");
        Howpublished.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Howpublished.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HowpublishedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HowpublishedFocusLost(evt);
            }
        });
        HowpublishedPane.setViewportView(Howpublished);

        jPanel2.add(HowpublishedPane);
        HowpublishedPane.setBounds(200, 270, 190, 40);

        Institution.setBackground(new java.awt.Color(153, 153, 153));
        Institution.setText("Institution");
        Institution.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Institution.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InstitutionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InstitutionFocusLost(evt);
            }
        });
        InstitutationPane.setViewportView(Institution);

        jPanel2.add(InstitutationPane);
        InstitutationPane.setBounds(200, 220, 190, 40);

        Journal.setBackground(new java.awt.Color(153, 153, 153));
        Journal.setText("Journal");
        Journal.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Journal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JournalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JournalFocusLost(evt);
            }
        });
        JournalPane.setViewportView(Journal);

        jPanel2.add(JournalPane);
        JournalPane.setBounds(10, 220, 180, 40);

        Key.setBackground(new java.awt.Color(153, 153, 153));
        Key.setText("Key");
        Key.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Key.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KeyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                KeyFocusLost(evt);
            }
        });
        KeyPane.setViewportView(Key);

        jPanel2.add(KeyPane);
        KeyPane.setBounds(200, 180, 190, 35);

        Month.setBackground(new java.awt.Color(153, 153, 153));
        Month.setText("Month");
        Month.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MonthFocusLost(evt);
            }
        });
        MonthPane.setViewportView(Month);

        jPanel2.add(MonthPane);
        MonthPane.setBounds(10, 270, 180, 40);

        Note.setBackground(new java.awt.Color(153, 153, 153));
        Note.setText("Note");
        Note.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Note.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NoteFocusLost(evt);
            }
        });
        NotePane.setViewportView(Note);

        jPanel2.add(NotePane);
        NotePane.setBounds(10, 320, 180, 40);

        Number.setBackground(new java.awt.Color(153, 153, 153));
        Number.setText("Number");
        Number.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumberFocusLost(evt);
            }
        });
        NumberPane.setViewportView(Number);

        jPanel2.add(NumberPane);
        NumberPane.setBounds(200, 320, 190, 40);

        Organization.setBackground(new java.awt.Color(153, 153, 153));
        Organization.setText("Organization");
        Organization.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Organization.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OrganizationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                OrganizationFocusLost(evt);
            }
        });
        OrganizationPane.setViewportView(Organization);

        jPanel2.add(OrganizationPane);
        OrganizationPane.setBounds(10, 370, 180, 40);

        Pages.setBackground(new java.awt.Color(153, 153, 153));
        Pages.setText("Pages");
        Pages.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Pages.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PagesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PagesFocusLost(evt);
            }
        });
        PagePane.setViewportView(Pages);

        jPanel2.add(PagePane);
        PagePane.setBounds(200, 370, 190, 40);

        Publisher.setBackground(new java.awt.Color(153, 153, 153));
        Publisher.setText("Publisher");
        Publisher.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Publisher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PublisherFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PublisherFocusLost(evt);
            }
        });
        PublisherPane.setViewportView(Publisher);

        jPanel2.add(PublisherPane);
        PublisherPane.setBounds(10, 420, 180, 40);

        School.setBackground(new java.awt.Color(153, 153, 153));
        School.setText("School");
        School.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        School.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SchoolFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SchoolFocusLost(evt);
            }
        });
        SchoolPane.setViewportView(School);

        jPanel2.add(SchoolPane);
        SchoolPane.setBounds(200, 420, 190, 40);

        Series.setBackground(new java.awt.Color(153, 153, 153));
        Series.setText("Series");
        Series.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Series.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeriesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SeriesFocusLost(evt);
            }
        });
        SeriesPane.setViewportView(Series);

        jPanel2.add(SeriesPane);
        SeriesPane.setBounds(10, 470, 180, 40);

        Title.setBackground(new java.awt.Color(153, 153, 153));
        Title.setText("Title");
        Title.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Title.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TitleFocusLost(evt);
            }
        });
        TitlePane.setViewportView(Title);

        jPanel2.add(TitlePane);
        TitlePane.setBounds(200, 470, 190, 40);

        Type.setBackground(new java.awt.Color(153, 153, 153));
        Type.setText("Type");
        Type.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Type.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TypeFocusLost(evt);
            }
        });
        TypePane.setViewportView(Type);

        jPanel2.add(TypePane);
        TypePane.setBounds(10, 520, 180, 40);

        Url.setBackground(new java.awt.Color(153, 153, 153));
        Url.setText("Url");
        Url.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Url.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UrlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UrlFocusLost(evt);
            }
        });
        UrlPane.setViewportView(Url);

        jPanel2.add(UrlPane);
        UrlPane.setBounds(200, 520, 190, 40);

        Volume.setBackground(new java.awt.Color(153, 153, 153));
        Volume.setText("Volume");
        Volume.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Volume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                VolumeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                VolumeFocusLost(evt);
            }
        });
        VolumePane.setViewportView(Volume);

        jPanel2.add(VolumePane);
        VolumePane.setBounds(10, 570, 180, 40);

        Year.setBackground(new java.awt.Color(153, 153, 153));
        Year.setText("Year");
        Year.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                YearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                YearFocusLost(evt);
            }
        });
        YearPane.setViewportView(Year);

        jPanel2.add(YearPane);
        YearPane.setBounds(200, 570, 190, 40);

        Plus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plusicon.png"))); // NOI18N
        Plus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Plus1MouseClicked(evt);
            }
        });
        jPanel2.add(Plus1);
        Plus1.setBounds(310, 650, 83, 71);

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebutton.png"))); // NOI18N
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    SaveMouseListener(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        jPanel2.add(Save);
        Save.setBounds(100, 740, 214, 56);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 30, 410, 820);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1410, 20, 50, 60);

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trashicon.png"))); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(1350, 60, 40, 40);

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeicon1.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeclick(evt);
            }
        });
        jPanel1.add(Home);
        Home.setBounds(1280, 30, 50, 40);

        Butons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttoncontainer41.png"))); // NOI18N
        jPanel1.add(Butons);
        Butons.setBounds(1260, 30, 210, 70);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        Background.setToolTipText("");
        jPanel1.add(Background);
        Background.setBounds(-10, 0, 1560, 870);

        jScrollPane1.setOpaque(false);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 280, 500);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1526, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeclick
        j2 newFrame = new j2(this, table.getModel());
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeclick

    private void SaveMouseListener(java.awt.event.MouseEvent evt) throws IOException {//GEN-FIRST:event_Plus1MouseClicked
        String fileName = JOptionPane.showInputDialog("Enter file name");
        if (fileName.toCharArray().length < 4) {
            JOptionPane.showMessageDialog(frame, "FILE NAME CAN NOT CONTAIN LESS THAN 4 CHARACTERS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
        if (fileName != null) {
            if (!fileName.substring(fileName.length() - 4).equals(".bib"))
                fileName += ".bib";

            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Export bibtex File");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {


                File newFile = new File(chooser.getSelectedFile().toPath() + "/" + fileName);

                GUI.library.setName(fileName);
                BibTeXUtil.format(GUI.library, newFile);
            } else {
                JOptionPane.showMessageDialog(frame, "NO SELECTION!", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    }

    private void Plus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Plus1MouseClicked


        if (!Type.getText().equals("Type")) {
            DefaultTableModel model = (DefaultTableModel) this.table.getModel();
            model.addRow(new Object[]{
                    Adress.getText().equals("Address") ? "" : Adress.getText(),
                    Annote.getText().equals("Annote") ? "" : Annote.getText(),
                    Author.getText().equals("Author") ? "" : Author.getText(),
                    Booktitle.getText().equals("Booktitle") ? "" : Booktitle.getText(),
                    Chapter.getText().equals("Chapter") ? "" : Chapter.getText(),
                    Crossref.getText().equals("Crossref") ? "" : Crossref.getText(),
                    Doi.getText().equals("Doi") ? "" : Doi.getText(),
                    Edition.getText().equals("Edition") ? "" : Edition.getText(),
                    Editor.getText().equals("Editor") ? "" : Editor.getText(),
                    Eprint.getText().equals("Eprint") ? "" : Eprint.getText(),
                    Howpublished.getText().equals("Howpublished") ? "" : Howpublished.getText(),
                    Institution.getText().equals("Institution") ? "" : Institution.getText(),
                    Journal.getText().equals("Journal") ? "" : Journal.getText(),
                    Key.getText().equals("Key") ? "" : Key.getText(),
                    Month.getText().equals("Month") ? "" : Month.getText(),
                    Note.getText().equals("Note") ? "" : Note.getText(),
                    Number.getText().equals("Number") ? "" : Number.getText(),
                    Organization.getText().equals("Organization") ? "" : Organization.getText(),
                    Pages.getText().equals("Pages") ? "" : Pages.getText(),
                    Publisher.getText().equals("Publisher") ? "" : Publisher.getText(),
                    School.getText().equals("School") ? "" : School.getText(),
                    Series.getText().equals("Series") ? "" : Series.getText(),
                    Title.getText().equals("Title") ? "" : Title.getText(),
                    Type.getText().equals("Type") ? "" : Type.getText(),
                    Url.getText().equals("Url") ? "" : Url.getText(),
                    Volume.getText().equals("Volume") ? "" : Volume.getText(),
                    Year.getText().equals("Year") ? "" : Year.getText(),
            });

            BibTeXObject object = new BibTeXObject();
            for (int i = 0; i < this.table.getModel().getColumnCount(); i++) {
                String id = BibTeXUtil.getIdentifier(this.table.getModel().getColumnName(i));

                if (id.equals("type"))
                    object.setType(this.table.getValueAt(this.table.getRowCount() - 1, i).toString());
                else if (id.equals("key"))
                    object.setKey(this.table.getValueAt(this.table.getRowCount() - 1, i).toString());
                else {
                    if (!this.table.getValueAt(this.table.getRowCount() - 1, i).toString().equals(""))
                        object.addField(id, this.table.getValueAt(this.table.getRowCount() - 1, i).toString());
                }
            }
            GUI.library.addToLibrary(object);


            Adress.setText("");
            Annote.setText("");
            Author.setText("");
            Booktitle.setText("");
            Chapter.setText("");
            Crossref.setText("");
            Doi.setText("");
            Edition.setText("");
            Editor.setText("");
            Eprint.setText("");
            Howpublished.setText("");
            Institution.setText("");
            Journal.setText("");
            Key.setText("");
            Month.setText("");
            Note.setText("");
            Number.setText("");
            Organization.setText("");
            Pages.setText("");
            Publisher.setText("");
            School.setText("");
            Series.setText("");
            Title.setText("");
            Type.setText("");
            Url.setText("");
            Volume.setText("");
            Year.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "TYPE CAN NOT BE EMPTY!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Plus1MouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int rowIndex = table.getSelectedRow();
        if (rowIndex == -1) {
            return; // no row seleted
        }
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
        model.removeRow(rowIndex);
        GUI.library.removeFromListEntries(rowIndex);
    }//GEN-LAST:event_DeleteMouseClicked

    private void AdressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdressFocusGained
        // TODO add your handling code here:
        if (Adress.getText().equals("Adress")) {
            Adress.setText("");
        }
    }//GEN-LAST:event_AdressFocusGained

    private void AnnoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnnoteFocusGained
        // TODO add your handling code here:
        if (Annote.getText().equals("Annote")) {
            Annote.setText("");
        }
    }//GEN-LAST:event_AnnoteFocusGained

    private void AdressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdressFocusLost
        // TODO add your handling code here:
        if (Adress.getText().equals("Adress")) {
            Adress.setText("Adress");
        }

    }//GEN-LAST:event_AdressFocusLost

    private void AnnoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnnoteFocusLost
        // TODO add your handling code here:
        if (Annote.getText().equals("")) {
            Annote.setText("Annote");
        }
    }//GEN-LAST:event_AnnoteFocusLost

    private void AuthorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AuthorFocusGained
        // TODO add your handling code here:
        if (Author.getText().equals("Author")) {
            Author.setText("");
        }

    }//GEN-LAST:event_AuthorFocusGained

    private void AuthorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AuthorFocusLost
        // TODO add your handling code here:
        if (Author.getText().equals("")) {
            Author.setText("Author");
        }

    }//GEN-LAST:event_AuthorFocusLost

    private void BooktitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BooktitleFocusGained
        // TODO add your handling code here:
        if (Booktitle.getText().equals("Booktitle")) {
            Booktitle.setText("");
        }
    }//GEN-LAST:event_BooktitleFocusGained

    private void BooktitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BooktitleFocusLost
        // TODO add your handling code here:
        if (Booktitle.getText().equals("")) {
            Booktitle.setText("Booktitle");
        }

    }//GEN-LAST:event_BooktitleFocusLost

    private void ChapterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ChapterFocusGained
        // TODO add your handling code here:
        if (Chapter.getText().equals("Chapter")) {
            Chapter.setText("");
        }
    }//GEN-LAST:event_ChapterFocusGained

    private void ChapterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ChapterFocusLost

        // TODO add your handling code here:
        if (Chapter.getText().equals("")) {
            Chapter.setText("Chapter");
        }
    }//GEN-LAST:event_ChapterFocusLost

    private void CrossrefFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CrossrefFocusGained
        // TODO add your handling code here:
        if (Crossref.getText().equals("Crossref")) {
            Crossref.setText("");
        }
    }//GEN-LAST:event_CrossrefFocusGained

    private void CrossrefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CrossrefFocusLost
        // TODO add your handling code here:
        if (Crossref.getText().equals("")) {
            Crossref.setText("Crossref");
        }
    }//GEN-LAST:event_CrossrefFocusLost

    private void DoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoiFocusGained
        // TODO add your handling code here:
        if (Doi.getText().equals("Doi")) {
            Doi.setText("");
        }
    }//GEN-LAST:event_DoiFocusGained

    private void DoiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoiFocusLost
        // TODO add your handling code here:
        if (Doi.getText().equals("")) {
            Doi.setText("Doi");
        }
    }//GEN-LAST:event_DoiFocusLost

    private void EditionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditionFocusGained
        // TODO add your handling code here:
        if (Edition.getText().equals("Edition")) {
            Edition.setText("");
        }
    }//GEN-LAST:event_EditionFocusGained

    private void EditionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditionFocusLost
        // TODO add your handling code here:
        if (Edition.getText().equals("")) {
            Edition.setText("Edition");
        }
    }//GEN-LAST:event_EditionFocusLost

    private void EditorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditorFocusGained
        // TODO add your handling code here:
        if (Editor.getText().equals("Editor")) {
            Editor.setText("");
        }
    }//GEN-LAST:event_EditorFocusGained

    private void EditorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditorFocusLost
        // TODO add your handling code here:
        if (Editor.getText().equals("")) {
            Editor.setText("Editor");
        }
    }//GEN-LAST:event_EditorFocusLost

    private void JournalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JournalFocusGained
        // TODO add your handling code here:
        if (Journal.getText().equals("Journal")) {
            Journal.setText("");
        }
    }//GEN-LAST:event_JournalFocusGained

    private void JournalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JournalFocusLost
        // TODO add your handling code here:
        if (Journal.getText().equals("")) {
            Journal.setText("Journal");
        }

    }//GEN-LAST:event_JournalFocusLost

    private void KeyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KeyFocusGained
        // TODO add your handling code here:
        if (Key.getText().equals("Key")) {
            Key.setText("");
        }
    }//GEN-LAST:event_KeyFocusGained

    private void KeyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KeyFocusLost
        // TODO add your handling code here:
        if (Key.getText().equals("")) {
            Key.setText("Key");
        }
    }//GEN-LAST:event_KeyFocusLost

    private void InstitutionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InstitutionFocusGained
        // TODO add your handling code here:
        if (Institution.getText().equals("Institution")) {
            Institution.setText("");
        }
    }//GEN-LAST:event_InstitutionFocusGained

    private void InstitutionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InstitutionFocusLost
        // TODO add your handling code here:
        if (Institution.getText().equals("")) {
            Institution.setText("Key");
        }
    }//GEN-LAST:event_InstitutionFocusLost

    private void HowpublishedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HowpublishedFocusGained
        // TODO add your handling code here:
        if (Howpublished.getText().equals("Howpublished")) {
            Howpublished.setText("");
        }
    }//GEN-LAST:event_HowpublishedFocusGained

    private void HowpublishedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HowpublishedFocusLost
        // TODO add your handling code here:
        if (Howpublished.getText().equals("")) {
            Howpublished.setText("Howpublished");
        }
    }//GEN-LAST:event_HowpublishedFocusLost

    private void MonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MonthFocusGained
        // TODO add your handling code here:
        if (Month.getText().equals("Month")) {
            Month.setText("");
        }
    }//GEN-LAST:event_MonthFocusGained

    private void MonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MonthFocusLost
        // TODO add your handling code here:
        if (Month.getText().equals("")) {
            Month.setText("Month");
        }
    }//GEN-LAST:event_MonthFocusLost

    private void EprintFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EprintFocusGained
        // TODO add your handling code here:
        if (Eprint.getText().equals("Eprint")) {
            Eprint.setText("");
        }
    }//GEN-LAST:event_EprintFocusGained

    private void EprintFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EprintFocusLost
        // TODO add your handling code here:
        if (Eprint.getText().equals("")) {
            Eprint.setText("Eprint");
        }
    }//GEN-LAST:event_EprintFocusLost

    private void NoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NoteFocusGained
        // TODO add your handling code here:
        if (Note.getText().equals("Note")) {
            Note.setText("");
        }
    }//GEN-LAST:event_NoteFocusGained

    private void NoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NoteFocusLost
        // TODO add your handling code here:
        if (Note.getText().equals("")) {
            Note.setText("Note");
        }
    }//GEN-LAST:event_NoteFocusLost

    private void NumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberFocusGained
        // TODO add your handling code here:
        if (Number.getText().equals("Number")) {
            Number.setText("");
        }
    }//GEN-LAST:event_NumberFocusGained

    private void NumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberFocusLost
        // TODO add your handling code here:
        if (Number.getText().equals("")) {
            Number.setText("Number");
        }
    }//GEN-LAST:event_NumberFocusLost

    private void OrganizationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrganizationFocusGained
        // TODO add your handling code here:
        if (Organization.getText().equals("Organization")) {
            Organization.setText("");
        }
    }//GEN-LAST:event_OrganizationFocusGained

    private void OrganizationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrganizationFocusLost
        // TODO add your handling code here:
        if (Organization.getText().equals("")) {
            Organization.setText("Organization");
        }
    }//GEN-LAST:event_OrganizationFocusLost

    private void PagesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagesFocusGained
        // TODO add your handling code here:
        if (Pages.getText().equals("Pages")) {
            Pages.setText("");
        }
    }//GEN-LAST:event_PagesFocusGained

    private void PagesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagesFocusLost
        // TODO add your handling code here:
        if (Pages.getText().equals("")) {
            Pages.setText("Pages");
        }
    }//GEN-LAST:event_PagesFocusLost

    private void PublisherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PublisherFocusGained
        // TODO add your handling code here:
        if (Publisher.getText().equals("Publisher")) {
            Publisher.setText("");
        }
    }//GEN-LAST:event_PublisherFocusGained

    private void PublisherFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PublisherFocusLost
        // TODO add your handling code here:
        if (Publisher.getText().equals("")) {
            Publisher.setText("Publisher");
        }
    }//GEN-LAST:event_PublisherFocusLost

    private void SchoolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SchoolFocusGained
        // TODO add your handling code here:
        if (School.getText().equals("School")) {
            School.setText("");
        }
    }//GEN-LAST:event_SchoolFocusGained

    private void SchoolFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SchoolFocusLost
        // TODO add your handling code here:
        if (School.getText().equals("")) {
            School.setText("School");
        }
    }//GEN-LAST:event_SchoolFocusLost

    private void SeriesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeriesFocusGained
        // TODO add your handling code here:
        if (Series.getText().equals("Series")) {
            School.setText("");
        }
    }//GEN-LAST:event_SeriesFocusGained

    private void SeriesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeriesFocusLost
        // TODO add your handling code here:
        if (Series.getText().equals("")) {
            Series.setText("Series");
        }
    }//GEN-LAST:event_SeriesFocusLost

    private void TitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TitleFocusGained
        // TODO add your handling code here:
        if (Title.getText().equals("Title")) {
            Title.setText("");
        }
    }//GEN-LAST:event_TitleFocusGained

    private void TitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TitleFocusLost
        // TODO add your handling code here:
        if (Title.getText().equals("")) {
            Title.setText("Title");
        }
    }//GEN-LAST:event_TitleFocusLost

    private void TypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TypeFocusGained
        // TODO add your handling code here:
        if (Type.getText().equals("")) {
            Type.setText("Type");
        }
    }//GEN-LAST:event_TypeFocusGained

    private void TypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TypeFocusLost
        // TODO add your handling code here:
        if (Type.getText().equals("")) {
            Type.setText("Title");
        }
    }//GEN-LAST:event_TypeFocusLost

    private void UrlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UrlFocusGained
        // TODO add your handling code here:
        if (Url.getText().equals("")) {
            Url.setText("Url");
        }
    }//GEN-LAST:event_UrlFocusGained

    private void UrlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UrlFocusLost
        // TODO add your handling code here:
        if (Url.getText().equals("")) {
            Url.setText("Url");
        }
    }//GEN-LAST:event_UrlFocusLost

    private void VolumeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VolumeFocusGained
        // TODO add your handling code here:
        if (Volume.getText().equals("")) {
            Volume.setText("Volume");
        }
    }//GEN-LAST:event_VolumeFocusGained

    private void VolumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VolumeFocusLost
        // TODO add your handling code here:
        if (Volume.getText().equals("")) {
            Volume.setText("Volume");
        }
    }//GEN-LAST:event_VolumeFocusLost

    private void YearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearFocusGained
        // TODO add your handling code here:
        if (Year.getText().equals("")) {
            Year.setText("Year");
        }
    }//GEN-LAST:event_YearFocusGained

    private void YearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearFocusLost
        // TODO add your handling code here:
        if (Year.getText().equals("")) {
            Year.setText("Year");
        }
    }//GEN-LAST:event_YearFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Adress;
    private javax.swing.JScrollPane AdressPane;
    private javax.swing.JTextPane Annote;
    private javax.swing.JScrollPane AnnotePane;
    private javax.swing.JTextPane Author;
    private javax.swing.JScrollPane AuthorPane;
    private javax.swing.JLabel Background;
    private javax.swing.JTextPane Booktitle;
    private javax.swing.JScrollPane BooktitlePane;
    private javax.swing.JLabel Butons;
    private javax.swing.JTextPane Chapter;
    private javax.swing.JScrollPane ChapterPane;
    private javax.swing.JTextPane Crossref;
    private javax.swing.JScrollPane CrossrefPane;
    private javax.swing.JLabel Delete;
    private javax.swing.JTextPane Doi;
    private javax.swing.JScrollPane DoiPane;
    private javax.swing.JTextPane Edition;
    private javax.swing.JScrollPane EditionPane;
    private javax.swing.JTextPane Editor;
    private javax.swing.JScrollPane EditorPane;
    private javax.swing.JTextPane Eprint;
    private javax.swing.JScrollPane EprintPane;
    private javax.swing.JLabel Home;
    private javax.swing.JTextPane Howpublished;
    private javax.swing.JScrollPane HowpublishedPane;
    private javax.swing.JScrollPane InstitutationPane;
    private javax.swing.JTextPane Institution;
    private javax.swing.JTextPane Journal;
    private javax.swing.JScrollPane JournalPane;
    private javax.swing.JTextPane Key;
    private javax.swing.JScrollPane KeyPane;
    private javax.swing.JTextPane Month;
    private javax.swing.JScrollPane MonthPane;
    private javax.swing.JTextPane Note;
    private javax.swing.JScrollPane NotePane;
    private javax.swing.JTextPane Number;
    private javax.swing.JScrollPane NumberPane;
    private javax.swing.JTextPane Organization;
    private javax.swing.JScrollPane OrganizationPane;
    private javax.swing.JScrollPane PagePane;
    private javax.swing.JTextPane Pages;
    private javax.swing.JLabel Plus1;
    private javax.swing.JTextPane Publisher;
    private javax.swing.JScrollPane PublisherPane;
    private javax.swing.JLabel Save;
    private javax.swing.JTextPane School;
    private javax.swing.JScrollPane SchoolPane;
    private javax.swing.JTextPane Series;
    private javax.swing.JScrollPane SeriesPane;
    private javax.swing.JTextPane Title;
    private javax.swing.JScrollPane TitlePane;
    private javax.swing.JTextPane Type;
    private javax.swing.JScrollPane TypePane;
    private javax.swing.JTextPane Url;
    private javax.swing.JScrollPane UrlPane;
    private javax.swing.JTextPane Volume;
    private javax.swing.JScrollPane VolumePane;
    private javax.swing.JTextPane Year;
    private javax.swing.JScrollPane YearPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
