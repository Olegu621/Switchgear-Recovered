.class public final Lu3;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lc10;)Lc10;
    .locals 2

    .line 1
    iget v0, p0, Lu3;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lu3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lu3;

    .line 9
    .line 10
    check-cast p0, Lk51;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lu3;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lu3;

    .line 18
    .line 19
    check-cast p0, Ly40;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lu3;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Lu3;

    .line 27
    .line 28
    check-cast p0, Lv3;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p0, p1, v1}, Lu3;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lu3;->a:I

    .line 2
    .line 3
    check-cast p1, Lc10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lu3;->create(Lc10;)Lc10;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lu3;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lu3;->create(Lc10;)Lc10;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lu3;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, Lu3;->create(Lc10;)Lc10;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lu3;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lu3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lu3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lz10;->a:Lz10;

    .line 13
    .line 14
    iget v5, p0, Lu3;->b:I

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, Lk51;

    .line 33
    .line 34
    iget-object p1, v1, Lk51;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lr3;

    .line 37
    .line 38
    invoke-virtual {v1}, Lve0;->b()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput v4, p0, Lu3;->b:I

    .line 43
    .line 44
    iget-object v2, p1, Lr3;->b:Lhb1;

    .line 45
    .line 46
    invoke-virtual {v2}, Lhb1;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "/gvl/v3/en.json"

    .line 51
    .line 52
    invoke-static {v2, v3}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object p1, p1, Lr3;->a:Lxu0;

    .line 57
    .line 58
    invoke-virtual {p1, v2, v1, p0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_2

    .line 63
    .line 64
    move-object p1, v0

    .line 65
    :cond_2
    :goto_0
    return-object p1

    .line 66
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 67
    .line 68
    iget v5, p0, Lu3;->b:I

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    if-ne v5, v4, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object p1, v2

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    check-cast v1, Ly40;

    .line 87
    .line 88
    iput v4, p0, Lu3;->b:I

    .line 89
    .line 90
    invoke-virtual {v1, p0}, Ly40;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_5

    .line 95
    .line 96
    move-object p1, v0

    .line 97
    :cond_5
    :goto_1
    return-object p1

    .line 98
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 99
    .line 100
    iget v5, p0, Lu3;->b:I

    .line 101
    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    if-ne v5, v4, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object p1, v2

    .line 114
    goto :goto_2

    .line 115
    :cond_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    check-cast v1, Lv3;

    .line 119
    .line 120
    iget-object p1, v1, Lv3;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lr3;

    .line 123
    .line 124
    invoke-virtual {v1}, Lve0;->b()Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iput v4, p0, Lu3;->b:I

    .line 129
    .line 130
    iget-object v2, p1, Lr3;->a:Lxu0;

    .line 131
    .line 132
    iget-object p1, p1, Lr3;->b:Lhb1;

    .line 133
    .line 134
    invoke-virtual {p1}, Lhb1;->a()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string p1, "/tcfac/acp.json"

    .line 147
    .line 148
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {v2, p1, v1, p0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-ne p1, v0, :cond_8

    .line 160
    .line 161
    move-object p1, v0

    .line 162
    :cond_8
    :goto_2
    return-object p1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
