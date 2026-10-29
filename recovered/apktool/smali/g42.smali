.class public final Lg42;
.super Lam0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final b:Lxp;

.field public final c:Ljp;


# direct methods
.method public constructor <init>(Lxp;Ljp;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lam0;-><init>(Lxp;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg42;->b:Lxp;

    .line 5
    .line 6
    iput-object p2, p0, Lg42;->c:Ljp;

    .line 7
    .line 8
    invoke-interface {p2}, Lhp;->u()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lhp;->l:Llf;

    .line 12
    .line 13
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-interface {p2, p0, p1}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object p0, Lhp;->m:Llf;

    .line 25
    .line 26
    invoke-interface {p2, p0, p1}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final c()Lxp;
    .locals 0

    .line 1
    iget-object p0, p0, Lg42;->b:Lxp;

    .line 2
    .line 3
    return-object p0
.end method
