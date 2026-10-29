.class public final Lmj;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILc10;)V
    .locals 1

    .line 10
    const/4 v0, 0x2

    iput v0, p0, Lmj;->a:I

    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lc10;I)V
    .locals 0

    .line 1
    iput p3, p0, Lmj;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmj;->b:Ljava/lang/Object;

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
    iget v0, p0, Lmj;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lmj;

    .line 7
    .line 8
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, [B

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, Lmj;

    .line 19
    .line 20
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lqk2;

    .line 23
    .line 24
    const/4 v0, 0x7

    .line 25
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_1
    new-instance p1, Lmj;

    .line 30
    .line 31
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_2
    new-instance p1, Lmj;

    .line 41
    .line 42
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lmw0;

    .line 45
    .line 46
    const/4 v0, 0x5

    .line 47
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_3
    new-instance p1, Lmj;

    .line 52
    .line 53
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lwb2;

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_4
    new-instance p1, Lmj;

    .line 63
    .line 64
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lse0;

    .line 67
    .line 68
    const/4 v0, 0x3

    .line 69
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_5
    new-instance p0, Lmj;

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    invoke-direct {p0, v0, p2}, Lmj;-><init>(ILc10;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lmj;->b:Ljava/lang/Object;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_6
    new-instance p1, Lmj;

    .line 83
    .line 84
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Lmz;

    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_7
    new-instance p1, Lmj;

    .line 94
    .line 95
    iget-object p0, p0, Lmj;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Loj;

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-direct {p1, p0, p2, v0}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
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
    iget v0, p0, Lmj;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly10;

    .line 7
    .line 8
    check-cast p2, Lc10;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lmj;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lmj;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ly10;

    .line 41
    .line 42
    check-cast p2, Lc10;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lmj;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ly10;

    .line 58
    .line 59
    check-cast p2, Lc10;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lmj;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ly10;

    .line 75
    .line 76
    check-cast p2, Lc10;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lmj;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ly80;

    .line 92
    .line 93
    check-cast p2, Lc10;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lmj;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Log2;

    .line 109
    .line 110
    check-cast p2, Lc10;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lmj;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, Ly80;

    .line 126
    .line 127
    check-cast p2, Lc10;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lmj;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, Ly80;

    .line 143
    .line 144
    check-cast p2, Lc10;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, Lmj;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lmj;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Lmj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lmj;->a:I

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, Lz10;->a:Lz10;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, [B

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    invoke-static {v0, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "Cannot decode the image byte array as a Bitmap"

    .line 30
    .line 31
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    :goto_0
    return-object v4

    .line 36
    :pswitch_0
    sget-object v1, Lz10;->a:Lz10;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lqk2;

    .line 44
    .line 45
    iget-object v1, v0, Lqk2;->i:Lib1;

    .line 46
    .line 47
    invoke-virtual {v1}, Lib1;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lqk2;->m:Lql2;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v1, v1, Lql2;->i:Luh2;

    .line 56
    .line 57
    iget v1, v1, Luh2;->a:I

    .line 58
    .line 59
    const/4 v6, 0x5

    .line 60
    if-eq v1, v6, :cond_1

    .line 61
    .line 62
    iget-object v1, v0, Lqk2;->m:Lql2;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v7, Luh2;

    .line 68
    .line 69
    invoke-direct {v7, v6}, Luh2;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v7}, Lql2;->f(Luh2;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    sget-object v1, Lzl2;->Companion:Lyl2;

    .line 76
    .line 77
    iget-object v6, v0, Lqk2;->m:Lql2;

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v1, Lg92;->Companion:Lf92;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v6}, Lf92;->a(Lql2;)Lql2;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget v6, v1, Lql2;->g:I

    .line 95
    .line 96
    const-string v7, "Unsupported TCF version: "

    .line 97
    .line 98
    const/4 v8, 0x2

    .line 99
    if-ne v6, v8, :cond_12

    .line 100
    .line 101
    sget-object v6, Lt82;->b:Lt82;

    .line 102
    .line 103
    invoke-static {v6}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v9, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 113
    .line 114
    .line 115
    sget-object v6, Lt82;->c:Lt82;

    .line 116
    .line 117
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iget-boolean v6, v1, Lql2;->c:Z

    .line 121
    .line 122
    if-eqz v6, :cond_2

    .line 123
    .line 124
    sget-object v6, Lt82;->e:Lt82;

    .line 125
    .line 126
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_2
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    move-object v10, v2

    .line 141
    move v11, v3

    .line 142
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-eqz v12, :cond_11

    .line 147
    .line 148
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    add-int/lit8 v13, v11, 0x1

    .line 153
    .line 154
    if-ltz v11, :cond_10

    .line 155
    .line 156
    check-cast v12, Lt82;

    .line 157
    .line 158
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    add-int/lit8 v14, v14, -0x1

    .line 163
    .line 164
    if-ge v11, v14, :cond_3

    .line 165
    .line 166
    const-string v11, "."

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move-object v11, v2

    .line 170
    :goto_2
    sget-object v14, Lv82;->Companion:Lu82;

    .line 171
    .line 172
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const-string v14, "->"

    .line 176
    .line 177
    const-string v15, "Error encoding "

    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    const/16 v16, 0x0

    .line 183
    .line 184
    iget v4, v1, Lql2;->g:I

    .line 185
    .line 186
    if-ne v4, v8, :cond_f

    .line 187
    .line 188
    move/from16 p0, v8

    .line 189
    .line 190
    :try_start_0
    sget-object v8, Lv82;->a:Ld52;

    .line 191
    .line 192
    iget-object v8, v8, Ld52;->a:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v8, Lfs0;

    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v8, v8, Lfs0;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v8, Ljava/util/Map;

    .line 202
    .line 203
    invoke-interface {v8, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    check-cast v8, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 208
    .line 209
    sget-object v4, Lt82;->b:Lt82;

    .line 210
    .line 211
    const-string v3, "segmentType"

    .line 212
    .line 213
    if-eq v12, v4, :cond_6

    .line 214
    .line 215
    sget-object v4, Lx82;->Companion:Lw82;

    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    sget-object v4, Lx82;->b:Ljava/util/Map;

    .line 221
    .line 222
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Ljava/lang/Integer;

    .line 227
    .line 228
    if-eqz v4, :cond_5

    .line 229
    .line 230
    sget-object v17, Lvy0;->Companion:Luy0;

    .line 231
    .line 232
    new-instance v5, Luh2;

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-direct {v5, v4}, Luh2;-><init>(I)V

    .line 239
    .line 240
    .line 241
    sget-object v4, Lrj;->Companion:Lqj;

    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {v3}, Lqj;->a(Ljava/lang/String;)Lrj;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    if-eqz v4, :cond_4

    .line 251
    .line 252
    iget v4, v4, Lrj;->a:I

    .line 253
    .line 254
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    goto :goto_3

    .line 259
    :cond_4
    move-object/from16 v4, v16

    .line 260
    .line 261
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {v5, v4}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    goto :goto_4

    .line 276
    :cond_5
    new-instance v0, Lf0;

    .line 277
    .line 278
    new-instance v1, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const-string v2, "Unable to find segment key for "

    .line 281
    .line 282
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const/4 v2, 0x3

    .line 293
    invoke-direct {v0, v1, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 294
    .line 295
    .line 296
    throw v0

    .line 297
    :cond_6
    move-object v4, v2

    .line 298
    :goto_4
    if-eqz v8, :cond_a

    .line 299
    .line 300
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_a

    .line 309
    .line 310
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, Ljava/lang/String;

    .line 315
    .line 316
    move-object/from16 p1, v5

    .line 317
    .line 318
    invoke-virtual {v1, v8}, Lql2;->a(Ljava/lang/String;)Lb40;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    sget-object v17, Lrj;->Companion:Lqj;

    .line 323
    .line 324
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-object/from16 v17, v1

    .line 328
    .line 329
    invoke-static {v8}, Lqj;->a(Ljava/lang/String;)Lrj;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    if-nez v1, :cond_8

    .line 334
    .line 335
    sget-object v1, Lv82;->Companion:Lu82;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-static {v8}, Lu82;->a(Ljava/lang/String;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v1, :cond_7

    .line 345
    .line 346
    invoke-virtual/range {v17 .. v17}, Lql2;->b()Luh2;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iget v1, v1, Luh2;->a:I

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_7
    const/4 v1, 0x0

    .line 354
    goto :goto_6

    .line 355
    :cond_8
    iget v1, v1, Lrj;->a:I

    .line 356
    .line 357
    :goto_6
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 358
    .line 359
    .line 360
    move-result v18

    .line 361
    sparse-switch v18, :sswitch_data_0

    .line 362
    .line 363
    .line 364
    goto/16 :goto_13

    .line 365
    .line 366
    :sswitch_0
    const-string v1, "vendorsAllowed"

    .line 367
    .line 368
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_9

    .line 373
    .line 374
    :goto_7
    move-object/from16 v19, v3

    .line 375
    .line 376
    move-object/from16 v18, v6

    .line 377
    .line 378
    goto/16 :goto_11

    .line 379
    .line 380
    :catchall_0
    move-exception v0

    .line 381
    goto/16 :goto_14

    .line 382
    .line 383
    :sswitch_1
    const-string v1, "vendorsDisclosed"

    .line 384
    .line 385
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_9

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :sswitch_2
    move-object/from16 v18, v6

    .line 393
    .line 394
    const-string v6, "specialFeatureOptins"

    .line 395
    .line 396
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    if-eqz v6, :cond_9

    .line 401
    .line 402
    goto/16 :goto_d

    .line 403
    .line 404
    :sswitch_3
    move-object/from16 v18, v6

    .line 405
    .line 406
    const-string v6, "vendorListVersion"

    .line 407
    .line 408
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    if-eqz v6, :cond_9

    .line 413
    .line 414
    :goto_8
    move-object/from16 v19, v3

    .line 415
    .line 416
    goto/16 :goto_10

    .line 417
    .line 418
    :sswitch_4
    move-object/from16 v18, v6

    .line 419
    .line 420
    const-string v6, "lastUpdated"

    .line 421
    .line 422
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    if-eqz v6, :cond_9

    .line 427
    .line 428
    goto :goto_9

    .line 429
    :sswitch_5
    move-object/from16 v18, v6

    .line 430
    .line 431
    const-string v6, "publisherLegitimateInterests"

    .line 432
    .line 433
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    if-eqz v6, :cond_9

    .line 438
    .line 439
    goto/16 :goto_d

    .line 440
    .line 441
    :sswitch_6
    move-object/from16 v18, v6

    .line 442
    .line 443
    const-string v6, "publisherCustomLegitimateInterests"

    .line 444
    .line 445
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    if-eqz v6, :cond_9

    .line 450
    .line 451
    goto/16 :goto_d

    .line 452
    .line 453
    :sswitch_7
    move-object/from16 v18, v6

    .line 454
    .line 455
    const-string v6, "created"

    .line 456
    .line 457
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    if-eqz v6, :cond_9

    .line 462
    .line 463
    :goto_9
    move-object v6, v5

    .line 464
    check-cast v6, Lsl2;

    .line 465
    .line 466
    sget-object v6, Ld50;->Companion:Lc50;

    .line 467
    .line 468
    check-cast v5, Lsl2;

    .line 469
    .line 470
    iget-object v5, v5, Lsl2;->g:Ljava/lang/Long;

    .line 471
    .line 472
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    move-object/from16 v19, v6

    .line 476
    .line 477
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 478
    .line 479
    .line 480
    move-result-wide v5

    .line 481
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    invoke-static {v1, v5, v6}, Lc50;->a(IJ)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    new-instance v5, Ljava/lang/StringBuilder;

    .line 489
    .line 490
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    :goto_a
    move-object v4, v1

    .line 504
    move-object/from16 v19, v3

    .line 505
    .line 506
    goto/16 :goto_12

    .line 507
    .line 508
    :sswitch_8
    move-object/from16 v18, v6

    .line 509
    .line 510
    const-string v1, "vendorLegitimateInterests"

    .line 511
    .line 512
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    if-eqz v1, :cond_9

    .line 517
    .line 518
    move-object/from16 v19, v3

    .line 519
    .line 520
    goto/16 :goto_11

    .line 521
    .line 522
    :sswitch_9
    move-object/from16 v18, v6

    .line 523
    .line 524
    const-string v6, "consentLanguage"

    .line 525
    .line 526
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    if-eqz v6, :cond_9

    .line 531
    .line 532
    goto/16 :goto_c

    .line 533
    .line 534
    :sswitch_a
    move-object/from16 v18, v6

    .line 535
    .line 536
    const-string v1, "purposeOneTreatment"

    .line 537
    .line 538
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    if-eqz v1, :cond_9

    .line 543
    .line 544
    goto/16 :goto_b

    .line 545
    .line 546
    :sswitch_b
    move-object/from16 v18, v6

    .line 547
    .line 548
    const-string v6, "publisherConsents"

    .line 549
    .line 550
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v6

    .line 554
    if-eqz v6, :cond_9

    .line 555
    .line 556
    goto/16 :goto_d

    .line 557
    .line 558
    :sswitch_c
    move-object/from16 v18, v6

    .line 559
    .line 560
    const-string v6, "purposeLegitimateInterests"

    .line 561
    .line 562
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    if-eqz v6, :cond_9

    .line 567
    .line 568
    goto/16 :goto_d

    .line 569
    .line 570
    :sswitch_d
    move-object/from16 v18, v6

    .line 571
    .line 572
    const-string v1, "useNonStandardStacks"

    .line 573
    .line 574
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    if-eqz v1, :cond_9

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :sswitch_e
    move-object/from16 v18, v6

    .line 582
    .line 583
    const-string v6, "version"

    .line 584
    .line 585
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    if-eqz v6, :cond_9

    .line 590
    .line 591
    goto/16 :goto_e

    .line 592
    .line 593
    :sswitch_f
    move-object/from16 v18, v6

    .line 594
    .line 595
    const-string v1, "publisherRestrictions"

    .line 596
    .line 597
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    if-eqz v1, :cond_9

    .line 602
    .line 603
    move-object v1, v5

    .line 604
    check-cast v1, Lul2;

    .line 605
    .line 606
    sget-object v1, Lzz1;->Companion:Lyz1;

    .line 607
    .line 608
    check-cast v5, Lul2;

    .line 609
    .line 610
    iget-object v5, v5, Lul2;->g:Lxz1;

    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-static {v5}, Lyz1;->a(Lxz1;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    new-instance v5, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    goto/16 :goto_a

    .line 635
    .line 636
    :sswitch_10
    move-object/from16 v18, v6

    .line 637
    .line 638
    const-string v6, "cmpId"

    .line 639
    .line 640
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v6

    .line 644
    if-eqz v6, :cond_9

    .line 645
    .line 646
    goto/16 :goto_8

    .line 647
    .line 648
    :sswitch_11
    move-object/from16 v18, v6

    .line 649
    .line 650
    const-string v1, "isServiceSpecific"

    .line 651
    .line 652
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    if-eqz v1, :cond_9

    .line 657
    .line 658
    :goto_b
    move-object v1, v5

    .line 659
    check-cast v1, Lrl2;

    .line 660
    .line 661
    sget-object v1, Lek;->Companion:Ldk;

    .line 662
    .line 663
    check-cast v5, Lrl2;

    .line 664
    .line 665
    iget-boolean v5, v5, Lrl2;->g:Z

    .line 666
    .line 667
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-static {v5}, Ldk;->a(Z)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    new-instance v5, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    goto/16 :goto_a

    .line 690
    .line 691
    :sswitch_12
    move-object/from16 v18, v6

    .line 692
    .line 693
    const-string v6, "consentScreen"

    .line 694
    .line 695
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v6

    .line 699
    if-eqz v6, :cond_9

    .line 700
    .line 701
    goto/16 :goto_8

    .line 702
    .line 703
    :sswitch_13
    move-object/from16 v18, v6

    .line 704
    .line 705
    const-string v6, "publisherCustomConsents"

    .line 706
    .line 707
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    if-eqz v6, :cond_9

    .line 712
    .line 713
    goto :goto_d

    .line 714
    :sswitch_14
    move-object/from16 v18, v6

    .line 715
    .line 716
    const-string v6, "publisherCountryCode"

    .line 717
    .line 718
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v6

    .line 722
    if-eqz v6, :cond_9

    .line 723
    .line 724
    :goto_c
    move-object v6, v5

    .line 725
    check-cast v6, Lvl2;

    .line 726
    .line 727
    sget-object v6, Ld51;->Companion:Lc51;

    .line 728
    .line 729
    check-cast v5, Lvl2;

    .line 730
    .line 731
    iget-object v5, v5, Lvl2;->g:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-static {v1, v5}, Lc51;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    new-instance v5, Ljava/lang/StringBuilder;

    .line 741
    .line 742
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    goto/16 :goto_a

    .line 756
    .line 757
    :sswitch_15
    move-object/from16 v18, v6

    .line 758
    .line 759
    const-string v6, "purposeConsents"

    .line 760
    .line 761
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v6

    .line 765
    if-eqz v6, :cond_9

    .line 766
    .line 767
    :goto_d
    move-object v6, v5

    .line 768
    check-cast v6, Lxl2;

    .line 769
    .line 770
    sget-object v6, Ljj0;->Companion:Lij0;

    .line 771
    .line 772
    check-cast v5, Lxl2;

    .line 773
    .line 774
    iget-object v5, v5, Lxl2;->g:Lu13;

    .line 775
    .line 776
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    invoke-static {v5, v1}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    new-instance v5, Ljava/lang/StringBuilder;

    .line 788
    .line 789
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    goto/16 :goto_a

    .line 803
    .line 804
    :sswitch_16
    move-object/from16 v18, v6

    .line 805
    .line 806
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v6

    .line 810
    if-eqz v6, :cond_9

    .line 811
    .line 812
    move-object v6, v5

    .line 813
    check-cast v6, Lwl2;

    .line 814
    .line 815
    sget-object v6, Lvy0;->Companion:Luy0;

    .line 816
    .line 817
    check-cast v5, Lwl2;

    .line 818
    .line 819
    iget-object v5, v5, Lwl2;->g:Luh2;

    .line 820
    .line 821
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    invoke-static {v5, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    new-instance v5, Ljava/lang/StringBuilder;

    .line 829
    .line 830
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    goto/16 :goto_a

    .line 844
    .line 845
    :sswitch_17
    move-object/from16 v18, v6

    .line 846
    .line 847
    const-string v6, "policyVersion"

    .line 848
    .line 849
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v6

    .line 853
    if-eqz v6, :cond_9

    .line 854
    .line 855
    goto/16 :goto_8

    .line 856
    .line 857
    :sswitch_18
    move-object/from16 v18, v6

    .line 858
    .line 859
    const-string v6, "numCustomPurposes"

    .line 860
    .line 861
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    move-result v6

    .line 865
    if-eqz v6, :cond_9

    .line 866
    .line 867
    :goto_e
    move-object v6, v5

    .line 868
    check-cast v6, Ltl2;

    .line 869
    .line 870
    sget-object v6, Lvy0;->Companion:Luy0;

    .line 871
    .line 872
    move-object/from16 v19, v3

    .line 873
    .line 874
    new-instance v3, Luh2;

    .line 875
    .line 876
    check-cast v5, Ltl2;

    .line 877
    .line 878
    iget v5, v5, Ltl2;->g:I

    .line 879
    .line 880
    invoke-direct {v3, v5}, Luh2;-><init>(I)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-static {v3, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    new-instance v3, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    :goto_f
    move-object v4, v1

    .line 906
    goto :goto_12

    .line 907
    :sswitch_19
    move-object/from16 v19, v3

    .line 908
    .line 909
    move-object/from16 v18, v6

    .line 910
    .line 911
    const-string v3, "cmpVersion"

    .line 912
    .line 913
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    move-result v3

    .line 917
    if-eqz v3, :cond_9

    .line 918
    .line 919
    :goto_10
    move-object v3, v5

    .line 920
    check-cast v3, Lwl2;

    .line 921
    .line 922
    check-cast v5, Lwl2;

    .line 923
    .line 924
    iget-object v3, v5, Lwl2;->g:Luh2;

    .line 925
    .line 926
    sget-object v5, Lvy0;->Companion:Luy0;

    .line 927
    .line 928
    new-instance v6, Luh2;

    .line 929
    .line 930
    iget v3, v3, Luh2;->a:I

    .line 931
    .line 932
    invoke-direct {v6, v3}, Luh2;-><init>(I)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    invoke-static {v6, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    new-instance v3, Ljava/lang/StringBuilder;

    .line 943
    .line 944
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    goto :goto_f

    .line 958
    :sswitch_1a
    move-object/from16 v19, v3

    .line 959
    .line 960
    move-object/from16 v18, v6

    .line 961
    .line 962
    const-string v1, "vendorConsents"

    .line 963
    .line 964
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    move-result v1

    .line 968
    if-eqz v1, :cond_9

    .line 969
    .line 970
    :goto_11
    move-object v1, v5

    .line 971
    check-cast v1, Lxl2;

    .line 972
    .line 973
    sget-object v1, Le23;->Companion:Ld23;

    .line 974
    .line 975
    check-cast v5, Lxl2;

    .line 976
    .line 977
    iget-object v3, v5, Lxl2;->g:Lu13;

    .line 978
    .line 979
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    invoke-static {v3}, Ld23;->b(Lu13;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    new-instance v3, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    goto :goto_f

    .line 1002
    :goto_12
    move-object/from16 v5, p1

    .line 1003
    .line 1004
    move-object/from16 v1, v17

    .line 1005
    .line 1006
    move-object/from16 v6, v18

    .line 1007
    .line 1008
    move-object/from16 v3, v19

    .line 1009
    .line 1010
    goto/16 :goto_5

    .line 1011
    .line 1012
    :cond_9
    :goto_13
    new-instance v0, Lf0;

    .line 1013
    .line 1014
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    const-string v2, ", value: "

    .line 1032
    .line 1033
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v1

    .line 1043
    const/4 v2, 0x3

    .line 1044
    invoke-direct {v0, v1, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1045
    .line 1046
    .line 1047
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1048
    :goto_14
    new-instance v1, Lf0;

    .line 1049
    .line 1050
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1055
    .line 1056
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    const-string v3, ": "

    .line 1069
    .line 1070
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    const/4 v2, 0x3

    .line 1081
    invoke-direct {v1, v0, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1082
    .line 1083
    .line 1084
    throw v1

    .line 1085
    :cond_a
    move-object/from16 v17, v1

    .line 1086
    .line 1087
    move-object/from16 v18, v6

    .line 1088
    .line 1089
    sget-object v1, Lai;->Companion:Lzh;

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    new-instance v1, Lkotlin/text/Regex;

    .line 1095
    .line 1096
    const-string v3, "[0-1]+"

    .line 1097
    .line 1098
    invoke-direct {v1, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1102
    .line 1103
    .line 1104
    move-result v3

    .line 1105
    rem-int/lit8 v3, v3, 0x18

    .line 1106
    .line 1107
    if-lez v3, :cond_b

    .line 1108
    .line 1109
    rsub-int/lit8 v3, v3, 0x18

    .line 1110
    .line 1111
    const-string v5, "0"

    .line 1112
    .line 1113
    invoke-static {v3, v5}, Lkotlin/text/e;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v3

    .line 1117
    invoke-static {v4, v3}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    :cond_b
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    add-int/lit8 v3, v3, -0x1

    .line 1126
    .line 1127
    const/4 v5, 0x6

    .line 1128
    const/4 v6, 0x0

    .line 1129
    invoke-static {v6, v3, v5}, Lk50;->v(III)I

    .line 1130
    .line 1131
    .line 1132
    move-result v3

    .line 1133
    if-ltz v3, :cond_d

    .line 1134
    .line 1135
    move-object v8, v2

    .line 1136
    move v5, v6

    .line 1137
    :goto_15
    add-int/lit8 v12, v5, 0x6

    .line 1138
    .line 1139
    invoke-virtual {v4, v5, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v14

    .line 1143
    invoke-virtual {v1, v14}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v15

    .line 1147
    if-eqz v15, :cond_c

    .line 1148
    .line 1149
    invoke-static/range {p0 .. p0}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 1150
    .line 1151
    .line 1152
    move-result v15

    .line 1153
    invoke-static {v14, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1154
    .line 1155
    .line 1156
    move-result v14

    .line 1157
    const-string v15, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 1158
    .line 1159
    invoke-virtual {v15, v14}, Ljava/lang/String;->charAt(I)C

    .line 1160
    .line 1161
    .line 1162
    move-result v14

    .line 1163
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1164
    .line 1165
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v8

    .line 1178
    if-eq v5, v3, :cond_e

    .line 1179
    .line 1180
    move v5, v12

    .line 1181
    goto :goto_15

    .line 1182
    :cond_c
    new-instance v0, Lf0;

    .line 1183
    .line 1184
    const-string v1, "Invalid bitField"

    .line 1185
    .line 1186
    const/4 v2, 0x3

    .line 1187
    invoke-direct {v0, v1, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1188
    .line 1189
    .line 1190
    throw v0

    .line 1191
    :cond_d
    move-object v8, v2

    .line 1192
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1193
    .line 1194
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v10

    .line 1210
    move/from16 v8, p0

    .line 1211
    .line 1212
    move v3, v6

    .line 1213
    move v11, v13

    .line 1214
    move-object/from16 v1, v17

    .line 1215
    .line 1216
    move-object/from16 v6, v18

    .line 1217
    .line 1218
    goto/16 :goto_1

    .line 1219
    .line 1220
    :catchall_1
    new-instance v0, Lf0;

    .line 1221
    .line 1222
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1223
    .line 1224
    const-string v2, "Unable to encode version "

    .line 1225
    .line 1226
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    const-string v2, ", segment: "

    .line 1233
    .line 1234
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    const/4 v2, 0x3

    .line 1245
    invoke-direct {v0, v1, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1246
    .line 1247
    .line 1248
    throw v0

    .line 1249
    :cond_f
    const/4 v2, 0x3

    .line 1250
    new-instance v0, Lf0;

    .line 1251
    .line 1252
    invoke-static {v4, v7}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    invoke-direct {v0, v1, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1257
    .line 1258
    .line 1259
    throw v0

    .line 1260
    :cond_10
    const/16 v16, 0x0

    .line 1261
    .line 1262
    invoke-static {}, Lpw;->g()V

    .line 1263
    .line 1264
    .line 1265
    throw v16

    .line 1266
    :cond_11
    invoke-virtual {v0, v10}, Lqk2;->x(Ljava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    iget-object v1, v0, Lqk2;->c:Lg80;

    .line 1270
    .line 1271
    iget-object v2, v0, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 1272
    .line 1273
    iget-object v3, v0, Lqk2;->f:Ly3;

    .line 1274
    .line 1275
    iget-object v3, v3, Ly3;->e:Ljava/lang/String;

    .line 1276
    .line 1277
    new-instance v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 1278
    .line 1279
    invoke-direct {v4, v10, v3, v2}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 1280
    .line 1281
    .line 1282
    check-cast v1, Lpz2;

    .line 1283
    .line 1284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget-object v2, v1, Lpz2;->e:Lod2;

    .line 1288
    .line 1289
    iput-object v4, v1, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 1290
    .line 1291
    iget-object v1, v1, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 1292
    .line 1293
    iget-object v1, v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->b:Ljava/lang/String;

    .line 1294
    .line 1295
    sget-object v3, Lfh2;->a:[Lfh2;

    .line 1296
    .line 1297
    const-string v3, "tcf-"

    .line 1298
    .line 1299
    invoke-static {v3, v1}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v3

    .line 1303
    sget-object v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF$Companion;

    .line 1304
    .line 1305
    invoke-virtual {v5}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v5

    .line 1309
    sget-object v6, Lb21;->a:Lr11;

    .line 1310
    .line 1311
    invoke-virtual {v6, v5, v4}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v4

    .line 1315
    invoke-virtual {v2, v3, v4}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    const-string v3, "actual_tcf"

    .line 1322
    .line 1323
    invoke-virtual {v2, v3, v1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v0}, Lqk2;->w()V

    .line 1327
    .line 1328
    .line 1329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1330
    .line 1331
    return-object v0

    .line 1332
    :cond_12
    new-instance v0, Lf0;

    .line 1333
    .line 1334
    invoke-static {v6, v7}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v1

    .line 1338
    const/4 v2, 0x3

    .line 1339
    invoke-direct {v0, v1, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1340
    .line 1341
    .line 1342
    throw v0

    .line 1343
    :pswitch_1
    const/16 v16, 0x0

    .line 1344
    .line 1345
    sget-object v1, Lz10;->a:Lz10;

    .line 1346
    .line 1347
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1348
    .line 1349
    .line 1350
    :try_start_2
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v0, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;

    .line 1353
    .line 1354
    invoke-static {v0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->access$getEncryptedStorage$p(Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;)Lcom/supercell/id/scid_plugin/EncryptedStorage;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    if-eqz v0, :cond_13

    .line 1359
    .line 1360
    const-string v1, "whitelist"

    .line 1361
    .line 1362
    invoke-virtual {v0, v1}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    if-eqz v0, :cond_13

    .line 1367
    .line 1368
    new-instance v1, Lorg/json/JSONObject;

    .line 1369
    .line 1370
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 1371
    .line 1372
    .line 1373
    move-object v4, v1

    .line 1374
    goto :goto_16

    .line 1375
    :catch_0
    :cond_13
    move-object/from16 v4, v16

    .line 1376
    .line 1377
    :goto_16
    return-object v4

    .line 1378
    :pswitch_2
    sget-object v1, Lz10;->a:Lz10;

    .line 1379
    .line 1380
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1381
    .line 1382
    .line 1383
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1384
    .line 1385
    check-cast v0, Lmw0;

    .line 1386
    .line 1387
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 1388
    .line 1389
    .line 1390
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1391
    .line 1392
    return-object v0

    .line 1393
    :pswitch_3
    sget-object v1, Lz10;->a:Lz10;

    .line 1394
    .line 1395
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1396
    .line 1397
    .line 1398
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v0, Lwb2;

    .line 1401
    .line 1402
    invoke-virtual {v0}, Lcm0;->close()V

    .line 1403
    .line 1404
    .line 1405
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1406
    .line 1407
    return-object v0

    .line 1408
    :pswitch_4
    const/16 v16, 0x0

    .line 1409
    .line 1410
    sget-object v1, Lz10;->a:Lz10;

    .line 1411
    .line 1412
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1413
    .line 1414
    .line 1415
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v0, Lse0;

    .line 1418
    .line 1419
    iget-object v1, v0, Lse0;->a:Lev0;

    .line 1420
    .line 1421
    move-object v3, v1

    .line 1422
    check-cast v3, Ld8;

    .line 1423
    .line 1424
    invoke-virtual {v3, v2}, Ld8;->c(Ljava/lang/String;)Ljava/util/List;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    if-eqz v2, :cond_17

    .line 1429
    .line 1430
    new-instance v3, Ljava/util/ArrayList;

    .line 1431
    .line 1432
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1433
    .line 1434
    .line 1435
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    :cond_14
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1440
    .line 1441
    .line 1442
    move-result v4

    .line 1443
    if-eqz v4, :cond_15

    .line 1444
    .line 1445
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v4

    .line 1449
    move-object v5, v4

    .line 1450
    check-cast v5, Ljava/lang/String;

    .line 1451
    .line 1452
    invoke-virtual {v0}, Lse0;->a()Ljava/lang/String;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v6

    .line 1456
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1457
    .line 1458
    .line 1459
    move-result v5

    .line 1460
    if-nez v5, :cond_14

    .line 1461
    .line 1462
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1463
    .line 1464
    .line 1465
    goto :goto_17

    .line 1466
    :cond_15
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1471
    .line 1472
    .line 1473
    move-result v2

    .line 1474
    if-eqz v2, :cond_16

    .line 1475
    .line 1476
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v2

    .line 1480
    check-cast v2, Ljava/lang/String;

    .line 1481
    .line 1482
    move-object v3, v1

    .line 1483
    check-cast v3, Ld8;

    .line 1484
    .line 1485
    invoke-virtual {v3, v2}, Ld8;->d(Ljava/lang/String;)V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_18

    .line 1489
    :cond_16
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1490
    .line 1491
    goto :goto_19

    .line 1492
    :cond_17
    move-object/from16 v4, v16

    .line 1493
    .line 1494
    :goto_19
    return-object v4

    .line 1495
    :pswitch_5
    sget-object v1, Lz10;->a:Lz10;

    .line 1496
    .line 1497
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1501
    .line 1502
    check-cast v0, Log2;

    .line 1503
    .line 1504
    instance-of v0, v0, Lmi0;

    .line 1505
    .line 1506
    xor-int/lit8 v0, v0, 0x1

    .line 1507
    .line 1508
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    return-object v0

    .line 1513
    :pswitch_6
    sget-object v1, Lz10;->a:Lz10;

    .line 1514
    .line 1515
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1516
    .line 1517
    .line 1518
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1519
    .line 1520
    check-cast v0, Lmz;

    .line 1521
    .line 1522
    iget-object v1, v0, Lmz;->d:Lg80;

    .line 1523
    .line 1524
    check-cast v1, Lpz2;

    .line 1525
    .line 1526
    invoke-virtual {v1}, Lpz2;->c()Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v1

    .line 1530
    iget-object v1, v1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBuffer;->a:Ljava/util/List;

    .line 1531
    .line 1532
    new-instance v2, Lwa3;

    .line 1533
    .line 1534
    const/4 v3, 0x3

    .line 1535
    invoke-direct {v2, v3}, Lwa3;-><init>(I)V

    .line 1536
    .line 1537
    .line 1538
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v1

    .line 1542
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v1

    .line 1546
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1547
    .line 1548
    .line 1549
    move-result v2

    .line 1550
    if-eqz v2, :cond_18

    .line 1551
    .line 1552
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v2

    .line 1556
    check-cast v2, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

    .line 1557
    .line 1558
    iget-object v2, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 1559
    .line 1560
    invoke-static {v0, v2}, Lmz;->a(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;)V

    .line 1561
    .line 1562
    .line 1563
    goto :goto_1a

    .line 1564
    :cond_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1565
    .line 1566
    return-object v0

    .line 1567
    :pswitch_7
    sget-object v1, Lz10;->a:Lz10;

    .line 1568
    .line 1569
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 1570
    .line 1571
    .line 1572
    iget-object v0, v0, Lmj;->b:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast v0, Loj;

    .line 1575
    .line 1576
    iget-object v1, v0, Loj;->b:Lg80;

    .line 1577
    .line 1578
    check-cast v1, Lpz2;

    .line 1579
    .line 1580
    invoke-virtual {v1}, Lpz2;->f()Ljava/util/List;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    sget-object v3, Lqd0;->a:Lqd0;

    .line 1585
    .line 1586
    invoke-virtual {v1, v3}, Lpz2;->i(Ljava/util/Set;)V

    .line 1587
    .line 1588
    .line 1589
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v1

    .line 1593
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1594
    .line 1595
    .line 1596
    move-result v2

    .line 1597
    if-eqz v2, :cond_19

    .line 1598
    .line 1599
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v2

    .line 1603
    check-cast v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSessionEntry;

    .line 1604
    .line 1605
    iget-object v3, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSessionEntry;->a:Ljava/lang/String;

    .line 1606
    .line 1607
    iget-wide v4, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSessionEntry;->b:J

    .line 1608
    .line 1609
    invoke-virtual {v0, v3, v4, v5}, Loj;->a(Ljava/lang/String;J)V

    .line 1610
    .line 1611
    .line 1612
    goto :goto_1b

    .line 1613
    :cond_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1614
    .line 1615
    return-object v0

    .line 1616
    nop

    .line 1617
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    :sswitch_data_0
    .sparse-switch
        -0x7e1b7aff -> :sswitch_1a
        -0x7bc4a74e -> :sswitch_19
        -0x78169534 -> :sswitch_18
        -0x65f8ccba -> :sswitch_17
        -0x38cc2ef3 -> :sswitch_16
        -0x34705929 -> :sswitch_15
        -0x2c2610f9 -> :sswitch_14
        -0x1a5888ba -> :sswitch_13
        -0x8ac8eda -> :sswitch_12
        -0x700ff83 -> :sswitch_11
        0x5a65101 -> :sswitch_10
        0xc304243 -> :sswitch_f
        0x14f51cd8 -> :sswitch_e
        0x1a393d6e -> :sswitch_d
        0x1de6d536 -> :sswitch_c
        0x206d8db5 -> :sswitch_b
        0x21df50f0 -> :sswitch_a
        0x2896fd92 -> :sswitch_9
        0x3ba058cc -> :sswitch_8
        0x3d4e7ee8 -> :sswitch_7
        0x4bd3b967 -> :sswitch_6
        0x538a9798 -> :sswitch_5
        0x6254f145 -> :sswitch_4
        0x66a71bf2 -> :sswitch_3
        0x707002b8 -> :sswitch_2
        0x762fdf8f -> :sswitch_1
        0x76f69efd -> :sswitch_0
    .end sparse-switch
.end method
