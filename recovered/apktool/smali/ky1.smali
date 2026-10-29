.class public final Lky1;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p3, p0, Lky1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lky1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    iget p1, p0, Lky1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lky1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lky1;

    .line 9
    .line 10
    check-cast p0, Lpd1;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p1, p0, p2, v0}, Lky1;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lky1;

    .line 18
    .line 19
    check-cast p0, Le70;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, p0, p2, v0}, Lky1;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_1
    new-instance p1, Lky1;

    .line 27
    .line 28
    check-cast p0, Le70;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, p0, p2, v0}, Lky1;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lky1;->a:I

    .line 2
    .line 3
    check-cast p1, Ly10;

    .line 4
    .line 5
    check-cast p2, Lc10;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lky1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lky1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lky1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lky1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lky1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lky1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lky1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lky1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lky1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lky1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lky1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lz10;->a:Lz10;

    .line 13
    .line 14
    iget v5, p0, Lky1;->b:I

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, Lpd1;

    .line 33
    .line 34
    iget-object p1, v1, Lpd1;->a:Lrd1;

    .line 35
    .line 36
    iput v3, p0, Lky1;->b:I

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lrd1;->c(Lc10;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    move-object p1, v0

    .line 45
    :cond_2
    :goto_0
    return-object p1

    .line 46
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 47
    .line 48
    iget v5, p0, Lky1;->b:I

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    if-ne v5, v3, :cond_3

    .line 53
    .line 54
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :catch_0
    move-object p1, v4

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :try_start_1
    check-cast v1, Le70;

    .line 67
    .line 68
    iput v3, p0, Lky1;->b:I

    .line 69
    .line 70
    invoke-interface {v1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    if-ne p1, v0, :cond_5

    .line 75
    .line 76
    move-object p1, v0

    .line 77
    :cond_5
    :goto_1
    return-object p1

    .line 78
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 79
    .line 80
    iget v5, p0, Lky1;->b:I

    .line 81
    .line 82
    if-eqz v5, :cond_7

    .line 83
    .line 84
    if-ne v5, v3, :cond_6

    .line 85
    .line 86
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object p1, v4

    .line 94
    goto :goto_2

    .line 95
    :cond_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    check-cast v1, Le70;

    .line 99
    .line 100
    iput v3, p0, Lky1;->b:I

    .line 101
    .line 102
    invoke-interface {v1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_8

    .line 107
    .line 108
    move-object p1, v0

    .line 109
    :cond_8
    :goto_2
    return-object p1

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
