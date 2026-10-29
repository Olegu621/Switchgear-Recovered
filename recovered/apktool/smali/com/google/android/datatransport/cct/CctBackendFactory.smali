.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public create(Lk20;)Lvr2;
    .locals 2

    .line 1
    new-instance p0, Las;

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, Lmf;

    .line 5
    .line 6
    iget-object v0, v0, Lmf;->a:Landroid/content/Context;

    .line 7
    .line 8
    check-cast p1, Lmf;

    .line 9
    .line 10
    iget-object v1, p1, Lmf;->b:Lyv;

    .line 11
    .line 12
    iget-object p1, p1, Lmf;->c:Lyv;

    .line 13
    .line 14
    invoke-direct {p0, v0, v1, p1}, Las;-><init>(Landroid/content/Context;Lyv;Lyv;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method
