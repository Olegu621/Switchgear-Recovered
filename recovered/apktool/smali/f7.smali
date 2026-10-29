.class public final Lf7;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Len1;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Len1;Ljava/lang/String;Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p5, p0, Lf7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lf7;->d:Len1;

    .line 4
    .line 5
    iput-object p2, p0, Lf7;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lf7;->e:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Lc10;)Lc10;
    .locals 8

    .line 1
    iget v0, p0, Lf7;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf7;

    .line 7
    .line 8
    iget-object v0, p0, Lf7;->d:Len1;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Llc2;

    .line 12
    .line 13
    iget-object v0, p0, Lf7;->e:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    iget-object v3, p0, Lf7;->c:Ljava/lang/String;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    invoke-direct/range {v1 .. v6}, Lf7;-><init>(Len1;Ljava/lang/String;Ljava/lang/Object;Lc10;I)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    move-object v6, p1

    .line 27
    new-instance v2, Lf7;

    .line 28
    .line 29
    iget-object p1, p0, Lf7;->d:Len1;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    check-cast v3, Lk51;

    .line 33
    .line 34
    iget-object p1, p0, Lf7;->e:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, Ljava/lang/String;

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    iget-object v4, p0, Lf7;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct/range {v2 .. v7}, Lf7;-><init>(Len1;Ljava/lang/String;Ljava/lang/Object;Lc10;I)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :pswitch_1
    move-object v6, p1

    .line 47
    new-instance v2, Lf7;

    .line 48
    .line 49
    iget-object p1, p0, Lf7;->d:Len1;

    .line 50
    .line 51
    move-object v3, p1

    .line 52
    check-cast v3, Lv3;

    .line 53
    .line 54
    iget-object p1, p0, Lf7;->e:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v5, p1

    .line 57
    check-cast v5, Ljava/util/List;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    iget-object v4, p0, Lf7;->c:Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct/range {v2 .. v7}, Lf7;-><init>(Len1;Ljava/lang/String;Ljava/lang/Object;Lc10;I)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf7;->a:I

    .line 2
    .line 3
    check-cast p1, Lc10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lf7;->create(Lc10;)Lc10;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lf7;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lf7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lf7;->create(Lc10;)Lc10;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lf7;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lf7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, Lf7;->create(Lc10;)Lc10;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lf7;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lf7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget v0, p0, Lf7;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lf7;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lf7;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lf7;->d:Len1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, Lz10;->a:Lz10;

    .line 17
    .line 18
    iget v7, p0, Lf7;->b:I

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object p1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    check-cast v3, Llc2;

    .line 37
    .line 38
    iget-object p1, v3, Llc2;->d:Lr3;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v4, v3, Llc2;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3}, Lve0;->b()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iput v6, p0, Lf7;->b:I

    .line 49
    .line 50
    iget-object v5, p1, Lr3;->b:Lhb1;

    .line 51
    .line 52
    invoke-virtual {v5}, Lhb1;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v5, "/settings/"

    .line 65
    .line 66
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, "/"

    .line 73
    .line 74
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ".json"

    .line 81
    .line 82
    invoke-static {v6, v2, v4, v1}, Lfm0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object p1, p1, Lr3;->a:Lxu0;

    .line 87
    .line 88
    invoke-virtual {p1, v1, v3, p0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v0, :cond_2

    .line 93
    .line 94
    move-object p1, v0

    .line 95
    :cond_2
    :goto_0
    return-object p1

    .line 96
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 97
    .line 98
    iget v7, p0, Lf7;->b:I

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    if-ne v7, v6, :cond_3

    .line 103
    .line 104
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object p1, v4

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    check-cast v3, Lk51;

    .line 117
    .line 118
    iget-object p1, v3, Lk51;->e:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lr3;

    .line 121
    .line 122
    check-cast v1, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v3}, Lve0;->b()Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iput v6, p0, Lf7;->b:I

    .line 129
    .line 130
    invoke-virtual {p1, v2, v1, v3, p0}, Lr3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v0, :cond_5

    .line 135
    .line 136
    move-object p1, v0

    .line 137
    :cond_5
    :goto_1
    return-object p1

    .line 138
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 139
    .line 140
    iget v7, p0, Lf7;->b:I

    .line 141
    .line 142
    if-eqz v7, :cond_7

    .line 143
    .line 144
    if-ne v7, v6, :cond_6

    .line 145
    .line 146
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    invoke-static {v5}, Lf42;->l(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    move-object p1, v4

    .line 154
    goto :goto_2

    .line 155
    :cond_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    check-cast v3, Lv3;

    .line 159
    .line 160
    iget-object p1, v3, Lv3;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Ld7;

    .line 163
    .line 164
    check-cast v1, Ljava/util/List;

    .line 165
    .line 166
    invoke-virtual {v3}, Lve0;->b()Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    iput v6, p0, Lf7;->b:I

    .line 171
    .line 172
    invoke-virtual {p1, v2, v1, v3, p0}, Ld7;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v0, :cond_8

    .line 177
    .line 178
    move-object p1, v0

    .line 179
    :cond_8
    :goto_2
    return-object p1

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
