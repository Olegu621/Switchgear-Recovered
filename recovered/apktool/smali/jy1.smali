.class public final Ljy1;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Le70;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p1, p0, Ljy1;->a:I

    .line 2
    .line 3
    iput-object p3, p0, Ljy1;->c:Le70;

    .line 4
    .line 5
    iput-object p4, p0, Ljy1;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 2

    .line 1
    iget p1, p0, Ljy1;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljy1;

    .line 7
    .line 8
    iget-object v0, p0, Ljy1;->d:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    iget-object p0, p0, Ljy1;->c:Le70;

    .line 12
    .line 13
    invoke-direct {p1, v1, p2, p0, v0}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Ljy1;

    .line 18
    .line 19
    iget-object v0, p0, Ljy1;->d:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    iget-object p0, p0, Ljy1;->c:Le70;

    .line 23
    .line 24
    invoke-direct {p1, v1, p2, p0, v0}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Ljy1;

    .line 29
    .line 30
    iget-object v0, p0, Ljy1;->d:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iget-object p0, p0, Ljy1;->c:Le70;

    .line 34
    .line 35
    invoke-direct {p1, v1, p2, p0, v0}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, Ljy1;

    .line 40
    .line 41
    iget-object v0, p0, Ljy1;->d:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object p0, p0, Ljy1;->c:Le70;

    .line 45
    .line 46
    invoke-direct {p1, v1, p2, p0, v0}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ljy1;->a:I

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
    invoke-virtual {p0, p1, p2}, Ljy1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljy1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljy1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ljy1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljy1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljy1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ljy1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljy1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljy1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ljy1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljy1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljy1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ljy1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ljy1;->d:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object v2, p0, Ljy1;->c:Le70;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lz10;->a:Lz10;

    .line 15
    .line 16
    iget v6, p0, Ljy1;->b:I

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object p1, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    iput v5, p0, Ljy1;->b:I

    .line 37
    .line 38
    invoke-interface {v2, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

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
    :goto_1
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/Throwable;

    .line 51
    .line 52
    throw p0

    .line 53
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 54
    .line 55
    iget v6, p0, Ljy1;->b:I

    .line 56
    .line 57
    if-eqz v6, :cond_4

    .line 58
    .line 59
    if-ne v6, v5, :cond_3

    .line 60
    .line 61
    :try_start_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :catch_1
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object p1, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :try_start_3
    iput v5, p0, Ljy1;->b:I

    .line 76
    .line 77
    invoke-interface {v2, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 81
    if-ne p1, v0, :cond_5

    .line 82
    .line 83
    move-object p1, v0

    .line 84
    goto :goto_3

    .line 85
    :goto_2
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :cond_5
    :goto_3
    return-object p1

    .line 90
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 91
    .line 92
    iget v6, p0, Ljy1;->b:I

    .line 93
    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    if-ne v6, v5, :cond_6

    .line 97
    .line 98
    :try_start_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 99
    .line 100
    .line 101
    goto :goto_5

    .line 102
    :catch_2
    move-exception p0

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :try_start_5
    iput v5, p0, Ljy1;->b:I

    .line 112
    .line 113
    invoke-interface {v2, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 117
    if-ne p0, v0, :cond_8

    .line 118
    .line 119
    move-object v3, v0

    .line 120
    goto :goto_6

    .line 121
    :goto_4
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_8
    :goto_5
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_6
    return-object v3

    .line 127
    :pswitch_2
    sget-object v0, Lz10;->a:Lz10;

    .line 128
    .line 129
    iget v6, p0, Ljy1;->b:I

    .line 130
    .line 131
    if-eqz v6, :cond_a

    .line 132
    .line 133
    if-ne v6, v5, :cond_9

    .line 134
    .line 135
    :try_start_6
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 136
    .line 137
    .line 138
    goto :goto_8

    .line 139
    :catch_3
    move-exception p0

    .line 140
    goto :goto_7

    .line 141
    :cond_9
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_9

    .line 145
    :cond_a
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :try_start_7
    iput v5, p0, Ljy1;->b:I

    .line 149
    .line 150
    invoke-interface {v2, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 154
    if-ne p0, v0, :cond_b

    .line 155
    .line 156
    move-object v3, v0

    .line 157
    goto :goto_9

    .line 158
    :goto_7
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :cond_b
    :goto_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    :goto_9
    return-object v3

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
