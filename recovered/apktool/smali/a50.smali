.class public final La50;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lf22;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lf22;

.field public final synthetic e:Lb50;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lf22;Lb50;Ljava/lang/Object;ZLc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, La50;->d:Lf22;

    .line 2
    .line 3
    iput-object p2, p0, La50;->e:Lb50;

    .line 4
    .line 5
    iput-object p3, p0, La50;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p4, p0, La50;->i:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 6

    .line 1
    new-instance v0, La50;

    .line 2
    .line 3
    iget-object v3, p0, La50;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v4, p0, La50;->i:Z

    .line 6
    .line 7
    iget-object v1, p0, La50;->d:Lf22;

    .line 8
    .line 9
    iget-object v2, p0, La50;->e:Lb50;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La50;-><init>(Lf22;Lb50;Ljava/lang/Object;ZLc10;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La50;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lei0;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La50;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La50;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, La50;->b:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La50;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La50;->e:Lb50;

    .line 9
    .line 10
    iget-object v5, p0, La50;->d:Lf22;

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v7, :cond_1

    .line 17
    .line 18
    if-ne v1, v6, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_1
    iget-object v1, p0, La50;->a:Lf22;

    .line 31
    .line 32
    iget-object v7, p0, La50;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, Lei0;

    .line 35
    .line 36
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, La50;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lei0;

    .line 46
    .line 47
    invoke-virtual {v4}, Lb50;->g()Lqe2;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object p1, p0, La50;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v5, p0, La50;->a:Lf22;

    .line 54
    .line 55
    iput v7, p0, La50;->b:I

    .line 56
    .line 57
    iget-object v1, v1, Lqe2;->b:Lqc3;

    .line 58
    .line 59
    iget-object v1, v1, Lqc3;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    new-instance v7, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-direct {v7, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 70
    .line 71
    .line 72
    if-ne v7, v0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v1, v7

    .line 76
    move-object v7, p1

    .line 77
    move-object p1, v1

    .line 78
    move-object v1, v5

    .line 79
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput p1, v1, Lf22;->a:I

    .line 86
    .line 87
    iput-object v2, p0, La50;->c:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v2, p0, La50;->a:Lf22;

    .line 90
    .line 91
    iput v6, p0, La50;->b:I

    .line 92
    .line 93
    invoke-virtual {v7, v3, p0}, Lei0;->b(Ljava/lang/Object;Ld10;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v0, :cond_4

    .line 98
    .line 99
    :goto_1
    return-object v0

    .line 100
    :cond_4
    :goto_2
    iget-boolean p0, p0, La50;->i:Z

    .line 101
    .line 102
    if-eqz p0, :cond_6

    .line 103
    .line 104
    iget-object p0, v4, Lb50;->h:Lgr0;

    .line 105
    .line 106
    new-instance p1, Lx30;

    .line 107
    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    const/4 v0, 0x0

    .line 116
    :goto_3
    iget v1, v5, Lf22;->a:I

    .line 117
    .line 118
    invoke-direct {p1, v3, v0, v1}, Lx30;-><init>(Ljava/lang/Object;II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lgr0;->u(Log2;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0
.end method
