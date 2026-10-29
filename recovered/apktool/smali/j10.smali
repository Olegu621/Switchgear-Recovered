.class public final Lj10;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Loz2;


# instance fields
.field public final a:Lx80;

.field public final b:Lgl2;

.field public final c:Lgr0;

.field public final d:Lac2;


# direct methods
.method public constructor <init>(Lx80;Lgl2;Lgr0;Lac2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lj10;->a:Lx80;

    .line 14
    .line 15
    iput-object p2, p0, Lj10;->b:Lgl2;

    .line 16
    .line 17
    iput-object p3, p0, Lj10;->c:Lgr0;

    .line 18
    .line 19
    iput-object p4, p0, Lj10;->d:Lac2;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lo;Lf8;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqh;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v0, p0, p1, v1, v2}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lj10;->a:Lx80;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Loc;

    .line 18
    .line 19
    invoke-direct {v0, v2, p0, p2}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, Loc;

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-direct {p2, v0, p0, p3}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final b()Lhu1;
    .locals 0

    .line 1
    iget-object p0, p0, Lj10;->d:Lac2;

    .line 2
    .line 3
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 4
    .line 5
    iget-object p0, p0, Lk61;->i:Lij;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lij;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lac1;

    .line 12
    .line 13
    iget-object p0, p0, Lac1;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lhu1;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method
