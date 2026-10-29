.class public abstract Len1;
.super Lve0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Lfn1;


# direct methods
.method public constructor <init>(Li03;Lse0;Lfn1;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lve0;-><init>(Li03;Lse0;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Len1;->c:Lfn1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final f(Lzu0;)Lzu0;
    .locals 11

    .line 1
    iget v0, p1, Lzu0;->c:I

    .line 2
    .line 3
    iget-object v1, p1, Lzu0;->a:Ljava/util/Map;

    .line 4
    .line 5
    const/16 v2, 0xc8

    .line 6
    .line 7
    const/16 v3, 0x130

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lve0;->d()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    new-instance p0, Lvz2;

    .line 20
    .line 21
    const-string p1, "Invalid Network Response"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    const-string v2, "cache-control"

    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    sget-object v6, Lzu0;->d:Lkotlin/text/Regex;

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v6, v6, Lkotlin/text/Regex;->a:Ljava/util/regex/Pattern;

    .line 45
    .line 46
    invoke-virtual {v6, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v4}, Ljava/util/regex/Matcher;->find(I)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-nez v7, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance v7, Lra2;

    .line 61
    .line 62
    invoke-direct {v7, v6, v2}, Lra2;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    :goto_0
    move-object v7, v5

    .line 67
    :goto_1
    if-eqz v7, :cond_5

    .line 68
    .line 69
    iget-object v2, v7, Lra2;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lrc1;

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    new-instance v2, Lrc1;

    .line 76
    .line 77
    invoke-direct {v2, v7}, Lrc1;-><init>(Lra2;)V

    .line 78
    .line 79
    .line 80
    iput-object v2, v7, Lra2;->d:Ljava/lang/Object;

    .line 81
    .line 82
    :cond_4
    iget-object v2, v7, Lra2;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lrc1;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 v6, 0x1

    .line 90
    invoke-virtual {v2, v6}, Lrc1;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    :cond_5
    iget-object p1, p1, Lzu0;->b:Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_7

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    move-object v7, v6

    .line 127
    check-cast v7, Ljava/util/Map$Entry;

    .line 128
    .line 129
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const-string v8, "etag"

    .line 134
    .line 135
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_6

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    move-object v6, v5

    .line 143
    :goto_2
    check-cast v6, Ljava/util/Map$Entry;

    .line 144
    .line 145
    if-eqz v6, :cond_8

    .line 146
    .line 147
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Ljava/lang/String;

    .line 152
    .line 153
    if-nez v2, :cond_9

    .line 154
    .line 155
    :cond_8
    const-string v2, ""

    .line 156
    .line 157
    :cond_9
    iget-object v6, p0, Lve0;->b:Lse0;

    .line 158
    .line 159
    if-ne v0, v3, :cond_b

    .line 160
    .line 161
    invoke-virtual {p0}, Lve0;->a()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const-string v7, "Valid ETAG cache: key="

    .line 166
    .line 167
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    iget-object v7, p0, Lve0;->a:Li03;

    .line 172
    .line 173
    invoke-interface {v7, v3, v5}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lve0;->c()J

    .line 177
    .line 178
    .line 179
    move-result-wide v7

    .line 180
    const-wide/16 v9, 0x0

    .line 181
    .line 182
    cmp-long v3, v7, v9

    .line 183
    .line 184
    if-nez v3, :cond_a

    .line 185
    .line 186
    new-instance v3, Lte0;

    .line 187
    .line 188
    invoke-virtual {p0}, Lve0;->a()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-direct {v3, v5, v4, v2, p1}, Lte0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, v3}, Lse0;->d(Lte0;)V

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-virtual {p0}, Lve0;->d()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    goto :goto_4

    .line 203
    :cond_b
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-nez v3, :cond_c

    .line 208
    .line 209
    if-eqz v4, :cond_c

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_c
    const-string v2, "xxx"

    .line 213
    .line 214
    :goto_3
    new-instance v3, Lte0;

    .line 215
    .line 216
    invoke-virtual {p0}, Lve0;->a()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-direct {v3, p0, v4, v2, p1}, Lte0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6, v3}, Lse0;->d(Lte0;)V

    .line 224
    .line 225
    .line 226
    move-object p0, p1

    .line 227
    :goto_4
    new-instance p1, Lzu0;

    .line 228
    .line 229
    invoke-direct {p1, v0, p0, v1}, Lzu0;-><init>(ILjava/lang/String;Ljava/util/Map;)V

    .line 230
    .line 231
    .line 232
    return-object p1
.end method

.method public final g(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lcn1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcn1;

    .line 7
    .line 8
    iget v1, v0, Lcn1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcn1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcn1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcn1;-><init>(Len1;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcn1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lcn1;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lcn1;->a:Len1;

    .line 40
    .line 41
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    iget-object p0, v0, Lcn1;->a:Len1;

    .line 53
    .line 54
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iput-object p0, v0, Lcn1;->a:Len1;

    .line 64
    .line 65
    iput v4, v0, Lcn1;->d:I

    .line 66
    .line 67
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-ne p3, v1, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    :goto_1
    check-cast p3, Lzu0;

    .line 75
    .line 76
    invoke-virtual {p0, p3}, Len1;->f(Lzu0;)Lzu0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_5
    iget-object p1, p0, Len1;->c:Lfn1;

    .line 82
    .line 83
    iget-boolean p1, p1, Lfn1;->a:Z

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    invoke-virtual {p0}, Lve0;->c()J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    new-instance p1, Lh50;

    .line 93
    .line 94
    invoke-direct {p1}, Lh50;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lh50;->c()J

    .line 98
    .line 99
    .line 100
    move-result-wide v6

    .line 101
    cmp-long p1, v4, v6

    .line 102
    .line 103
    if-lez p1, :cond_7

    .line 104
    .line 105
    :goto_2
    new-instance p1, Lzu0;

    .line 106
    .line 107
    sget-object p2, Lod0;->a:Lod0;

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lve0;->d()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const/16 p3, 0x130

    .line 117
    .line 118
    invoke-direct {p1, p3, p0, p2}, Lzu0;-><init>(ILjava/lang/String;Ljava/util/Map;)V

    .line 119
    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_7
    iput-object p0, v0, Lcn1;->a:Len1;

    .line 123
    .line 124
    iput v3, v0, Lcn1;->d:I

    .line 125
    .line 126
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    if-ne p3, v1, :cond_8

    .line 131
    .line 132
    :goto_3
    return-object v1

    .line 133
    :cond_8
    :goto_4
    check-cast p3, Lzu0;

    .line 134
    .line 135
    invoke-virtual {p0, p3}, Len1;->f(Lzu0;)Lzu0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method

.method public final h(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Ldn1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ldn1;

    .line 7
    .line 8
    iget v1, v0, Ldn1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldn1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldn1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ldn1;-><init>(Len1;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ldn1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Ldn1;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, Ldn1;->c:I

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2, v0}, Len1;->g(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    if-ne p3, v1, :cond_3

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    :goto_1
    check-cast p3, Lzu0;

    .line 60
    .line 61
    iget-object p0, p3, Lzu0;->b:Ljava/lang/String;

    .line 62
    .line 63
    return-object p0
.end method
