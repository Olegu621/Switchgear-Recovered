.class public final Ltm;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 12
    iput p3, p0, Ltm;->a:I

    iput-object p1, p0, Ltm;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p4, p0, Ltm;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ltm;->d:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 2

    .line 1
    iget v0, p0, Ltm;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ltm;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Ltm;

    .line 9
    .line 10
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lfb1;

    .line 13
    .line 14
    check-cast v1, Lvz2;

    .line 15
    .line 16
    const/16 v0, 0xc

    .line 17
    .line 18
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance p1, Ltm;

    .line 23
    .line 24
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lse0;

    .line 27
    .line 28
    check-cast v1, La13;

    .line 29
    .line 30
    const/16 v0, 0xb

    .line 31
    .line 32
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    new-instance p0, Ltm;

    .line 37
    .line 38
    check-cast v1, Lhk0;

    .line 39
    .line 40
    const/16 v0, 0xa

    .line 41
    .line 42
    invoke-direct {p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_2
    new-instance p0, Ltm;

    .line 49
    .line 50
    check-cast v1, Lra2;

    .line 51
    .line 52
    const/16 p1, 0x9

    .line 53
    .line 54
    invoke-direct {p0, v1, p2, p1}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_3
    new-instance p1, Ltm;

    .line 59
    .line 60
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 63
    .line 64
    check-cast v1, Lorg/json/JSONObject;

    .line 65
    .line 66
    const/16 v0, 0x8

    .line 67
    .line 68
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_4
    new-instance p1, Ltm;

    .line 73
    .line 74
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lpd1;

    .line 77
    .line 78
    check-cast v1, Landroid/net/Uri;

    .line 79
    .line 80
    const/4 v0, 0x7

    .line 81
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_5
    new-instance p1, Ltm;

    .line 86
    .line 87
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lil0;

    .line 90
    .line 91
    check-cast v1, Landroid/app/Activity;

    .line 92
    .line 93
    const/4 v0, 0x6

    .line 94
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_6
    new-instance p0, Ltm;

    .line 99
    .line 100
    check-cast v1, Lb50;

    .line 101
    .line 102
    const/4 v0, 0x5

    .line 103
    invoke-direct {p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_7
    new-instance p1, Ltm;

    .line 110
    .line 111
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 114
    .line 115
    check-cast v1, Lx30;

    .line 116
    .line 117
    const/4 v0, 0x4

    .line 118
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 119
    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_8
    new-instance p0, Ltm;

    .line 123
    .line 124
    check-cast v1, Ljava/util/List;

    .line 125
    .line 126
    const/4 v0, 0x3

    .line 127
    invoke-direct {p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_9
    new-instance p0, Ltm;

    .line 134
    .line 135
    check-cast v1, Lbt;

    .line 136
    .line 137
    const/4 v0, 0x2

    .line 138
    invoke-direct {p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_a
    new-instance p0, Ltm;

    .line 145
    .line 146
    check-cast v1, Lat;

    .line 147
    .line 148
    const/4 v0, 0x1

    .line 149
    invoke-direct {p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_b
    new-instance p1, Ltm;

    .line 156
    .line 157
    iget-object p0, p0, Ltm;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Lfk0;

    .line 160
    .line 161
    check-cast v1, Lc00;

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    invoke-direct {p1, p0, v1, p2, v0}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 165
    .line 166
    .line 167
    return-object p1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ltm;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly80;

    .line 7
    .line 8
    check-cast p2, Lc10;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ltm;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ly80;

    .line 24
    .line 25
    check-cast p2, Lc10;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ltm;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p2, Lc10;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ltm;

    .line 47
    .line 48
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_2
    check-cast p1, Ly10;

    .line 56
    .line 57
    check-cast p2, Lc10;

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ltm;

    .line 64
    .line 65
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_3
    check-cast p1, Ly10;

    .line 73
    .line 74
    check-cast p2, Lc10;

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ltm;

    .line 81
    .line 82
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_4
    check-cast p1, Ly10;

    .line 90
    .line 91
    check-cast p2, Lc10;

    .line 92
    .line 93
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ltm;

    .line 98
    .line 99
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :pswitch_5
    check-cast p1, Ly10;

    .line 107
    .line 108
    check-cast p2, Lc10;

    .line 109
    .line 110
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ltm;

    .line 115
    .line 116
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_6
    check-cast p1, Lkh1;

    .line 124
    .line 125
    check-cast p2, Lc10;

    .line 126
    .line 127
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Ltm;

    .line 132
    .line 133
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    :pswitch_7
    check-cast p1, Ly10;

    .line 141
    .line 142
    check-cast p2, Lc10;

    .line 143
    .line 144
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, Ltm;

    .line 149
    .line 150
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :pswitch_8
    check-cast p1, Lk40;

    .line 158
    .line 159
    check-cast p2, Lc10;

    .line 160
    .line 161
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    check-cast p0, Ltm;

    .line 166
    .line 167
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :pswitch_9
    check-cast p1, Lhk0;

    .line 175
    .line 176
    check-cast p2, Lc10;

    .line 177
    .line 178
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, Ltm;

    .line 183
    .line 184
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :pswitch_a
    check-cast p1, Lxx1;

    .line 192
    .line 193
    check-cast p2, Lc10;

    .line 194
    .line 195
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    check-cast p0, Ltm;

    .line 200
    .line 201
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :pswitch_b
    check-cast p1, Ly10;

    .line 209
    .line 210
    check-cast p2, Lc10;

    .line 211
    .line 212
    invoke-virtual {p0, p1, p2}, Ltm;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Ltm;

    .line 217
    .line 218
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    invoke-virtual {p0, p1}, Ltm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ltm;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ltm;->d:Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, Lz10;->a:Lz10;

    .line 14
    .line 15
    iget v1, p0, Ltm;->b:I

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lfb1;

    .line 35
    .line 36
    iget-object p1, p1, Lfb1;->T:Lhk2;

    .line 37
    .line 38
    invoke-virtual {p1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lse0;

    .line 43
    .line 44
    iget-object v1, p1, Lse0;->a:Lev0;

    .line 45
    .line 46
    invoke-virtual {p1}, Lse0;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v1, Ld8;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ld8;->d(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lse0;->c()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {p1}, Lse0;->a()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v1, v3, v5}, Ld8;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lse0;->c()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v1, p1}, Ld8;->d(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Le03;->a:Le03;

    .line 74
    .line 75
    check-cast v2, Lvz2;

    .line 76
    .line 77
    iput v4, p0, Ltm;->b:I

    .line 78
    .line 79
    invoke-static {v2, p0}, Le03;->a(Lvz2;Ld10;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-ne p0, v0, :cond_2

    .line 84
    .line 85
    move-object v5, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_1
    return-object v5

    .line 90
    :pswitch_0
    check-cast v2, La13;

    .line 91
    .line 92
    iget-object v0, p0, Ltm;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lse0;

    .line 95
    .line 96
    sget-object v6, Lz10;->a:Lz10;

    .line 97
    .line 98
    iget v7, p0, Ltm;->b:I

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    if-ne v7, v4, :cond_3

    .line 103
    .line 104
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    check-cast p1, Lo42;

    .line 108
    .line 109
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v0, Lse0;->a:Lev0;

    .line 121
    .line 122
    invoke-virtual {v0}, Lse0;->c()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast p1, Ld8;

    .line 127
    .line 128
    invoke-virtual {p1, v3}, Ld8;->d(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lse0;->a()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v0}, Lse0;->c()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {p1, v3, v7}, Ld8;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iput v4, p0, Ltm;->b:I

    .line 143
    .line 144
    invoke-virtual {v2, v1, p0}, La13;->n(ZLd10;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v6, :cond_5

    .line 149
    .line 150
    move-object v5, v6

    .line 151
    goto :goto_4

    .line 152
    :cond_5
    :goto_2
    invoke-interface {p0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-interface {p0}, Lh01;->isCancelled()Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    sget-object v1, Lo42;->b:Lm42;

    .line 165
    .line 166
    instance-of v1, p1, Ln42;

    .line 167
    .line 168
    if-nez v1, :cond_6

    .line 169
    .line 170
    if-nez p0, :cond_6

    .line 171
    .line 172
    sget-object p0, Le03;->a:Le03;

    .line 173
    .line 174
    invoke-static {v2}, Le03;->d(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object p0, v0, Lse0;->a:Lev0;

    .line 178
    .line 179
    invoke-virtual {v0}, Lse0;->c()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p0, Ld8;

    .line 184
    .line 185
    invoke-virtual {p0, p1}, Ld8;->d(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_6
    sget-object p0, Le03;->a:Le03;

    .line 192
    .line 193
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-static {p0}, Le03;->b(Ljava/lang/Throwable;)Lvz2;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {}, Le03;->e()Lfb1;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-nez p1, :cond_7

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_7
    invoke-virtual {p1}, Lfb1;->e()Li03;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const-string v1, "Usercentrics SDK was not able to initialize online, let\'s try to initialize offline"

    .line 213
    .line 214
    invoke-interface {v0, v1, p0}, Li03;->c(Ljava/lang/String;Lvz2;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lfb1;->b()Lx80;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v1, Ltm;

    .line 222
    .line 223
    const/16 v2, 0xc

    .line 224
    .line 225
    invoke-direct {v1, p1, p0, v5, v2}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 229
    .line 230
    .line 231
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    :goto_4
    return-object v5

    .line 234
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 235
    .line 236
    iget v1, p0, Ltm;->b:I

    .line 237
    .line 238
    if-eqz v1, :cond_9

    .line 239
    .line 240
    if-ne v1, v4, :cond_8

    .line 241
    .line 242
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_8
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_9
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v2, Lhk0;

    .line 256
    .line 257
    iput v4, p0, Ltm;->b:I

    .line 258
    .line 259
    invoke-interface {v2, p1, p0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    if-ne p0, v0, :cond_a

    .line 264
    .line 265
    move-object v5, v0

    .line 266
    goto :goto_6

    .line 267
    :cond_a
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    :goto_6
    return-object v5

    .line 270
    :pswitch_2
    check-cast v2, Lra2;

    .line 271
    .line 272
    sget-object v0, Lz10;->a:Lz10;

    .line 273
    .line 274
    iget v1, p0, Ltm;->b:I

    .line 275
    .line 276
    const/4 v6, 0x2

    .line 277
    if-eqz v1, :cond_d

    .line 278
    .line 279
    if-eq v1, v4, :cond_c

    .line 280
    .line 281
    if-ne v1, v6, :cond_b

    .line 282
    .line 283
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_b
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_c
    iget-object v1, p0, Ltm;->c:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v1, Ltm;

    .line 294
    .line 295
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_d
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    iget-object p1, v2, Lra2;->d:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p1, Lqc3;

    .line 305
    .line 306
    iget-object p1, p1, Lqc3;->b:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-lez p1, :cond_11

    .line 315
    .line 316
    :cond_e
    iget-object p1, v2, Lra2;->a:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast p1, Ly10;

    .line 319
    .line 320
    invoke-interface {p1}, Ly10;->c()Lkotlin/coroutines/CoroutineContext;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1}, Lhu0;->W(Lkotlin/coroutines/CoroutineContext;)V

    .line 325
    .line 326
    .line 327
    iget-object p1, v2, Lra2;->b:Ljava/lang/Object;

    .line 328
    .line 329
    move-object v1, p1

    .line 330
    check-cast v1, Ltm;

    .line 331
    .line 332
    iget-object p1, v2, Lra2;->c:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p1, Lzk;

    .line 335
    .line 336
    iput-object v1, p0, Ltm;->c:Ljava/lang/Object;

    .line 337
    .line 338
    iput v4, p0, Ltm;->b:I

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-static {p1, p0}, Lzk;->B(Lzk;Ltm;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    if-ne p1, v0, :cond_f

    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_f
    :goto_7
    iput-object v5, p0, Ltm;->c:Ljava/lang/Object;

    .line 351
    .line 352
    iput v6, p0, Ltm;->b:I

    .line 353
    .line 354
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    if-ne p1, v0, :cond_10

    .line 359
    .line 360
    :goto_8
    move-object v5, v0

    .line 361
    goto :goto_a

    .line 362
    :cond_10
    :goto_9
    iget-object p1, v2, Lra2;->d:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast p1, Lqc3;

    .line 365
    .line 366
    iget-object p1, p1, Lqc3;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-nez p1, :cond_e

    .line 375
    .line 376
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_11
    const-string p0, "Check failed."

    .line 380
    .line 381
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :goto_a
    return-object v5

    .line 385
    :pswitch_3
    sget-object v0, Lz10;->a:Lz10;

    .line 386
    .line 387
    iget v1, p0, Ltm;->b:I

    .line 388
    .line 389
    if-eqz v1, :cond_13

    .line 390
    .line 391
    if-ne v1, v4, :cond_12

    .line 392
    .line 393
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_12
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_13
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast p1, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 407
    .line 408
    check-cast v2, Lorg/json/JSONObject;

    .line 409
    .line 410
    iput v4, p0, Ltm;->b:I

    .line 411
    .line 412
    invoke-static {p1, v2, p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->access$saveToPersistentStorage(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;Lorg/json/JSONObject;Lc10;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    if-ne p0, v0, :cond_14

    .line 417
    .line 418
    move-object v5, v0

    .line 419
    goto :goto_c

    .line 420
    :cond_14
    :goto_b
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 421
    .line 422
    :goto_c
    return-object v5

    .line 423
    :pswitch_4
    sget-object v0, Lz10;->a:Lz10;

    .line 424
    .line 425
    iget v1, p0, Ltm;->b:I

    .line 426
    .line 427
    if-eqz v1, :cond_16

    .line 428
    .line 429
    if-ne v1, v4, :cond_15

    .line 430
    .line 431
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto :goto_d

    .line 435
    :cond_15
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_16
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast p1, Lpd1;

    .line 445
    .line 446
    iget-object p1, p1, Lpd1;->a:Lrd1;

    .line 447
    .line 448
    check-cast v2, Landroid/net/Uri;

    .line 449
    .line 450
    iput v4, p0, Ltm;->b:I

    .line 451
    .line 452
    invoke-virtual {p1, v2, p0}, Lrd1;->i(Landroid/net/Uri;Lc10;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    if-ne p0, v0, :cond_17

    .line 457
    .line 458
    move-object v5, v0

    .line 459
    goto :goto_e

    .line 460
    :cond_17
    :goto_d
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    :goto_e
    return-object v5

    .line 463
    :pswitch_5
    iget-object v0, p0, Ltm;->c:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, Lil0;

    .line 466
    .line 467
    sget-object v1, Lz10;->a:Lz10;

    .line 468
    .line 469
    iget v6, p0, Ltm;->b:I

    .line 470
    .line 471
    if-eqz v6, :cond_19

    .line 472
    .line 473
    if-ne v6, v4, :cond_18

    .line 474
    .line 475
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_18
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    goto :goto_11

    .line 483
    :cond_19
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    iget-object p1, v0, Lil0;->a:Lts0;

    .line 487
    .line 488
    check-cast v2, Landroid/app/Activity;

    .line 489
    .line 490
    invoke-virtual {p1, v2}, Lts0;->I(Landroid/app/Activity;)Lfk0;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    new-instance v2, Lwc0;

    .line 495
    .line 496
    const/4 v3, 0x7

    .line 497
    invoke-direct {v2, v3, p1, v0}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    instance-of p1, v2, Lpg2;

    .line 501
    .line 502
    if-eqz p1, :cond_1a

    .line 503
    .line 504
    goto :goto_f

    .line 505
    :cond_1a
    new-instance p1, Li90;

    .line 506
    .line 507
    invoke-direct {p1, v2}, Li90;-><init>(Lwc0;)V

    .line 508
    .line 509
    .line 510
    move-object v2, p1

    .line 511
    :goto_f
    new-instance p1, Lsm;

    .line 512
    .line 513
    const/4 v3, 0x4

    .line 514
    invoke-direct {p1, v0, v3}, Lsm;-><init>(Ljava/lang/Object;I)V

    .line 515
    .line 516
    .line 517
    iput v4, p0, Ltm;->b:I

    .line 518
    .line 519
    invoke-interface {v2, p1, p0}, Lfk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    if-ne p0, v1, :cond_1b

    .line 524
    .line 525
    move-object v5, v1

    .line 526
    goto :goto_11

    .line 527
    :cond_1b
    :goto_10
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    :goto_11
    return-object v5

    .line 530
    :pswitch_6
    sget-object v0, Lz10;->a:Lz10;

    .line 531
    .line 532
    iget v1, p0, Ltm;->b:I

    .line 533
    .line 534
    if-eqz v1, :cond_1d

    .line 535
    .line 536
    if-ne v1, v4, :cond_1c

    .line 537
    .line 538
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    goto :goto_12

    .line 542
    :cond_1c
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    goto :goto_13

    .line 546
    :cond_1d
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast p1, Lkh1;

    .line 552
    .line 553
    check-cast v2, Lb50;

    .line 554
    .line 555
    iput v4, p0, Ltm;->b:I

    .line 556
    .line 557
    invoke-static {v2, p1, p0}, Lb50;->c(Lb50;Lkh1;Ld10;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    if-ne p0, v0, :cond_1e

    .line 562
    .line 563
    move-object v5, v0

    .line 564
    goto :goto_13

    .line 565
    :cond_1e
    :goto_12
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    :goto_13
    return-object v5

    .line 568
    :pswitch_7
    sget-object v0, Lz10;->a:Lz10;

    .line 569
    .line 570
    iget v1, p0, Ltm;->b:I

    .line 571
    .line 572
    if-eqz v1, :cond_20

    .line 573
    .line 574
    if-ne v1, v4, :cond_1f

    .line 575
    .line 576
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    goto :goto_14

    .line 580
    :cond_1f
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    move-object p1, v5

    .line 584
    goto :goto_14

    .line 585
    :cond_20
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 591
    .line 592
    check-cast v2, Lx30;

    .line 593
    .line 594
    iget-object v1, v2, Lx30;->b:Ljava/lang/Object;

    .line 595
    .line 596
    iput v4, p0, Ltm;->b:I

    .line 597
    .line 598
    invoke-interface {p1, v1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    if-ne p1, v0, :cond_21

    .line 603
    .line 604
    move-object p1, v0

    .line 605
    :cond_21
    :goto_14
    return-object p1

    .line 606
    :pswitch_8
    sget-object v0, Lz10;->a:Lz10;

    .line 607
    .line 608
    iget v1, p0, Ltm;->b:I

    .line 609
    .line 610
    if-eqz v1, :cond_23

    .line 611
    .line 612
    if-ne v1, v4, :cond_22

    .line 613
    .line 614
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    goto :goto_15

    .line 618
    :cond_22
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    goto :goto_16

    .line 622
    :cond_23
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast p1, Lk40;

    .line 628
    .line 629
    check-cast v2, Ljava/util/List;

    .line 630
    .line 631
    iput v4, p0, Ltm;->b:I

    .line 632
    .line 633
    invoke-static {v2, p1, p0}, Lyy1;->a(Ljava/util/List;Lk40;Ld10;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    if-ne p0, v0, :cond_24

    .line 638
    .line 639
    move-object v5, v0

    .line 640
    goto :goto_16

    .line 641
    :cond_24
    :goto_15
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 642
    .line 643
    :goto_16
    return-object v5

    .line 644
    :pswitch_9
    sget-object v0, Lz10;->a:Lz10;

    .line 645
    .line 646
    iget v1, p0, Ltm;->b:I

    .line 647
    .line 648
    if-eqz v1, :cond_26

    .line 649
    .line 650
    if-ne v1, v4, :cond_25

    .line 651
    .line 652
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    goto :goto_18

    .line 656
    :cond_25
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    goto :goto_19

    .line 660
    :cond_26
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast p1, Lhk0;

    .line 666
    .line 667
    check-cast v2, Lbt;

    .line 668
    .line 669
    iput v4, p0, Ltm;->b:I

    .line 670
    .line 671
    iget-object v1, v2, Lbt;->d:Lfk0;

    .line 672
    .line 673
    invoke-interface {v1, p1, p0}, Lfk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object p0

    .line 677
    if-ne p0, v0, :cond_27

    .line 678
    .line 679
    goto :goto_17

    .line 680
    :cond_27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    :goto_17
    if-ne p0, v0, :cond_28

    .line 683
    .line 684
    move-object v5, v0

    .line 685
    goto :goto_19

    .line 686
    :cond_28
    :goto_18
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    :goto_19
    return-object v5

    .line 689
    :pswitch_a
    sget-object v0, Lz10;->a:Lz10;

    .line 690
    .line 691
    iget v1, p0, Ltm;->b:I

    .line 692
    .line 693
    if-eqz v1, :cond_2a

    .line 694
    .line 695
    if-ne v1, v4, :cond_29

    .line 696
    .line 697
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    goto :goto_1a

    .line 701
    :cond_29
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    goto :goto_1b

    .line 705
    :cond_2a
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast p1, Lxx1;

    .line 711
    .line 712
    check-cast v2, Lat;

    .line 713
    .line 714
    iput v4, p0, Ltm;->b:I

    .line 715
    .line 716
    invoke-virtual {v2, p1, p0}, Lat;->a(Lxx1;Lc10;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object p0

    .line 720
    if-ne p0, v0, :cond_2b

    .line 721
    .line 722
    move-object v5, v0

    .line 723
    goto :goto_1b

    .line 724
    :cond_2b
    :goto_1a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    :goto_1b
    return-object v5

    .line 727
    :pswitch_b
    sget-object v0, Lz10;->a:Lz10;

    .line 728
    .line 729
    iget v6, p0, Ltm;->b:I

    .line 730
    .line 731
    if-eqz v6, :cond_2d

    .line 732
    .line 733
    if-ne v6, v4, :cond_2c

    .line 734
    .line 735
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    goto :goto_1c

    .line 739
    :cond_2c
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    goto :goto_1d

    .line 743
    :cond_2d
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    iget-object p1, p0, Ltm;->c:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast p1, Lfk0;

    .line 749
    .line 750
    new-instance v3, Lsm;

    .line 751
    .line 752
    check-cast v2, Lc00;

    .line 753
    .line 754
    invoke-direct {v3, v2, v1}, Lsm;-><init>(Ljava/lang/Object;I)V

    .line 755
    .line 756
    .line 757
    iput v4, p0, Ltm;->b:I

    .line 758
    .line 759
    invoke-interface {p1, v3, p0}, Lfk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object p0

    .line 763
    if-ne p0, v0, :cond_2e

    .line 764
    .line 765
    move-object v5, v0

    .line 766
    goto :goto_1d

    .line 767
    :cond_2e
    :goto_1c
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 768
    .line 769
    :goto_1d
    return-object v5

    .line 770
    nop

    .line 771
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
