.class public final Lwl1;
.super Ljg1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public final addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Ljg1;->a(IIILjava/lang/CharSequence;)Lsg1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Ljm1;

    .line 6
    .line 7
    iget-object p3, p0, Ljg1;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {p2, p3, p0, p1}, Lhi2;-><init>(Landroid/content/Context;Ljg1;Lsg1;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p1, Lsg1;->o:Lhi2;

    .line 13
    .line 14
    iget-object p0, p1, Lsg1;->e:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-virtual {p2, p0}, Lhi2;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 17
    .line 18
    .line 19
    return-object p2
.end method
