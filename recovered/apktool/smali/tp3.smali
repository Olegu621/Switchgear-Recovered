.class public final Ltp3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lbq3;


# static fields
.field public static final n:[I

.field public static final o:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Ltm3;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:Lep3;

.field public final l:Lnq3;

.field public final m:Lqn3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Ltp3;->n:[I

    .line 5
    .line 6
    invoke-static {}, Ltq3;->l()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ltp3;->o:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILtm3;Z[IIILep3;Lnq3;Lqn3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltp3;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Ltp3;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Ltp3;->c:I

    .line 9
    .line 10
    iput p4, p0, Ltp3;->d:I

    .line 11
    .line 12
    iput-boolean p6, p0, Ltp3;->g:Z

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    if-eqz p12, :cond_0

    .line 16
    .line 17
    instance-of p2, p5, Lbo3;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    :cond_0
    iput-boolean p1, p0, Ltp3;->f:Z

    .line 23
    .line 24
    iput-object p7, p0, Ltp3;->h:[I

    .line 25
    .line 26
    iput p8, p0, Ltp3;->i:I

    .line 27
    .line 28
    iput p9, p0, Ltp3;->j:I

    .line 29
    .line 30
    iput-object p10, p0, Ltp3;->k:Lep3;

    .line 31
    .line 32
    iput-object p11, p0, Ltp3;->l:Lnq3;

    .line 33
    .line 34
    iput-object p12, p0, Ltp3;->m:Lqn3;

    .line 35
    .line 36
    iput-object p5, p0, Ltp3;->e:Ltm3;

    .line 37
    .line 38
    return-void
.end method

.method public static h(I)I
    .locals 0

    .line 1
    ushr-int/lit8 p0, p0, 0x14

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public static i(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Leo3;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Leo3;

    .line 10
    .line 11
    invoke-virtual {p0}, Leo3;->m()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p0}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "Mutating immutable message: "

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static k(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static l(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static final r(ILjava/lang/Object;Lpi3;)V
    .locals 8

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p2, p2, Lpi3;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lkn3;

    .line 10
    .line 11
    shl-int/lit8 p0, p0, 0x3

    .line 12
    .line 13
    or-int/lit8 p0, p0, 0x2

    .line 14
    .line 15
    invoke-virtual {p2, p0}, Lkn3;->j(I)V

    .line 16
    .line 17
    .line 18
    iget p0, p2, Lkn3;->c:I

    .line 19
    .line 20
    iget-object v0, p2, Lkn3;->b:[B

    .line 21
    .line 22
    iget v1, p2, Lkn3;->d:I

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    mul-int/lit8 v2, v2, 0x3

    .line 29
    .line 30
    invoke-static {v2}, Lkn3;->p(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Lkn3;->p(I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ne v3, v2, :cond_0

    .line 43
    .line 44
    add-int v2, v1, v3

    .line 45
    .line 46
    iput v2, p2, Lkn3;->d:I

    .line 47
    .line 48
    sub-int/2addr p0, v2

    .line 49
    invoke-static {p1, v0, v2, p0}, Lzq3;->b(Ljava/lang/String;[BII)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput v1, p2, Lkn3;->d:I

    .line 54
    .line 55
    sub-int v0, p0, v1

    .line 56
    .line 57
    sub-int/2addr v0, v3

    .line 58
    invoke-virtual {p2, v0}, Lkn3;->j(I)V

    .line 59
    .line 60
    .line 61
    iput p0, p2, Lkn3;->d:I

    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    move-object v7, p0

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-static {p1}, Lzq3;->a(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {p2, v2}, Lkn3;->j(I)V

    .line 73
    .line 74
    .line 75
    iget v2, p2, Lkn3;->d:I

    .line 76
    .line 77
    sub-int/2addr p0, v2

    .line 78
    invoke-static {p1, v0, v2, p0}, Lzq3;->b(Ljava/lang/String;[BII)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    iput p0, p2, Lkn3;->d:I
    :try_end_0
    .catch Luq3; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 83
    .line 84
    return-void

    .line 85
    :catch_1
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    new-instance p1, Lkw;

    .line 88
    .line 89
    invoke-direct {p1, p0}, Lkw;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :goto_0
    iput v1, p2, Lkn3;->d:I

    .line 94
    .line 95
    sget-object v2, Lkn3;->e:Ljava/util/logging/Logger;

    .line 96
    .line 97
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 98
    .line 99
    const-string v5, "inefficientWriteStringNoTag"

    .line 100
    .line 101
    const-string v6, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    .line 102
    .line 103
    const-string v4, "com.google.protobuf.CodedOutputStream"

    .line 104
    .line 105
    invoke-virtual/range {v2 .. v7}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lso3;->a:Ljava/nio/charset/Charset;

    .line 109
    .line 110
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :try_start_1
    array-length p1, p0

    .line 115
    invoke-virtual {p2, p1}, Lkn3;->j(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p0, p1}, Lkn3;->n([BI)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :catch_2
    move-exception v0

    .line 123
    move-object p0, v0

    .line 124
    new-instance p1, Lkw;

    .line 125
    .line 126
    invoke-direct {p1, p0}, Lkw;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_1
    check-cast p1, Lcn3;

    .line 131
    .line 132
    invoke-virtual {p2, p0, p1}, Lpi3;->e(ILcn3;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public static s(Ljava/lang/Object;)Lmq3;
    .locals 2

    .line 1
    check-cast p0, Leo3;

    .line 2
    .line 3
    iget-object v0, p0, Leo3;->zzc:Lmq3;

    .line 4
    .line 5
    sget-object v1, Lmq3;->f:Lmq3;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lmq3;->a()Lmq3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Leo3;->zzc:Lmq3;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public static u(Laq3;Lep3;Lnq3;Lqn3;)Ltp3;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    instance-of v1, v0, Laq3;

    .line 4
    .line 5
    if-eqz v1, :cond_34

    .line 6
    .line 7
    iget v1, v0, Laq3;->d:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    and-int/2addr v1, v2

    .line 11
    const/4 v3, 0x2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v3

    .line 17
    :goto_0
    iget-object v4, v0, Laq3;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    const v8, 0xd800

    .line 29
    .line 30
    .line 31
    if-lt v7, v8, :cond_1

    .line 32
    .line 33
    move v7, v2

    .line 34
    :goto_1
    add-int/lit8 v9, v7, 0x1

    .line 35
    .line 36
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-lt v7, v8, :cond_2

    .line 41
    .line 42
    move v7, v9

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v9, v2

    .line 45
    :cond_2
    add-int/lit8 v7, v9, 0x1

    .line 46
    .line 47
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-lt v9, v8, :cond_4

    .line 52
    .line 53
    and-int/lit16 v9, v9, 0x1fff

    .line 54
    .line 55
    const/16 v11, 0xd

    .line 56
    .line 57
    :goto_2
    add-int/lit8 v12, v7, 0x1

    .line 58
    .line 59
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-lt v7, v8, :cond_3

    .line 64
    .line 65
    and-int/lit16 v7, v7, 0x1fff

    .line 66
    .line 67
    shl-int/2addr v7, v11

    .line 68
    or-int/2addr v9, v7

    .line 69
    add-int/lit8 v11, v11, 0xd

    .line 70
    .line 71
    move v7, v12

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    shl-int/2addr v7, v11

    .line 74
    or-int/2addr v9, v7

    .line 75
    move v7, v12

    .line 76
    :cond_4
    if-nez v9, :cond_5

    .line 77
    .line 78
    sget-object v9, Ltp3;->n:[I

    .line 79
    .line 80
    move v13, v6

    .line 81
    move v14, v13

    .line 82
    move v15, v14

    .line 83
    move/from16 v22, v15

    .line 84
    .line 85
    move/from16 v23, v22

    .line 86
    .line 87
    move/from16 v27, v23

    .line 88
    .line 89
    :goto_3
    move-object/from16 v26, v9

    .line 90
    .line 91
    goto/16 :goto_d

    .line 92
    .line 93
    :cond_5
    add-int/lit8 v9, v7, 0x1

    .line 94
    .line 95
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-lt v7, v8, :cond_7

    .line 100
    .line 101
    and-int/lit16 v7, v7, 0x1fff

    .line 102
    .line 103
    const/16 v11, 0xd

    .line 104
    .line 105
    :goto_4
    add-int/lit8 v12, v9, 0x1

    .line 106
    .line 107
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-lt v9, v8, :cond_6

    .line 112
    .line 113
    and-int/lit16 v9, v9, 0x1fff

    .line 114
    .line 115
    shl-int/2addr v9, v11

    .line 116
    or-int/2addr v7, v9

    .line 117
    add-int/lit8 v11, v11, 0xd

    .line 118
    .line 119
    move v9, v12

    .line 120
    goto :goto_4

    .line 121
    :cond_6
    shl-int/2addr v9, v11

    .line 122
    or-int/2addr v7, v9

    .line 123
    move v9, v12

    .line 124
    :cond_7
    add-int/lit8 v11, v9, 0x1

    .line 125
    .line 126
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-lt v9, v8, :cond_9

    .line 131
    .line 132
    and-int/lit16 v9, v9, 0x1fff

    .line 133
    .line 134
    const/16 v12, 0xd

    .line 135
    .line 136
    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 137
    .line 138
    invoke-virtual {v4, v11}, Ljava/lang/String;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-lt v11, v8, :cond_8

    .line 143
    .line 144
    and-int/lit16 v11, v11, 0x1fff

    .line 145
    .line 146
    shl-int/2addr v11, v12

    .line 147
    or-int/2addr v9, v11

    .line 148
    add-int/lit8 v12, v12, 0xd

    .line 149
    .line 150
    move v11, v13

    .line 151
    goto :goto_5

    .line 152
    :cond_8
    shl-int/2addr v11, v12

    .line 153
    or-int/2addr v9, v11

    .line 154
    move v11, v13

    .line 155
    :cond_9
    add-int/lit8 v12, v11, 0x1

    .line 156
    .line 157
    invoke-virtual {v4, v11}, Ljava/lang/String;->charAt(I)C

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-lt v11, v8, :cond_b

    .line 162
    .line 163
    and-int/lit16 v11, v11, 0x1fff

    .line 164
    .line 165
    const/16 v13, 0xd

    .line 166
    .line 167
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 168
    .line 169
    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-lt v12, v8, :cond_a

    .line 174
    .line 175
    and-int/lit16 v12, v12, 0x1fff

    .line 176
    .line 177
    shl-int/2addr v12, v13

    .line 178
    or-int/2addr v11, v12

    .line 179
    add-int/lit8 v13, v13, 0xd

    .line 180
    .line 181
    move v12, v14

    .line 182
    goto :goto_6

    .line 183
    :cond_a
    shl-int/2addr v12, v13

    .line 184
    or-int/2addr v11, v12

    .line 185
    move v12, v14

    .line 186
    :cond_b
    add-int/lit8 v13, v12, 0x1

    .line 187
    .line 188
    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    if-lt v12, v8, :cond_d

    .line 193
    .line 194
    and-int/lit16 v12, v12, 0x1fff

    .line 195
    .line 196
    const/16 v14, 0xd

    .line 197
    .line 198
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 199
    .line 200
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-lt v13, v8, :cond_c

    .line 205
    .line 206
    and-int/lit16 v13, v13, 0x1fff

    .line 207
    .line 208
    shl-int/2addr v13, v14

    .line 209
    or-int/2addr v12, v13

    .line 210
    add-int/lit8 v14, v14, 0xd

    .line 211
    .line 212
    move v13, v15

    .line 213
    goto :goto_7

    .line 214
    :cond_c
    shl-int/2addr v13, v14

    .line 215
    or-int/2addr v12, v13

    .line 216
    move v13, v15

    .line 217
    :cond_d
    add-int/lit8 v14, v13, 0x1

    .line 218
    .line 219
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    if-lt v13, v8, :cond_f

    .line 224
    .line 225
    and-int/lit16 v13, v13, 0x1fff

    .line 226
    .line 227
    const/16 v15, 0xd

    .line 228
    .line 229
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 230
    .line 231
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    if-lt v14, v8, :cond_e

    .line 236
    .line 237
    and-int/lit16 v14, v14, 0x1fff

    .line 238
    .line 239
    shl-int/2addr v14, v15

    .line 240
    or-int/2addr v13, v14

    .line 241
    add-int/lit8 v15, v15, 0xd

    .line 242
    .line 243
    move/from16 v14, v16

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_e
    shl-int/2addr v14, v15

    .line 247
    or-int/2addr v13, v14

    .line 248
    move/from16 v14, v16

    .line 249
    .line 250
    :cond_f
    add-int/lit8 v15, v14, 0x1

    .line 251
    .line 252
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 253
    .line 254
    .line 255
    move-result v14

    .line 256
    if-lt v14, v8, :cond_11

    .line 257
    .line 258
    and-int/lit16 v14, v14, 0x1fff

    .line 259
    .line 260
    const/16 v16, 0xd

    .line 261
    .line 262
    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 263
    .line 264
    invoke-virtual {v4, v15}, Ljava/lang/String;->charAt(I)C

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    if-lt v15, v8, :cond_10

    .line 269
    .line 270
    and-int/lit16 v15, v15, 0x1fff

    .line 271
    .line 272
    shl-int v15, v15, v16

    .line 273
    .line 274
    or-int/2addr v14, v15

    .line 275
    add-int/lit8 v16, v16, 0xd

    .line 276
    .line 277
    move/from16 v15, v17

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_10
    shl-int v15, v15, v16

    .line 281
    .line 282
    or-int/2addr v14, v15

    .line 283
    move/from16 v15, v17

    .line 284
    .line 285
    :cond_11
    add-int/lit8 v16, v15, 0x1

    .line 286
    .line 287
    invoke-virtual {v4, v15}, Ljava/lang/String;->charAt(I)C

    .line 288
    .line 289
    .line 290
    move-result v15

    .line 291
    if-lt v15, v8, :cond_13

    .line 292
    .line 293
    and-int/lit16 v15, v15, 0x1fff

    .line 294
    .line 295
    move/from16 v6, v16

    .line 296
    .line 297
    const/16 v16, 0xd

    .line 298
    .line 299
    :goto_a
    add-int/lit8 v18, v6, 0x1

    .line 300
    .line 301
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-lt v6, v8, :cond_12

    .line 306
    .line 307
    and-int/lit16 v6, v6, 0x1fff

    .line 308
    .line 309
    shl-int v6, v6, v16

    .line 310
    .line 311
    or-int/2addr v15, v6

    .line 312
    add-int/lit8 v16, v16, 0xd

    .line 313
    .line 314
    move/from16 v6, v18

    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_12
    shl-int v6, v6, v16

    .line 318
    .line 319
    or-int/2addr v15, v6

    .line 320
    move/from16 v6, v18

    .line 321
    .line 322
    goto :goto_b

    .line 323
    :cond_13
    move/from16 v6, v16

    .line 324
    .line 325
    :goto_b
    add-int/lit8 v16, v6, 0x1

    .line 326
    .line 327
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-lt v6, v8, :cond_15

    .line 332
    .line 333
    and-int/lit16 v6, v6, 0x1fff

    .line 334
    .line 335
    move/from16 v10, v16

    .line 336
    .line 337
    const/16 v16, 0xd

    .line 338
    .line 339
    :goto_c
    add-int/lit8 v19, v10, 0x1

    .line 340
    .line 341
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    .line 342
    .line 343
    .line 344
    move-result v10

    .line 345
    if-lt v10, v8, :cond_14

    .line 346
    .line 347
    and-int/lit16 v10, v10, 0x1fff

    .line 348
    .line 349
    shl-int v10, v10, v16

    .line 350
    .line 351
    or-int/2addr v6, v10

    .line 352
    add-int/lit8 v16, v16, 0xd

    .line 353
    .line 354
    move/from16 v10, v19

    .line 355
    .line 356
    goto :goto_c

    .line 357
    :cond_14
    shl-int v10, v10, v16

    .line 358
    .line 359
    or-int/2addr v6, v10

    .line 360
    move/from16 v16, v19

    .line 361
    .line 362
    :cond_15
    add-int v10, v6, v14

    .line 363
    .line 364
    add-int/2addr v10, v15

    .line 365
    add-int v15, v7, v7

    .line 366
    .line 367
    add-int/2addr v15, v9

    .line 368
    new-array v9, v10, [I

    .line 369
    .line 370
    move/from16 v27, v6

    .line 371
    .line 372
    move v6, v7

    .line 373
    move/from16 v22, v11

    .line 374
    .line 375
    move/from16 v23, v12

    .line 376
    .line 377
    move/from16 v7, v16

    .line 378
    .line 379
    goto/16 :goto_3

    .line 380
    .line 381
    :goto_d
    sget-object v9, Ltp3;->o:Lsun/misc/Unsafe;

    .line 382
    .line 383
    iget-object v10, v0, Laq3;->c:[Ljava/lang/Object;

    .line 384
    .line 385
    iget-object v11, v0, Laq3;->a:Ltm3;

    .line 386
    .line 387
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v11

    .line 391
    add-int v28, v27, v14

    .line 392
    .line 393
    add-int v12, v13, v13

    .line 394
    .line 395
    const/4 v14, 0x3

    .line 396
    mul-int/2addr v13, v14

    .line 397
    new-array v13, v13, [I

    .line 398
    .line 399
    new-array v12, v12, [Ljava/lang/Object;

    .line 400
    .line 401
    move/from16 v20, v27

    .line 402
    .line 403
    move/from16 v21, v28

    .line 404
    .line 405
    const/4 v2, 0x0

    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    :goto_e
    if-ne v1, v3, :cond_16

    .line 409
    .line 410
    const/16 v25, 0x1

    .line 411
    .line 412
    goto :goto_f

    .line 413
    :cond_16
    const/16 v25, 0x0

    .line 414
    .line 415
    :goto_f
    if-ge v7, v5, :cond_33

    .line 416
    .line 417
    add-int/lit8 v24, v7, 0x1

    .line 418
    .line 419
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    if-lt v7, v8, :cond_18

    .line 424
    .line 425
    and-int/lit16 v7, v7, 0x1fff

    .line 426
    .line 427
    move/from16 v3, v24

    .line 428
    .line 429
    const/16 v24, 0xd

    .line 430
    .line 431
    :goto_10
    add-int/lit8 v30, v3, 0x1

    .line 432
    .line 433
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-lt v3, v8, :cond_17

    .line 438
    .line 439
    and-int/lit16 v3, v3, 0x1fff

    .line 440
    .line 441
    shl-int v3, v3, v24

    .line 442
    .line 443
    or-int/2addr v7, v3

    .line 444
    add-int/lit8 v24, v24, 0xd

    .line 445
    .line 446
    move/from16 v3, v30

    .line 447
    .line 448
    goto :goto_10

    .line 449
    :cond_17
    shl-int v3, v3, v24

    .line 450
    .line 451
    or-int/2addr v7, v3

    .line 452
    move/from16 v3, v30

    .line 453
    .line 454
    goto :goto_11

    .line 455
    :cond_18
    move/from16 v3, v24

    .line 456
    .line 457
    :goto_11
    add-int/lit8 v24, v3, 0x1

    .line 458
    .line 459
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    if-lt v3, v8, :cond_1a

    .line 464
    .line 465
    and-int/lit16 v3, v3, 0x1fff

    .line 466
    .line 467
    move/from16 v14, v24

    .line 468
    .line 469
    const/16 v24, 0xd

    .line 470
    .line 471
    :goto_12
    add-int/lit8 v31, v14, 0x1

    .line 472
    .line 473
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    if-lt v14, v8, :cond_19

    .line 478
    .line 479
    and-int/lit16 v14, v14, 0x1fff

    .line 480
    .line 481
    shl-int v14, v14, v24

    .line 482
    .line 483
    or-int/2addr v3, v14

    .line 484
    add-int/lit8 v24, v24, 0xd

    .line 485
    .line 486
    move/from16 v14, v31

    .line 487
    .line 488
    goto :goto_12

    .line 489
    :cond_19
    shl-int v14, v14, v24

    .line 490
    .line 491
    or-int/2addr v3, v14

    .line 492
    move/from16 v14, v31

    .line 493
    .line 494
    goto :goto_13

    .line 495
    :cond_1a
    move/from16 v14, v24

    .line 496
    .line 497
    :goto_13
    and-int/lit16 v8, v3, 0x400

    .line 498
    .line 499
    if-eqz v8, :cond_1b

    .line 500
    .line 501
    add-int/lit8 v8, v19, 0x1

    .line 502
    .line 503
    aput v2, v26, v19

    .line 504
    .line 505
    move/from16 v19, v8

    .line 506
    .line 507
    :cond_1b
    and-int/lit16 v8, v3, 0xff

    .line 508
    .line 509
    move/from16 v31, v1

    .line 510
    .line 511
    const/16 v1, 0x33

    .line 512
    .line 513
    if-lt v8, v1, :cond_23

    .line 514
    .line 515
    add-int/lit8 v1, v14, 0x1

    .line 516
    .line 517
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 518
    .line 519
    .line 520
    move-result v14

    .line 521
    move/from16 v32, v1

    .line 522
    .line 523
    const v1, 0xd800

    .line 524
    .line 525
    .line 526
    if-lt v14, v1, :cond_1d

    .line 527
    .line 528
    and-int/lit16 v14, v14, 0x1fff

    .line 529
    .line 530
    move/from16 v34, v32

    .line 531
    .line 532
    move/from16 v32, v14

    .line 533
    .line 534
    move/from16 v14, v34

    .line 535
    .line 536
    const/16 v34, 0xd

    .line 537
    .line 538
    :goto_14
    add-int/lit8 v35, v14, 0x1

    .line 539
    .line 540
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 541
    .line 542
    .line 543
    move-result v14

    .line 544
    if-lt v14, v1, :cond_1c

    .line 545
    .line 546
    and-int/lit16 v1, v14, 0x1fff

    .line 547
    .line 548
    shl-int v1, v1, v34

    .line 549
    .line 550
    or-int v32, v32, v1

    .line 551
    .line 552
    add-int/lit8 v34, v34, 0xd

    .line 553
    .line 554
    move/from16 v14, v35

    .line 555
    .line 556
    const v1, 0xd800

    .line 557
    .line 558
    .line 559
    goto :goto_14

    .line 560
    :cond_1c
    shl-int v1, v14, v34

    .line 561
    .line 562
    or-int v14, v32, v1

    .line 563
    .line 564
    move/from16 v1, v35

    .line 565
    .line 566
    goto :goto_15

    .line 567
    :cond_1d
    move/from16 v1, v32

    .line 568
    .line 569
    :goto_15
    move/from16 v32, v1

    .line 570
    .line 571
    add-int/lit8 v1, v8, -0x33

    .line 572
    .line 573
    move/from16 v34, v5

    .line 574
    .line 575
    const/16 v5, 0x9

    .line 576
    .line 577
    if-eq v1, v5, :cond_1e

    .line 578
    .line 579
    const/16 v5, 0x11

    .line 580
    .line 581
    if-ne v1, v5, :cond_1f

    .line 582
    .line 583
    :cond_1e
    const/4 v1, 0x3

    .line 584
    const/4 v5, 0x1

    .line 585
    goto :goto_16

    .line 586
    :cond_1f
    const/16 v5, 0xc

    .line 587
    .line 588
    if-ne v1, v5, :cond_20

    .line 589
    .line 590
    if-nez v25, :cond_20

    .line 591
    .line 592
    const/4 v1, 0x3

    .line 593
    const/4 v5, 0x1

    .line 594
    invoke-static {v2, v1, v5}, Lpm2;->f(III)I

    .line 595
    .line 596
    .line 597
    move-result v16

    .line 598
    add-int/lit8 v25, v15, 0x1

    .line 599
    .line 600
    aget-object v15, v10, v15

    .line 601
    .line 602
    aput-object v15, v12, v16

    .line 603
    .line 604
    move/from16 v15, v25

    .line 605
    .line 606
    goto :goto_17

    .line 607
    :cond_20
    const/4 v1, 0x3

    .line 608
    const/4 v5, 0x1

    .line 609
    goto :goto_17

    .line 610
    :goto_16
    invoke-static {v2, v1, v5}, Lpm2;->f(III)I

    .line 611
    .line 612
    .line 613
    move-result v25

    .line 614
    add-int/lit8 v1, v15, 0x1

    .line 615
    .line 616
    aget-object v5, v10, v15

    .line 617
    .line 618
    aput-object v5, v12, v25

    .line 619
    .line 620
    move v15, v1

    .line 621
    :goto_17
    add-int/2addr v14, v14

    .line 622
    aget-object v1, v10, v14

    .line 623
    .line 624
    instance-of v5, v1, Ljava/lang/reflect/Field;

    .line 625
    .line 626
    if-eqz v5, :cond_21

    .line 627
    .line 628
    check-cast v1, Ljava/lang/reflect/Field;

    .line 629
    .line 630
    :goto_18
    move/from16 v35, v6

    .line 631
    .line 632
    goto :goto_19

    .line 633
    :cond_21
    check-cast v1, Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v11, v1}, Ltp3;->v(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    aput-object v1, v10, v14

    .line 640
    .line 641
    goto :goto_18

    .line 642
    :goto_19
    invoke-virtual {v9, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 643
    .line 644
    .line 645
    move-result-wide v5

    .line 646
    long-to-int v1, v5

    .line 647
    add-int/lit8 v14, v14, 0x1

    .line 648
    .line 649
    aget-object v5, v10, v14

    .line 650
    .line 651
    instance-of v6, v5, Ljava/lang/reflect/Field;

    .line 652
    .line 653
    if-eqz v6, :cond_22

    .line 654
    .line 655
    check-cast v5, Ljava/lang/reflect/Field;

    .line 656
    .line 657
    goto :goto_1a

    .line 658
    :cond_22
    check-cast v5, Ljava/lang/String;

    .line 659
    .line 660
    invoke-static {v11, v5}, Ltp3;->v(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    aput-object v5, v10, v14

    .line 665
    .line 666
    :goto_1a
    invoke-virtual {v9, v5}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 667
    .line 668
    .line 669
    move-result-wide v5

    .line 670
    long-to-int v5, v5

    .line 671
    move/from16 v33, v1

    .line 672
    .line 673
    move/from16 v16, v2

    .line 674
    .line 675
    move/from16 v25, v5

    .line 676
    .line 677
    move/from16 v14, v32

    .line 678
    .line 679
    const v1, 0xd800

    .line 680
    .line 681
    .line 682
    const/4 v5, 0x0

    .line 683
    goto/16 :goto_26

    .line 684
    .line 685
    :cond_23
    move/from16 v34, v5

    .line 686
    .line 687
    move/from16 v35, v6

    .line 688
    .line 689
    add-int/lit8 v1, v15, 0x1

    .line 690
    .line 691
    aget-object v5, v10, v15

    .line 692
    .line 693
    check-cast v5, Ljava/lang/String;

    .line 694
    .line 695
    invoke-static {v11, v5}, Ltp3;->v(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    const/16 v6, 0x9

    .line 700
    .line 701
    if-eq v8, v6, :cond_24

    .line 702
    .line 703
    const/16 v6, 0x11

    .line 704
    .line 705
    if-ne v8, v6, :cond_25

    .line 706
    .line 707
    :cond_24
    move/from16 v16, v1

    .line 708
    .line 709
    const/4 v1, 0x1

    .line 710
    const/4 v6, 0x3

    .line 711
    goto/16 :goto_1f

    .line 712
    .line 713
    :cond_25
    const/16 v6, 0x1b

    .line 714
    .line 715
    if-eq v8, v6, :cond_26

    .line 716
    .line 717
    const/16 v6, 0x31

    .line 718
    .line 719
    if-ne v8, v6, :cond_27

    .line 720
    .line 721
    :cond_26
    move/from16 v16, v1

    .line 722
    .line 723
    const/4 v1, 0x1

    .line 724
    const/4 v6, 0x3

    .line 725
    goto :goto_1e

    .line 726
    :cond_27
    const/16 v6, 0xc

    .line 727
    .line 728
    if-eq v8, v6, :cond_2b

    .line 729
    .line 730
    const/16 v6, 0x1e

    .line 731
    .line 732
    if-eq v8, v6, :cond_2b

    .line 733
    .line 734
    const/16 v6, 0x2c

    .line 735
    .line 736
    if-ne v8, v6, :cond_28

    .line 737
    .line 738
    goto :goto_1c

    .line 739
    :cond_28
    const/16 v6, 0x32

    .line 740
    .line 741
    if-ne v8, v6, :cond_2a

    .line 742
    .line 743
    add-int/lit8 v6, v20, 0x1

    .line 744
    .line 745
    aput v2, v26, v20

    .line 746
    .line 747
    div-int/lit8 v20, v2, 0x3

    .line 748
    .line 749
    add-int/lit8 v25, v15, 0x2

    .line 750
    .line 751
    aget-object v1, v10, v1

    .line 752
    .line 753
    add-int v20, v20, v20

    .line 754
    .line 755
    aput-object v1, v12, v20

    .line 756
    .line 757
    and-int/lit16 v1, v3, 0x800

    .line 758
    .line 759
    if-eqz v1, :cond_29

    .line 760
    .line 761
    add-int/lit8 v20, v20, 0x1

    .line 762
    .line 763
    add-int/lit8 v1, v15, 0x3

    .line 764
    .line 765
    aget-object v15, v10, v25

    .line 766
    .line 767
    aput-object v15, v12, v20

    .line 768
    .line 769
    move v15, v1

    .line 770
    move/from16 v16, v2

    .line 771
    .line 772
    move/from16 v20, v6

    .line 773
    .line 774
    :goto_1b
    const/4 v6, 0x3

    .line 775
    goto :goto_21

    .line 776
    :cond_29
    move/from16 v16, v2

    .line 777
    .line 778
    move/from16 v20, v6

    .line 779
    .line 780
    move/from16 v15, v25

    .line 781
    .line 782
    goto :goto_1b

    .line 783
    :cond_2a
    move/from16 v16, v1

    .line 784
    .line 785
    const/4 v1, 0x1

    .line 786
    const/4 v6, 0x3

    .line 787
    goto :goto_20

    .line 788
    :cond_2b
    :goto_1c
    if-nez v25, :cond_2a

    .line 789
    .line 790
    move/from16 v16, v1

    .line 791
    .line 792
    const/4 v1, 0x1

    .line 793
    const/4 v6, 0x3

    .line 794
    invoke-static {v2, v6, v1}, Lpm2;->f(III)I

    .line 795
    .line 796
    .line 797
    move-result v25

    .line 798
    add-int/lit8 v15, v15, 0x2

    .line 799
    .line 800
    aget-object v16, v10, v16

    .line 801
    .line 802
    aput-object v16, v12, v25

    .line 803
    .line 804
    :goto_1d
    move/from16 v16, v2

    .line 805
    .line 806
    goto :goto_21

    .line 807
    :goto_1e
    invoke-static {v2, v6, v1}, Lpm2;->f(III)I

    .line 808
    .line 809
    .line 810
    move-result v25

    .line 811
    add-int/lit8 v15, v15, 0x2

    .line 812
    .line 813
    aget-object v16, v10, v16

    .line 814
    .line 815
    aput-object v16, v12, v25

    .line 816
    .line 817
    goto :goto_1d

    .line 818
    :goto_1f
    invoke-static {v2, v6, v1}, Lpm2;->f(III)I

    .line 819
    .line 820
    .line 821
    move-result v15

    .line 822
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    move-result-object v25

    .line 826
    aput-object v25, v12, v15

    .line 827
    .line 828
    :goto_20
    move/from16 v15, v16

    .line 829
    .line 830
    goto :goto_1d

    .line 831
    :goto_21
    invoke-virtual {v9, v5}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 832
    .line 833
    .line 834
    move-result-wide v1

    .line 835
    long-to-int v1, v1

    .line 836
    and-int/lit16 v2, v3, 0x1000

    .line 837
    .line 838
    const/16 v5, 0x1000

    .line 839
    .line 840
    if-ne v2, v5, :cond_2f

    .line 841
    .line 842
    const/16 v5, 0x11

    .line 843
    .line 844
    if-gt v8, v5, :cond_2f

    .line 845
    .line 846
    add-int/lit8 v2, v14, 0x1

    .line 847
    .line 848
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    const v14, 0xd800

    .line 853
    .line 854
    .line 855
    if-lt v5, v14, :cond_2d

    .line 856
    .line 857
    and-int/lit16 v5, v5, 0x1fff

    .line 858
    .line 859
    const/16 v24, 0xd

    .line 860
    .line 861
    :goto_22
    add-int/lit8 v25, v2, 0x1

    .line 862
    .line 863
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    if-lt v2, v14, :cond_2c

    .line 868
    .line 869
    and-int/lit16 v2, v2, 0x1fff

    .line 870
    .line 871
    shl-int v2, v2, v24

    .line 872
    .line 873
    or-int/2addr v5, v2

    .line 874
    add-int/lit8 v24, v24, 0xd

    .line 875
    .line 876
    move/from16 v2, v25

    .line 877
    .line 878
    goto :goto_22

    .line 879
    :cond_2c
    shl-int v2, v2, v24

    .line 880
    .line 881
    or-int/2addr v5, v2

    .line 882
    move/from16 v2, v25

    .line 883
    .line 884
    :cond_2d
    add-int v24, v35, v35

    .line 885
    .line 886
    div-int/lit8 v25, v5, 0x20

    .line 887
    .line 888
    add-int v25, v25, v24

    .line 889
    .line 890
    aget-object v6, v10, v25

    .line 891
    .line 892
    instance-of v14, v6, Ljava/lang/reflect/Field;

    .line 893
    .line 894
    if-eqz v14, :cond_2e

    .line 895
    .line 896
    check-cast v6, Ljava/lang/reflect/Field;

    .line 897
    .line 898
    :goto_23
    move/from16 v33, v1

    .line 899
    .line 900
    move v14, v2

    .line 901
    goto :goto_24

    .line 902
    :cond_2e
    check-cast v6, Ljava/lang/String;

    .line 903
    .line 904
    invoke-static {v11, v6}, Ltp3;->v(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 905
    .line 906
    .line 907
    move-result-object v6

    .line 908
    aput-object v6, v10, v25

    .line 909
    .line 910
    goto :goto_23

    .line 911
    :goto_24
    invoke-virtual {v9, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 912
    .line 913
    .line 914
    move-result-wide v1

    .line 915
    long-to-int v1, v1

    .line 916
    rem-int/lit8 v5, v5, 0x20

    .line 917
    .line 918
    move/from16 v25, v1

    .line 919
    .line 920
    const v1, 0xd800

    .line 921
    .line 922
    .line 923
    goto :goto_25

    .line 924
    :cond_2f
    move/from16 v33, v1

    .line 925
    .line 926
    const v1, 0xd800

    .line 927
    .line 928
    .line 929
    const/4 v5, 0x0

    .line 930
    const v25, 0xfffff

    .line 931
    .line 932
    .line 933
    :goto_25
    const/16 v2, 0x12

    .line 934
    .line 935
    if-lt v8, v2, :cond_30

    .line 936
    .line 937
    const/16 v6, 0x31

    .line 938
    .line 939
    if-gt v8, v6, :cond_30

    .line 940
    .line 941
    add-int/lit8 v2, v21, 0x1

    .line 942
    .line 943
    aput v33, v26, v21

    .line 944
    .line 945
    move/from16 v21, v2

    .line 946
    .line 947
    :cond_30
    :goto_26
    add-int/lit8 v2, v16, 0x1

    .line 948
    .line 949
    aput v7, v13, v16

    .line 950
    .line 951
    add-int/lit8 v6, v16, 0x2

    .line 952
    .line 953
    and-int/lit16 v7, v3, 0x200

    .line 954
    .line 955
    if-eqz v7, :cond_31

    .line 956
    .line 957
    const/high16 v7, 0x20000000

    .line 958
    .line 959
    goto :goto_27

    .line 960
    :cond_31
    const/4 v7, 0x0

    .line 961
    :goto_27
    and-int/lit16 v3, v3, 0x100

    .line 962
    .line 963
    if-eqz v3, :cond_32

    .line 964
    .line 965
    const/high16 v3, 0x10000000

    .line 966
    .line 967
    goto :goto_28

    .line 968
    :cond_32
    const/4 v3, 0x0

    .line 969
    :goto_28
    shl-int/lit8 v8, v8, 0x14

    .line 970
    .line 971
    or-int/2addr v3, v7

    .line 972
    or-int/2addr v3, v8

    .line 973
    or-int v3, v3, v33

    .line 974
    .line 975
    aput v3, v13, v2

    .line 976
    .line 977
    add-int/lit8 v2, v16, 0x3

    .line 978
    .line 979
    shl-int/lit8 v3, v5, 0x14

    .line 980
    .line 981
    or-int v3, v3, v25

    .line 982
    .line 983
    aput v3, v13, v6

    .line 984
    .line 985
    move v8, v1

    .line 986
    move v7, v14

    .line 987
    move/from16 v1, v31

    .line 988
    .line 989
    move/from16 v5, v34

    .line 990
    .line 991
    move/from16 v6, v35

    .line 992
    .line 993
    const/4 v3, 0x2

    .line 994
    const/4 v14, 0x3

    .line 995
    goto/16 :goto_e

    .line 996
    .line 997
    :cond_33
    new-instance v19, Ltp3;

    .line 998
    .line 999
    iget-object v0, v0, Laq3;->a:Ltm3;

    .line 1000
    .line 1001
    move-object/from16 v29, p1

    .line 1002
    .line 1003
    move-object/from16 v30, p2

    .line 1004
    .line 1005
    move-object/from16 v31, p3

    .line 1006
    .line 1007
    move-object/from16 v24, v0

    .line 1008
    .line 1009
    move-object/from16 v21, v12

    .line 1010
    .line 1011
    move-object/from16 v20, v13

    .line 1012
    .line 1013
    invoke-direct/range {v19 .. v31}, Ltp3;-><init>([I[Ljava/lang/Object;IILtm3;Z[IIILep3;Lnq3;Lqn3;)V

    .line 1014
    .line 1015
    .line 1016
    return-object v19

    .line 1017
    :cond_34
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 1018
    .line 1019
    .line 1020
    const/4 v0, 0x0

    .line 1021
    return-object v0
.end method

.method public static v(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/lit8 v1, v1, 0xb

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    add-int/2addr v1, v2

    .line 57
    add-int/lit8 v1, v1, 0x1d

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    add-int/2addr v1, v2

    .line 66
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const-string v1, "Field "

    .line 70
    .line 71
    const-string v2, " for "

    .line 72
    .line 73
    invoke-static {v3, v1, p1, v2, p0}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p0, " not found. Known fields are "

    .line 77
    .line 78
    invoke-static {v3, p0, v0}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/Object;IJ)V
    .locals 3

    .line 1
    sget-object v0, Ltp3;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Ltp3;->D(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p1, p3, p4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    move-object v1, p2

    .line 12
    check-cast v1, Llp3;

    .line 13
    .line 14
    iget-boolean v1, v1, Llp3;->a:Z

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Llp3;->b:Llp3;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v1, Llp3;

    .line 27
    .line 28
    invoke-direct {v1}, Llp3;-><init>()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v2, Llp3;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v2, Llp3;->a:Z

    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :goto_0
    invoke-static {v1, p2}, Lnp3;->b(Ljava/lang/Object;Ljava/lang/Object;)Llp3;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1, p3, p4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance p0, Ljava/lang/ClassCastException;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method public final B(Ljava/lang/Object;[BIIIIIIIJILym3;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    move/from16 v9, p6

    .line 8
    .line 9
    move/from16 v3, p7

    .line 10
    .line 11
    move-wide/from16 v4, p10

    .line 12
    .line 13
    move/from16 v10, p12

    .line 14
    .line 15
    sget-object v6, Ltp3;->o:Lsun/misc/Unsafe;

    .line 16
    .line 17
    add-int/lit8 v7, v10, 0x2

    .line 18
    .line 19
    iget-object v8, v0, Ltp3;->a:[I

    .line 20
    .line 21
    aget v7, v8, v7

    .line 22
    .line 23
    const v8, 0xfffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v7, v8

    .line 27
    int-to-long v7, v7

    .line 28
    const/4 v11, 0x5

    .line 29
    const/4 v12, 0x1

    .line 30
    const/4 v13, 0x2

    .line 31
    packed-switch p9, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    :cond_0
    move/from16 v14, p3

    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :pswitch_0
    const/4 v4, 0x3

    .line 39
    if-ne v3, v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v9, v1, v10}, Ltp3;->H(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    and-int/lit8 v2, v2, -0x8

    .line 46
    .line 47
    or-int/lit8 v7, v2, 0x4

    .line 48
    .line 49
    invoke-virtual {v0, v10}, Ltp3;->C(I)Lbq3;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ltp3;

    .line 54
    .line 55
    move-object/from16 v4, p2

    .line 56
    .line 57
    move/from16 v5, p3

    .line 58
    .line 59
    move/from16 v6, p4

    .line 60
    .line 61
    move-object/from16 v8, p13

    .line 62
    .line 63
    invoke-virtual/range {v2 .. v8}, Ltp3;->t(Ljava/lang/Object;[BIIILym3;)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    move-object v11, v8

    .line 68
    iput-object v3, v11, Lym3;->c:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v0, v1, v9, v10, v3}, Ltp3;->f(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return v2

    .line 74
    :pswitch_1
    move-object/from16 v15, p2

    .line 75
    .line 76
    move/from16 v14, p3

    .line 77
    .line 78
    move-object/from16 v11, p13

    .line 79
    .line 80
    if-nez v3, :cond_7

    .line 81
    .line 82
    invoke-static {v15, v14, v11}, Lw11;->e0([BILym3;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-wide v2, v11, Lym3;->b:J

    .line 87
    .line 88
    const-wide/16 v10, 0x1

    .line 89
    .line 90
    and-long/2addr v10, v2

    .line 91
    ushr-long/2addr v2, v12

    .line 92
    neg-long v10, v10

    .line 93
    xor-long/2addr v2, v10

    .line 94
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 102
    .line 103
    .line 104
    return v0

    .line 105
    :pswitch_2
    move-object/from16 v15, p2

    .line 106
    .line 107
    move/from16 v14, p3

    .line 108
    .line 109
    move-object/from16 v11, p13

    .line 110
    .line 111
    if-nez v3, :cond_7

    .line 112
    .line 113
    invoke-static {v15, v14, v11}, Lw11;->Z([BILym3;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget v2, v11, Lym3;->a:I

    .line 118
    .line 119
    and-int/lit8 v3, v2, 0x1

    .line 120
    .line 121
    ushr-int/2addr v2, v12

    .line 122
    neg-int v3, v3

    .line 123
    xor-int/2addr v2, v3

    .line 124
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 132
    .line 133
    .line 134
    return v0

    .line 135
    :pswitch_3
    move-object/from16 v15, p2

    .line 136
    .line 137
    move/from16 v14, p3

    .line 138
    .line 139
    move-object/from16 v11, p13

    .line 140
    .line 141
    if-nez v3, :cond_7

    .line 142
    .line 143
    invoke-static {v15, v14, v11}, Lw11;->Z([BILym3;)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    iget v11, v11, Lym3;->a:I

    .line 148
    .line 149
    invoke-virtual {v0, v10}, Ltp3;->E(I)Lqm3;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    invoke-virtual {v0, v11}, Lqm3;->a(I)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_1
    invoke-static {v1}, Ltp3;->s(Ljava/lang/Object;)Lmq3;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    int-to-long v4, v11

    .line 167
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0, v2, v1}, Lmq3;->d(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return v3

    .line 175
    :cond_2
    :goto_0
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v6, v1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 183
    .line 184
    .line 185
    return v3

    .line 186
    :pswitch_4
    move-object/from16 v15, p2

    .line 187
    .line 188
    move/from16 v14, p3

    .line 189
    .line 190
    move-object/from16 v11, p13

    .line 191
    .line 192
    if-ne v3, v13, :cond_7

    .line 193
    .line 194
    invoke-static {v15, v14, v11}, Lw11;->k0([BILym3;)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iget-object v2, v11, Lym3;->c:Ljava/lang/Object;

    .line 199
    .line 200
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 204
    .line 205
    .line 206
    return v0

    .line 207
    :pswitch_5
    move-object/from16 v15, p2

    .line 208
    .line 209
    move/from16 v14, p3

    .line 210
    .line 211
    move-object/from16 v11, p13

    .line 212
    .line 213
    if-ne v3, v13, :cond_7

    .line 214
    .line 215
    invoke-virtual {v0, v9, v1, v10}, Ltp3;->H(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v0, v10}, Ltp3;->C(I)Lbq3;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    move/from16 v6, p4

    .line 224
    .line 225
    move-object v7, v11

    .line 226
    move v5, v14

    .line 227
    move-object v4, v15

    .line 228
    invoke-static/range {v2 .. v7}, Lw11;->l0(Ljava/lang/Object;Lbq3;[BIILym3;)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-virtual {v0, v1, v9, v10, v2}, Ltp3;->f(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return v3

    .line 236
    :pswitch_6
    move-object/from16 v15, p2

    .line 237
    .line 238
    move/from16 v14, p3

    .line 239
    .line 240
    move-object/from16 v11, p13

    .line 241
    .line 242
    if-ne v3, v13, :cond_7

    .line 243
    .line 244
    invoke-static {v15, v14, v11}, Lw11;->Z([BILym3;)I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    iget v2, v11, Lym3;->a:I

    .line 249
    .line 250
    if-nez v2, :cond_3

    .line 251
    .line 252
    const-string v2, ""

    .line 253
    .line 254
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_3
    const/high16 v3, 0x20000000

    .line 259
    .line 260
    and-int v3, p8, v3

    .line 261
    .line 262
    if-eqz v3, :cond_5

    .line 263
    .line 264
    add-int v3, v0, v2

    .line 265
    .line 266
    sget-object v10, Lzq3;->a:Lcg3;

    .line 267
    .line 268
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {v15, v0, v3}, Lcg3;->a([BII)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_4

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_4
    invoke-static {}, Luo3;->d()Luo3;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    throw v0

    .line 283
    :cond_5
    :goto_1
    new-instance v3, Ljava/lang/String;

    .line 284
    .line 285
    sget-object v10, Lso3;->a:Ljava/nio/charset/Charset;

    .line 286
    .line 287
    invoke-direct {v3, v15, v0, v2, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    add-int/2addr v0, v2

    .line 294
    :goto_2
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 295
    .line 296
    .line 297
    return v0

    .line 298
    :pswitch_7
    move-object/from16 v15, p2

    .line 299
    .line 300
    move/from16 v14, p3

    .line 301
    .line 302
    move-object/from16 v11, p13

    .line 303
    .line 304
    if-nez v3, :cond_7

    .line 305
    .line 306
    invoke-static {v15, v14, v11}, Lw11;->e0([BILym3;)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    iget-wide v2, v11, Lym3;->b:J

    .line 311
    .line 312
    const-wide/16 v10, 0x0

    .line 313
    .line 314
    cmp-long v2, v2, v10

    .line 315
    .line 316
    if-eqz v2, :cond_6

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_6
    const/4 v12, 0x0

    .line 320
    :goto_3
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 328
    .line 329
    .line 330
    return v0

    .line 331
    :pswitch_8
    move-object/from16 v15, p2

    .line 332
    .line 333
    move/from16 v14, p3

    .line 334
    .line 335
    if-ne v3, v11, :cond_7

    .line 336
    .line 337
    invoke-static/range {p2 .. p3}, Lw11;->g0([BI)I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v6, v1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    add-int/lit8 v0, v14, 0x4

    .line 349
    .line 350
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 351
    .line 352
    .line 353
    return v0

    .line 354
    :pswitch_9
    move-object/from16 v15, p2

    .line 355
    .line 356
    move/from16 v14, p3

    .line 357
    .line 358
    if-ne v3, v12, :cond_7

    .line 359
    .line 360
    invoke-static/range {p2 .. p3}, Lw11;->h0([BI)J

    .line 361
    .line 362
    .line 363
    move-result-wide v2

    .line 364
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v6, v1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    add-int/lit8 v0, v14, 0x8

    .line 372
    .line 373
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 374
    .line 375
    .line 376
    return v0

    .line 377
    :pswitch_a
    move-object/from16 v15, p2

    .line 378
    .line 379
    move/from16 v14, p3

    .line 380
    .line 381
    move-object/from16 v11, p13

    .line 382
    .line 383
    if-nez v3, :cond_7

    .line 384
    .line 385
    invoke-static {v15, v14, v11}, Lw11;->Z([BILym3;)I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    iget v2, v11, Lym3;->a:I

    .line 390
    .line 391
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 399
    .line 400
    .line 401
    return v0

    .line 402
    :pswitch_b
    move-object/from16 v15, p2

    .line 403
    .line 404
    move/from16 v14, p3

    .line 405
    .line 406
    move-object/from16 v11, p13

    .line 407
    .line 408
    if-nez v3, :cond_7

    .line 409
    .line 410
    invoke-static {v15, v14, v11}, Lw11;->e0([BILym3;)I

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    iget-wide v2, v11, Lym3;->b:J

    .line 415
    .line 416
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 424
    .line 425
    .line 426
    return v0

    .line 427
    :pswitch_c
    move-object/from16 v15, p2

    .line 428
    .line 429
    move/from16 v14, p3

    .line 430
    .line 431
    if-ne v3, v11, :cond_7

    .line 432
    .line 433
    invoke-static/range {p2 .. p3}, Lw11;->g0([BI)I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v6, v1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    add-int/lit8 v0, v14, 0x4

    .line 449
    .line 450
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 451
    .line 452
    .line 453
    return v0

    .line 454
    :pswitch_d
    move-object/from16 v15, p2

    .line 455
    .line 456
    move/from16 v14, p3

    .line 457
    .line 458
    if-ne v3, v12, :cond_7

    .line 459
    .line 460
    invoke-static/range {p2 .. p3}, Lw11;->h0([BI)J

    .line 461
    .line 462
    .line 463
    move-result-wide v2

    .line 464
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 465
    .line 466
    .line 467
    move-result-wide v2

    .line 468
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v6, v1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    add-int/lit8 v0, v14, 0x8

    .line 476
    .line 477
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 478
    .line 479
    .line 480
    return v0

    .line 481
    :cond_7
    :goto_4
    return v14

    .line 482
    nop

    .line 483
    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final C(I)Lbq3;
    .locals 2

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    iget-object p0, p0, Ltp3;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object v0, p0, p1

    .line 7
    .line 8
    check-cast v0, Lbq3;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    sget-object v0, Lyp3;->c:Lyp3;

    .line 14
    .line 15
    add-int/lit8 v1, p1, 0x1

    .line 16
    .line 17
    aget-object v1, p0, v1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lyp3;->a(Ljava/lang/Class;)Lbq3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aput-object v0, p0, p1

    .line 26
    .line 27
    return-object v0
.end method

.method public final D(I)Ljava/lang/Object;
    .locals 0

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget-object p0, p0, Ltp3;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object p0, p0, p1

    .line 7
    .line 8
    return-object p0
.end method

.method public final E(I)Lqm3;
    .locals 0

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    add-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    iget-object p0, p0, Ltp3;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object p0, p0, p1

    .line 9
    .line 10
    check-cast p0, Lqm3;

    .line 11
    .line 12
    return-object p0
.end method

.method public final F(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Ltp3;->C(I)Lbq3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p2}, Ltp3;->g(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    invoke-virtual {p0, p2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lbq3;->zza()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    int-to-long v1, v1

    .line 25
    sget-object p0, Ltp3;->o:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-interface {v0}, Lbq3;->zza()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p1, p0}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p1
.end method

.method public final G(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Ltp3;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltp3;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Ltp3;->o(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final H(ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Ltp3;->C(I)Lbq3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lbq3;->zza()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p1, Ltp3;->o:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Ltp3;->g(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const p3, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p0, p3

    .line 26
    int-to-long v1, p0

    .line 27
    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-interface {v0}, Lbq3;->zza()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p1, p0}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p1
.end method

.method public final a(Leo3;)I
    .locals 12

    .line 1
    iget-object v0, p0, Ltp3;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Ltp3;->g(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    invoke-static {v4}, Ltp3;->h(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    int-to-long v6, v6

    .line 23
    const/16 v8, 0x4d5

    .line 24
    .line 25
    const/16 v9, 0x4cf

    .line 26
    .line 27
    const/16 v10, 0x25

    .line 28
    .line 29
    const/16 v11, 0x20

    .line 30
    .line 31
    packed-switch v4, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_0
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    mul-int/lit8 v3, v3, 0x35

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    :goto_1
    add-int/2addr v4, v3

    .line 53
    move v3, v4

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :pswitch_1
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v3, v3, 0x35

    .line 63
    .line 64
    invoke-static {p1, v6, v7}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    :goto_2
    ushr-long v6, v4, v11

    .line 71
    .line 72
    xor-long/2addr v4, v6

    .line 73
    long-to-int v4, v4

    .line 74
    add-int/2addr v3, v4

    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :pswitch_2
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    mul-int/lit8 v3, v3, 0x35

    .line 84
    .line 85
    invoke-static {p1, v6, v7}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    goto :goto_1

    .line 90
    :pswitch_3
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    mul-int/lit8 v3, v3, 0x35

    .line 97
    .line 98
    invoke-static {p1, v6, v7}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :pswitch_4
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    mul-int/lit8 v3, v3, 0x35

    .line 112
    .line 113
    invoke-static {p1, v6, v7}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    goto :goto_1

    .line 118
    :pswitch_5
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_2

    .line 123
    .line 124
    mul-int/lit8 v3, v3, 0x35

    .line 125
    .line 126
    invoke-static {p1, v6, v7}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    goto :goto_1

    .line 131
    :pswitch_6
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_2

    .line 136
    .line 137
    mul-int/lit8 v3, v3, 0x35

    .line 138
    .line 139
    invoke-static {p1, v6, v7}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    goto :goto_1

    .line 144
    :pswitch_7
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_2

    .line 149
    .line 150
    mul-int/lit8 v3, v3, 0x35

    .line 151
    .line 152
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    goto :goto_1

    .line 161
    :pswitch_8
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_2

    .line 166
    .line 167
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    mul-int/lit8 v3, v3, 0x35

    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    goto :goto_1

    .line 178
    :pswitch_9
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_2

    .line 183
    .line 184
    mul-int/lit8 v3, v3, 0x35

    .line 185
    .line 186
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :pswitch_a
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_2

    .line 203
    .line 204
    mul-int/lit8 v3, v3, 0x35

    .line 205
    .line 206
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    sget-object v5, Lso3;->a:Ljava/nio/charset/Charset;

    .line 217
    .line 218
    if-eqz v4, :cond_0

    .line 219
    .line 220
    :goto_3
    move v8, v9

    .line 221
    :cond_0
    add-int/2addr v8, v3

    .line 222
    move v3, v8

    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :pswitch_b
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-eqz v4, :cond_2

    .line 230
    .line 231
    mul-int/lit8 v3, v3, 0x35

    .line 232
    .line 233
    invoke-static {p1, v6, v7}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :pswitch_c
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eqz v4, :cond_2

    .line 244
    .line 245
    mul-int/lit8 v3, v3, 0x35

    .line 246
    .line 247
    invoke-static {p1, v6, v7}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 248
    .line 249
    .line 250
    move-result-wide v4

    .line 251
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :pswitch_d
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_2

    .line 260
    .line 261
    mul-int/lit8 v3, v3, 0x35

    .line 262
    .line 263
    invoke-static {p1, v6, v7}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_e
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_2

    .line 274
    .line 275
    mul-int/lit8 v3, v3, 0x35

    .line 276
    .line 277
    invoke-static {p1, v6, v7}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 278
    .line 279
    .line 280
    move-result-wide v4

    .line 281
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 282
    .line 283
    goto/16 :goto_2

    .line 284
    .line 285
    :pswitch_f
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_2

    .line 290
    .line 291
    mul-int/lit8 v3, v3, 0x35

    .line 292
    .line 293
    invoke-static {p1, v6, v7}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :pswitch_10
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-eqz v4, :cond_2

    .line 306
    .line 307
    mul-int/lit8 v3, v3, 0x35

    .line 308
    .line 309
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    check-cast v4, Ljava/lang/Float;

    .line 314
    .line 315
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :pswitch_11
    invoke-virtual {p0, v5, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    if-eqz v4, :cond_2

    .line 330
    .line 331
    mul-int/lit8 v3, v3, 0x35

    .line 332
    .line 333
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    check-cast v4, Ljava/lang/Double;

    .line 338
    .line 339
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v4

    .line 343
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 344
    .line 345
    .line 346
    move-result-wide v4

    .line 347
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 352
    .line 353
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 364
    .line 365
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :pswitch_14
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    if-eqz v4, :cond_1

    .line 380
    .line 381
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    :cond_1
    :goto_4
    mul-int/lit8 v3, v3, 0x35

    .line 386
    .line 387
    add-int/2addr v3, v10

    .line 388
    goto/16 :goto_5

    .line 389
    .line 390
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 391
    .line 392
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 393
    .line 394
    .line 395
    move-result-wide v4

    .line 396
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 397
    .line 398
    goto/16 :goto_2

    .line 399
    .line 400
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 401
    .line 402
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 409
    .line 410
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 411
    .line 412
    .line 413
    move-result-wide v4

    .line 414
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 419
    .line 420
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 427
    .line 428
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 435
    .line 436
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 443
    .line 444
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_1c
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    if-eqz v4, :cond_1

    .line 459
    .line 460
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    goto :goto_4

    .line 465
    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 466
    .line 467
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    check-cast v4, Ljava/lang/String;

    .line 472
    .line 473
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    goto/16 :goto_1

    .line 478
    .line 479
    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 480
    .line 481
    sget-object v4, Ltq3;->c:Lsq3;

    .line 482
    .line 483
    invoke-virtual {v4, p1, v6, v7}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    sget-object v5, Lso3;->a:Ljava/nio/charset/Charset;

    .line 488
    .line 489
    if-eqz v4, :cond_0

    .line 490
    .line 491
    goto/16 :goto_3

    .line 492
    .line 493
    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 494
    .line 495
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    goto/16 :goto_1

    .line 500
    .line 501
    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 502
    .line 503
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 504
    .line 505
    .line 506
    move-result-wide v4

    .line 507
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 508
    .line 509
    goto/16 :goto_2

    .line 510
    .line 511
    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 512
    .line 513
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    goto/16 :goto_1

    .line 518
    .line 519
    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 520
    .line 521
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 522
    .line 523
    .line 524
    move-result-wide v4

    .line 525
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 526
    .line 527
    goto/16 :goto_2

    .line 528
    .line 529
    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 530
    .line 531
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 532
    .line 533
    .line 534
    move-result-wide v4

    .line 535
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 536
    .line 537
    goto/16 :goto_2

    .line 538
    .line 539
    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 540
    .line 541
    sget-object v4, Ltq3;->c:Lsq3;

    .line 542
    .line 543
    invoke-virtual {v4, p1, v6, v7}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    goto/16 :goto_1

    .line 552
    .line 553
    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 554
    .line 555
    sget-object v4, Ltq3;->c:Lsq3;

    .line 556
    .line 557
    invoke-virtual {v4, p1, v6, v7}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 558
    .line 559
    .line 560
    move-result-wide v4

    .line 561
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 562
    .line 563
    .line 564
    move-result-wide v4

    .line 565
    sget-object v6, Lso3;->a:Ljava/nio/charset/Charset;

    .line 566
    .line 567
    goto/16 :goto_2

    .line 568
    .line 569
    :cond_2
    :goto_5
    add-int/lit8 v2, v2, 0x3

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    .line 573
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 574
    .line 575
    iget-object v0, p0, Ltp3;->l:Lnq3;

    .line 576
    .line 577
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    iget-object v0, p1, Leo3;->zzc:Lmq3;

    .line 581
    .line 582
    invoke-virtual {v0}, Lmq3;->hashCode()I

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    add-int/2addr v0, v3

    .line 587
    iget-boolean v1, p0, Ltp3;->f:Z

    .line 588
    .line 589
    if-eqz v1, :cond_4

    .line 590
    .line 591
    mul-int/lit8 v0, v0, 0x35

    .line 592
    .line 593
    iget-object p0, p0, Ltp3;->m:Lqn3;

    .line 594
    .line 595
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    check-cast p1, Lbo3;

    .line 599
    .line 600
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 601
    .line 602
    iget-object p0, p0, Lun3;->a:Lhq3;

    .line 603
    .line 604
    invoke-virtual {p0}, Lhq3;->hashCode()I

    .line 605
    .line 606
    .line 607
    move-result p0

    .line 608
    add-int/2addr p0, v0

    .line 609
    return p0

    .line 610
    :cond_4
    return v0

    .line 611
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public final b(Ljava/lang/Object;[BIILym3;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p4

    .line 8
    .line 9
    move-object/from16 v13, p5

    .line 10
    .line 11
    iget-boolean v1, v0, Ltp3;->g:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1d

    .line 14
    .line 15
    invoke-static {v2}, Ltp3;->j(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Ltp3;->o:Lsun/misc/Unsafe;

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    move/from16 v3, p3

    .line 22
    .line 23
    move v5, v9

    .line 24
    move v12, v5

    .line 25
    const/4 v4, -0x1

    .line 26
    const v11, 0xfffff

    .line 27
    .line 28
    .line 29
    :goto_0
    if-ge v3, v8, :cond_1a

    .line 30
    .line 31
    add-int/lit8 v6, v3, 0x1

    .line 32
    .line 33
    aget-byte v3, v7, v3

    .line 34
    .line 35
    if-gez v3, :cond_0

    .line 36
    .line 37
    invoke-static {v3, v7, v6, v13}, Lw11;->d0(I[BILym3;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    iget v3, v13, Lym3;->a:I

    .line 42
    .line 43
    :cond_0
    ushr-int/lit8 v14, v3, 0x3

    .line 44
    .line 45
    const v16, 0xfffff

    .line 46
    .line 47
    .line 48
    iget v10, v0, Ltp3;->d:I

    .line 49
    .line 50
    iget v15, v0, Ltp3;->c:I

    .line 51
    .line 52
    if-le v14, v4, :cond_2

    .line 53
    .line 54
    div-int/lit8 v5, v5, 0x3

    .line 55
    .line 56
    if-lt v14, v15, :cond_1

    .line 57
    .line 58
    if-gt v14, v10, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0, v14, v5}, Ltp3;->q(II)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 v4, -0x1

    .line 66
    :goto_1
    move v10, v4

    .line 67
    const/4 v15, -0x1

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    if-lt v14, v15, :cond_1

    .line 70
    .line 71
    if-gt v14, v10, :cond_1

    .line 72
    .line 73
    invoke-virtual {v0, v14, v9}, Ltp3;->q(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    goto :goto_1

    .line 78
    :goto_2
    if-ne v10, v15, :cond_3

    .line 79
    .line 80
    move-object/from16 v24, v1

    .line 81
    .line 82
    move/from16 v18, v3

    .line 83
    .line 84
    move v8, v9

    .line 85
    move/from16 v17, v8

    .line 86
    .line 87
    move-object v9, v2

    .line 88
    move v2, v6

    .line 89
    move v6, v14

    .line 90
    goto/16 :goto_14

    .line 91
    .line 92
    :cond_3
    and-int/lit8 v4, v3, 0x7

    .line 93
    .line 94
    add-int/lit8 v5, v10, 0x1

    .line 95
    .line 96
    iget-object v9, v0, Ltp3;->a:[I

    .line 97
    .line 98
    aget v5, v9, v5

    .line 99
    .line 100
    invoke-static {v5}, Ltp3;->h(I)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    move/from16 v18, v3

    .line 105
    .line 106
    and-int v3, v5, v16

    .line 107
    .line 108
    move-object/from16 v19, v9

    .line 109
    .line 110
    int-to-long v8, v3

    .line 111
    const/16 v3, 0x11

    .line 112
    .line 113
    move-wide/from16 v20, v8

    .line 114
    .line 115
    if-gt v15, v3, :cond_10

    .line 116
    .line 117
    add-int/lit8 v3, v10, 0x2

    .line 118
    .line 119
    aget v3, v19, v3

    .line 120
    .line 121
    ushr-int/lit8 v9, v3, 0x14

    .line 122
    .line 123
    const/4 v8, 0x1

    .line 124
    shl-int v9, v8, v9

    .line 125
    .line 126
    and-int v3, v3, v16

    .line 127
    .line 128
    move/from16 v22, v8

    .line 129
    .line 130
    move/from16 v8, v16

    .line 131
    .line 132
    move/from16 v16, v9

    .line 133
    .line 134
    if-eq v3, v11, :cond_6

    .line 135
    .line 136
    if-eq v11, v8, :cond_4

    .line 137
    .line 138
    int-to-long v8, v11

    .line 139
    invoke-virtual {v1, v2, v8, v9, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 140
    .line 141
    .line 142
    const v8, 0xfffff

    .line 143
    .line 144
    .line 145
    :cond_4
    if-eq v3, v8, :cond_5

    .line 146
    .line 147
    int-to-long v11, v3

    .line 148
    invoke-virtual {v1, v2, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    :cond_5
    move v11, v3

    .line 153
    :cond_6
    const/4 v3, 0x5

    .line 154
    packed-switch v15, :pswitch_data_0

    .line 155
    .line 156
    .line 157
    :cond_7
    move-object v8, v13

    .line 158
    move-object v13, v7

    .line 159
    move-object v7, v8

    .line 160
    move-object v9, v1

    .line 161
    move-object v1, v2

    .line 162
    move v8, v6

    .line 163
    goto/16 :goto_e

    .line 164
    .line 165
    :pswitch_0
    if-nez v4, :cond_7

    .line 166
    .line 167
    invoke-static {v7, v6, v13}, Lw11;->e0([BILym3;)I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    iget-wide v3, v13, Lym3;->b:J

    .line 172
    .line 173
    const-wide/16 v5, 0x1

    .line 174
    .line 175
    and-long/2addr v5, v3

    .line 176
    ushr-long v3, v3, v22

    .line 177
    .line 178
    neg-long v5, v5

    .line 179
    xor-long/2addr v5, v3

    .line 180
    move-wide/from16 v3, v20

    .line 181
    .line 182
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 183
    .line 184
    .line 185
    move-object v15, v2

    .line 186
    or-int v12, v12, v16

    .line 187
    .line 188
    move/from16 v8, p4

    .line 189
    .line 190
    move v3, v9

    .line 191
    :goto_3
    move v5, v10

    .line 192
    move v4, v14

    .line 193
    :goto_4
    const/4 v9, 0x0

    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :pswitch_1
    move-object v15, v2

    .line 197
    move-wide/from16 v2, v20

    .line 198
    .line 199
    if-nez v4, :cond_8

    .line 200
    .line 201
    invoke-static {v7, v6, v13}, Lw11;->Z([BILym3;)I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    iget v5, v13, Lym3;->a:I

    .line 206
    .line 207
    and-int/lit8 v6, v5, 0x1

    .line 208
    .line 209
    ushr-int/lit8 v5, v5, 0x1

    .line 210
    .line 211
    neg-int v6, v6

    .line 212
    xor-int/2addr v5, v6

    .line 213
    invoke-virtual {v1, v15, v2, v3, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 214
    .line 215
    .line 216
    :goto_5
    or-int v12, v12, v16

    .line 217
    .line 218
    :goto_6
    move/from16 v8, p4

    .line 219
    .line 220
    move v3, v4

    .line 221
    :goto_7
    move v5, v10

    .line 222
    move v4, v14

    .line 223
    move-object v2, v15

    .line 224
    goto :goto_4

    .line 225
    :cond_8
    move-object v8, v13

    .line 226
    move-object v13, v7

    .line 227
    move-object v7, v8

    .line 228
    move-object v9, v1

    .line 229
    move v8, v6

    .line 230
    :goto_8
    move-object v1, v15

    .line 231
    goto/16 :goto_e

    .line 232
    .line 233
    :pswitch_2
    move-object v15, v2

    .line 234
    move-wide/from16 v2, v20

    .line 235
    .line 236
    if-nez v4, :cond_8

    .line 237
    .line 238
    invoke-static {v7, v6, v13}, Lw11;->Z([BILym3;)I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    iget v5, v13, Lym3;->a:I

    .line 243
    .line 244
    invoke-virtual {v1, v15, v2, v3, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :pswitch_3
    move-object v15, v2

    .line 249
    move-wide/from16 v2, v20

    .line 250
    .line 251
    const/4 v9, 0x2

    .line 252
    if-ne v4, v9, :cond_8

    .line 253
    .line 254
    invoke-static {v7, v6, v13}, Lw11;->k0([BILym3;)I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    iget-object v5, v13, Lym3;->c:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-virtual {v1, v15, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :pswitch_4
    move-object v15, v2

    .line 265
    const/4 v9, 0x2

    .line 266
    if-ne v4, v9, :cond_9

    .line 267
    .line 268
    move-object v2, v1

    .line 269
    invoke-virtual {v0, v15, v10}, Ltp3;->F(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    move-object v3, v2

    .line 274
    invoke-virtual {v0, v10}, Ltp3;->C(I)Lbq3;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    move-object v4, v7

    .line 279
    move-object v7, v3

    .line 280
    move-object v3, v4

    .line 281
    move/from16 v5, p4

    .line 282
    .line 283
    move v4, v6

    .line 284
    move-object v6, v13

    .line 285
    invoke-static/range {v1 .. v6}, Lw11;->l0(Ljava/lang/Object;Lbq3;[BIILym3;)I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    move-object v13, v3

    .line 290
    move-object v3, v1

    .line 291
    move-object v1, v6

    .line 292
    invoke-virtual {v0, v10, v15, v3}, Ltp3;->G(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    or-int v12, v12, v16

    .line 296
    .line 297
    move-object v3, v13

    .line 298
    move-object v13, v1

    .line 299
    move-object v1, v7

    .line 300
    move-object v7, v3

    .line 301
    move/from16 v8, p4

    .line 302
    .line 303
    move v3, v2

    .line 304
    goto :goto_7

    .line 305
    :cond_9
    move-object/from16 v25, v7

    .line 306
    .line 307
    move-object v7, v1

    .line 308
    move-object v1, v13

    .line 309
    move-object/from16 v13, v25

    .line 310
    .line 311
    :cond_a
    move v8, v6

    .line 312
    move-object v9, v7

    .line 313
    move-object v7, v1

    .line 314
    goto :goto_8

    .line 315
    :pswitch_5
    move-object v3, v7

    .line 316
    move-object v7, v1

    .line 317
    move-object v1, v13

    .line 318
    move-object v13, v3

    .line 319
    move-object v15, v2

    .line 320
    move-wide/from16 v2, v20

    .line 321
    .line 322
    const/4 v9, 0x2

    .line 323
    if-ne v4, v9, :cond_a

    .line 324
    .line 325
    const/high16 v4, 0x20000000

    .line 326
    .line 327
    and-int/2addr v4, v5

    .line 328
    if-nez v4, :cond_b

    .line 329
    .line 330
    invoke-static {v13, v6, v1}, Lw11;->i0([BILym3;)I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    goto :goto_9

    .line 335
    :cond_b
    invoke-static {v13, v6, v1}, Lw11;->j0([BILym3;)I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    :goto_9
    iget-object v5, v1, Lym3;->c:Ljava/lang/Object;

    .line 340
    .line 341
    invoke-virtual {v7, v15, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :goto_a
    or-int v12, v12, v16

    .line 345
    .line 346
    move-object v2, v13

    .line 347
    move-object v13, v1

    .line 348
    move-object v1, v7

    .line 349
    move-object v7, v2

    .line 350
    goto/16 :goto_6

    .line 351
    .line 352
    :pswitch_6
    move-object v3, v7

    .line 353
    move-object v7, v1

    .line 354
    move-object v1, v13

    .line 355
    move-object v13, v3

    .line 356
    move-object v15, v2

    .line 357
    move-wide/from16 v2, v20

    .line 358
    .line 359
    if-nez v4, :cond_a

    .line 360
    .line 361
    invoke-static {v13, v6, v1}, Lw11;->e0([BILym3;)I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    iget-wide v5, v1, Lym3;->b:J

    .line 366
    .line 367
    const-wide/16 v18, 0x0

    .line 368
    .line 369
    cmp-long v5, v5, v18

    .line 370
    .line 371
    if-eqz v5, :cond_c

    .line 372
    .line 373
    move/from16 v5, v22

    .line 374
    .line 375
    goto :goto_b

    .line 376
    :cond_c
    const/4 v5, 0x0

    .line 377
    :goto_b
    sget-object v6, Ltq3;->c:Lsq3;

    .line 378
    .line 379
    invoke-virtual {v6, v15, v2, v3, v5}, Lsq3;->s(Ljava/lang/Object;JZ)V

    .line 380
    .line 381
    .line 382
    goto :goto_a

    .line 383
    :pswitch_7
    move-object v8, v7

    .line 384
    move-object v7, v1

    .line 385
    move-object v1, v13

    .line 386
    move-object v13, v8

    .line 387
    move-object v15, v2

    .line 388
    move-wide/from16 v8, v20

    .line 389
    .line 390
    if-ne v4, v3, :cond_a

    .line 391
    .line 392
    invoke-static {v13, v6}, Lw11;->g0([BI)I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    invoke-virtual {v7, v15, v8, v9, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 397
    .line 398
    .line 399
    add-int/lit8 v3, v6, 0x4

    .line 400
    .line 401
    or-int v12, v12, v16

    .line 402
    .line 403
    move-object v2, v13

    .line 404
    move-object v13, v1

    .line 405
    move-object v1, v7

    .line 406
    move-object v7, v2

    .line 407
    move/from16 v8, p4

    .line 408
    .line 409
    goto/16 :goto_7

    .line 410
    .line 411
    :pswitch_8
    move-object v8, v7

    .line 412
    move-object v7, v1

    .line 413
    move-object v1, v13

    .line 414
    move-object v13, v8

    .line 415
    move-object v15, v2

    .line 416
    move-wide/from16 v8, v20

    .line 417
    .line 418
    move/from16 v2, v22

    .line 419
    .line 420
    if-ne v4, v2, :cond_d

    .line 421
    .line 422
    move v3, v6

    .line 423
    invoke-static {v13, v3}, Lw11;->h0([BI)J

    .line 424
    .line 425
    .line 426
    move-result-wide v5

    .line 427
    move-object v2, v7

    .line 428
    move-object v7, v1

    .line 429
    move-object v1, v2

    .line 430
    move-wide/from16 v25, v8

    .line 431
    .line 432
    move v8, v3

    .line 433
    move-wide/from16 v3, v25

    .line 434
    .line 435
    move-object v2, v15

    .line 436
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 437
    .line 438
    .line 439
    add-int/lit8 v3, v8, 0x8

    .line 440
    .line 441
    or-int v12, v12, v16

    .line 442
    .line 443
    move-object v4, v13

    .line 444
    move-object v13, v7

    .line 445
    move-object v7, v4

    .line 446
    move/from16 v8, p4

    .line 447
    .line 448
    goto/16 :goto_3

    .line 449
    .line 450
    :cond_d
    move-object v8, v7

    .line 451
    move-object v7, v1

    .line 452
    move-object v1, v8

    .line 453
    move v8, v6

    .line 454
    move-object v9, v1

    .line 455
    goto/16 :goto_8

    .line 456
    .line 457
    :pswitch_9
    move-object v3, v13

    .line 458
    move-object v13, v7

    .line 459
    move-object v7, v3

    .line 460
    move v8, v6

    .line 461
    move v6, v4

    .line 462
    move-wide/from16 v3, v20

    .line 463
    .line 464
    if-nez v6, :cond_e

    .line 465
    .line 466
    invoke-static {v13, v8, v7}, Lw11;->Z([BILym3;)I

    .line 467
    .line 468
    .line 469
    move-result v5

    .line 470
    iget v6, v7, Lym3;->a:I

    .line 471
    .line 472
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 473
    .line 474
    .line 475
    or-int v12, v12, v16

    .line 476
    .line 477
    move-object v3, v13

    .line 478
    move-object v13, v7

    .line 479
    move-object v7, v3

    .line 480
    move/from16 v8, p4

    .line 481
    .line 482
    move v3, v5

    .line 483
    goto/16 :goto_3

    .line 484
    .line 485
    :cond_e
    move-object v9, v1

    .line 486
    :cond_f
    move-object v1, v2

    .line 487
    goto/16 :goto_e

    .line 488
    .line 489
    :pswitch_a
    move-object v3, v13

    .line 490
    move-object v13, v7

    .line 491
    move-object v7, v3

    .line 492
    move v8, v6

    .line 493
    move v6, v4

    .line 494
    move-wide/from16 v3, v20

    .line 495
    .line 496
    if-nez v6, :cond_e

    .line 497
    .line 498
    invoke-static {v13, v8, v7}, Lw11;->e0([BILym3;)I

    .line 499
    .line 500
    .line 501
    move-result v8

    .line 502
    iget-wide v5, v7, Lym3;->b:J

    .line 503
    .line 504
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 505
    .line 506
    .line 507
    move-object v9, v1

    .line 508
    or-int v12, v12, v16

    .line 509
    .line 510
    move-object v1, v13

    .line 511
    move-object v13, v7

    .line 512
    move-object v7, v1

    .line 513
    move v3, v8

    .line 514
    move-object v1, v9

    .line 515
    move v5, v10

    .line 516
    move v4, v14

    .line 517
    const/4 v9, 0x0

    .line 518
    :goto_c
    move/from16 v8, p4

    .line 519
    .line 520
    goto/16 :goto_0

    .line 521
    .line 522
    :pswitch_b
    move-object v5, v13

    .line 523
    move-object v13, v7

    .line 524
    move-object v7, v5

    .line 525
    move-object v9, v1

    .line 526
    move v8, v6

    .line 527
    move v6, v4

    .line 528
    move-wide/from16 v4, v20

    .line 529
    .line 530
    if-ne v6, v3, :cond_f

    .line 531
    .line 532
    invoke-static {v13, v8}, Lw11;->g0([BI)I

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    sget-object v3, Ltq3;->c:Lsq3;

    .line 541
    .line 542
    invoke-virtual {v3, v2, v4, v5, v1}, Lsq3;->w(Ljava/lang/Object;JF)V

    .line 543
    .line 544
    .line 545
    add-int/lit8 v3, v8, 0x4

    .line 546
    .line 547
    or-int v12, v12, v16

    .line 548
    .line 549
    move-object v1, v13

    .line 550
    move-object v13, v7

    .line 551
    move-object v7, v1

    .line 552
    move/from16 v8, p4

    .line 553
    .line 554
    :goto_d
    move-object v1, v9

    .line 555
    goto/16 :goto_3

    .line 556
    .line 557
    :pswitch_c
    move-object v5, v13

    .line 558
    move-object v13, v7

    .line 559
    move-object v7, v5

    .line 560
    move-object v9, v1

    .line 561
    move v8, v6

    .line 562
    move/from16 v1, v22

    .line 563
    .line 564
    move v6, v4

    .line 565
    move-wide/from16 v4, v20

    .line 566
    .line 567
    if-ne v6, v1, :cond_f

    .line 568
    .line 569
    invoke-static {v13, v8}, Lw11;->h0([BI)J

    .line 570
    .line 571
    .line 572
    move-result-wide v18

    .line 573
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 574
    .line 575
    .line 576
    move-result-wide v18

    .line 577
    sget-object v1, Ltq3;->c:Lsq3;

    .line 578
    .line 579
    move-wide v3, v4

    .line 580
    move-wide/from16 v5, v18

    .line 581
    .line 582
    invoke-virtual/range {v1 .. v6}, Lsq3;->z(Ljava/lang/Object;JD)V

    .line 583
    .line 584
    .line 585
    move-object v1, v2

    .line 586
    add-int/lit8 v3, v8, 0x8

    .line 587
    .line 588
    or-int v12, v12, v16

    .line 589
    .line 590
    move-object v2, v13

    .line 591
    move-object v13, v7

    .line 592
    move-object v7, v2

    .line 593
    move/from16 v8, p4

    .line 594
    .line 595
    move-object v2, v1

    .line 596
    goto :goto_d

    .line 597
    :goto_e
    move v2, v8

    .line 598
    move-object/from16 v24, v9

    .line 599
    .line 600
    move v8, v10

    .line 601
    move v6, v14

    .line 602
    const/16 v17, 0x0

    .line 603
    .line 604
    move-object v9, v1

    .line 605
    goto/16 :goto_14

    .line 606
    .line 607
    :cond_10
    move-object v3, v13

    .line 608
    move-object v13, v7

    .line 609
    move-object v7, v3

    .line 610
    move-object v9, v1

    .line 611
    move-object v1, v2

    .line 612
    move v8, v6

    .line 613
    move v6, v4

    .line 614
    move-wide/from16 v3, v20

    .line 615
    .line 616
    const/16 v2, 0x1b

    .line 617
    .line 618
    if-ne v15, v2, :cond_14

    .line 619
    .line 620
    const/4 v2, 0x2

    .line 621
    if-ne v6, v2, :cond_13

    .line 622
    .line 623
    invoke-virtual {v9, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, Lro3;

    .line 628
    .line 629
    move-object v5, v2

    .line 630
    check-cast v5, Lvm3;

    .line 631
    .line 632
    iget-boolean v5, v5, Lvm3;->a:Z

    .line 633
    .line 634
    if-nez v5, :cond_12

    .line 635
    .line 636
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    if-nez v5, :cond_11

    .line 641
    .line 642
    const/16 v5, 0xa

    .line 643
    .line 644
    goto :goto_f

    .line 645
    :cond_11
    add-int/2addr v5, v5

    .line 646
    :goto_f
    invoke-interface {v2, v5}, Lro3;->I(I)Lro3;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    invoke-virtual {v9, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    :cond_12
    move-object v6, v2

    .line 654
    invoke-virtual {v0, v10}, Ltp3;->C(I)Lbq3;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    move/from16 v5, p4

    .line 659
    .line 660
    move v4, v8

    .line 661
    move-object v3, v13

    .line 662
    move/from16 v2, v18

    .line 663
    .line 664
    invoke-static/range {v1 .. v7}, Lw11;->m0(Lbq3;I[BIILro3;Lym3;)I

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    move-object/from16 v2, p1

    .line 669
    .line 670
    move-object/from16 v7, p2

    .line 671
    .line 672
    move/from16 v8, p4

    .line 673
    .line 674
    move-object/from16 v13, p5

    .line 675
    .line 676
    move v3, v1

    .line 677
    goto :goto_d

    .line 678
    :cond_13
    move-object/from16 v2, p1

    .line 679
    .line 680
    move v3, v8

    .line 681
    move-object/from16 v24, v9

    .line 682
    .line 683
    move v8, v10

    .line 684
    move v15, v11

    .line 685
    move/from16 v23, v12

    .line 686
    .line 687
    move v6, v14

    .line 688
    const/16 v17, 0x0

    .line 689
    .line 690
    goto/16 :goto_13

    .line 691
    .line 692
    :cond_14
    move/from16 v2, v18

    .line 693
    .line 694
    const/16 v1, 0x31

    .line 695
    .line 696
    if-gt v15, v1, :cond_16

    .line 697
    .line 698
    move-wide/from16 v20, v3

    .line 699
    .line 700
    move v3, v8

    .line 701
    move-object v1, v9

    .line 702
    move v8, v10

    .line 703
    int-to-long v9, v5

    .line 704
    move v4, v15

    .line 705
    move v15, v11

    .line 706
    move v11, v4

    .line 707
    move/from16 v4, p4

    .line 708
    .line 709
    move-object/from16 v24, v1

    .line 710
    .line 711
    move v5, v2

    .line 712
    move v7, v6

    .line 713
    move/from16 v23, v12

    .line 714
    .line 715
    move v6, v14

    .line 716
    move-wide/from16 v12, v20

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    move-object/from16 v1, p1

    .line 721
    .line 722
    move-object/from16 v2, p2

    .line 723
    .line 724
    move-object/from16 v14, p5

    .line 725
    .line 726
    invoke-virtual/range {v0 .. v14}, Ltp3;->z(Ljava/lang/Object;[BIIIIIIJIJLym3;)I

    .line 727
    .line 728
    .line 729
    move-result v7

    .line 730
    move-object v2, v1

    .line 731
    move/from16 v18, v5

    .line 732
    .line 733
    if-eq v7, v3, :cond_15

    .line 734
    .line 735
    move-object/from16 v13, p5

    .line 736
    .line 737
    move v4, v6

    .line 738
    move v3, v7

    .line 739
    move v5, v8

    .line 740
    :goto_10
    move v11, v15

    .line 741
    move/from16 v9, v17

    .line 742
    .line 743
    move/from16 v12, v23

    .line 744
    .line 745
    move-object/from16 v1, v24

    .line 746
    .line 747
    move-object/from16 v7, p2

    .line 748
    .line 749
    goto/16 :goto_c

    .line 750
    .line 751
    :cond_15
    move-object v9, v2

    .line 752
    :goto_11
    move v2, v7

    .line 753
    :goto_12
    move v11, v15

    .line 754
    move/from16 v12, v23

    .line 755
    .line 756
    goto/16 :goto_14

    .line 757
    .line 758
    :cond_16
    move v7, v15

    .line 759
    move v15, v11

    .line 760
    move v11, v7

    .line 761
    move/from16 v18, v2

    .line 762
    .line 763
    move v7, v6

    .line 764
    move-object/from16 v24, v9

    .line 765
    .line 766
    move/from16 v23, v12

    .line 767
    .line 768
    move v6, v14

    .line 769
    const/16 v17, 0x0

    .line 770
    .line 771
    move-object/from16 v2, p1

    .line 772
    .line 773
    move-wide v12, v3

    .line 774
    move v3, v8

    .line 775
    move v8, v10

    .line 776
    const/16 v1, 0x32

    .line 777
    .line 778
    if-ne v11, v1, :cond_18

    .line 779
    .line 780
    const/4 v9, 0x2

    .line 781
    if-eq v7, v9, :cond_17

    .line 782
    .line 783
    :goto_13
    move-object v9, v2

    .line 784
    move v2, v3

    .line 785
    goto :goto_12

    .line 786
    :cond_17
    invoke-virtual {v0, v2, v8, v12, v13}, Ltp3;->A(Ljava/lang/Object;IJ)V

    .line 787
    .line 788
    .line 789
    const/4 v0, 0x0

    .line 790
    throw v0

    .line 791
    :cond_18
    move/from16 v4, p4

    .line 792
    .line 793
    move-object v1, v2

    .line 794
    move v9, v11

    .line 795
    move-wide v10, v12

    .line 796
    move-object/from16 v2, p2

    .line 797
    .line 798
    move-object/from16 v13, p5

    .line 799
    .line 800
    move v12, v8

    .line 801
    move v8, v5

    .line 802
    move/from16 v5, v18

    .line 803
    .line 804
    invoke-virtual/range {v0 .. v13}, Ltp3;->B(Ljava/lang/Object;[BIIIIIIIJILym3;)I

    .line 805
    .line 806
    .line 807
    move-result v7

    .line 808
    move-object v9, v1

    .line 809
    move v2, v5

    .line 810
    move v8, v12

    .line 811
    if-eq v7, v3, :cond_19

    .line 812
    .line 813
    move-object/from16 v0, p0

    .line 814
    .line 815
    move-object/from16 v13, p5

    .line 816
    .line 817
    move v4, v6

    .line 818
    move v3, v7

    .line 819
    move v5, v8

    .line 820
    move-object v2, v9

    .line 821
    goto :goto_10

    .line 822
    :cond_19
    move/from16 v18, v2

    .line 823
    .line 824
    goto :goto_11

    .line 825
    :goto_14
    invoke-static {v9}, Ltp3;->s(Ljava/lang/Object;)Lmq3;

    .line 826
    .line 827
    .line 828
    move-result-object v4

    .line 829
    move-object/from16 v1, p2

    .line 830
    .line 831
    move/from16 v3, p4

    .line 832
    .line 833
    move-object/from16 v5, p5

    .line 834
    .line 835
    move/from16 v0, v18

    .line 836
    .line 837
    invoke-static/range {v0 .. v5}, Lw11;->n0(I[BIILmq3;Lym3;)I

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    move-object/from16 v7, p2

    .line 842
    .line 843
    move-object/from16 v13, p5

    .line 844
    .line 845
    move v4, v6

    .line 846
    move v5, v8

    .line 847
    move-object v2, v9

    .line 848
    move/from16 v9, v17

    .line 849
    .line 850
    move-object/from16 v1, v24

    .line 851
    .line 852
    move v8, v3

    .line 853
    move v3, v0

    .line 854
    move-object/from16 v0, p0

    .line 855
    .line 856
    goto/16 :goto_0

    .line 857
    .line 858
    :cond_1a
    move-object/from16 v24, v1

    .line 859
    .line 860
    move-object v9, v2

    .line 861
    move v4, v8

    .line 862
    move v15, v11

    .line 863
    move/from16 v23, v12

    .line 864
    .line 865
    const v8, 0xfffff

    .line 866
    .line 867
    .line 868
    if-eq v15, v8, :cond_1b

    .line 869
    .line 870
    int-to-long v0, v15

    .line 871
    move/from16 v12, v23

    .line 872
    .line 873
    move-object/from16 v2, v24

    .line 874
    .line 875
    invoke-virtual {v2, v9, v0, v1, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 876
    .line 877
    .line 878
    :cond_1b
    if-ne v3, v4, :cond_1c

    .line 879
    .line 880
    return-void

    .line 881
    :cond_1c
    invoke-static {}, Luo3;->c()Luo3;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    throw v0

    .line 886
    :cond_1d
    move-object v9, v2

    .line 887
    move v4, v8

    .line 888
    const/4 v5, 0x0

    .line 889
    move-object/from16 v0, p0

    .line 890
    .line 891
    move-object/from16 v2, p2

    .line 892
    .line 893
    move/from16 v3, p3

    .line 894
    .line 895
    move-object/from16 v6, p5

    .line 896
    .line 897
    move-object v1, v9

    .line 898
    invoke-virtual/range {v0 .. v6}, Ltp3;->t(Ljava/lang/Object;[BIIILym3;)I

    .line 899
    .line 900
    .line 901
    return-void

    .line 902
    nop

    .line 903
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Leo3;Leo3;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Ltp3;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v3}, Ltp3;->g(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    const v5, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int v6, v4, v5

    .line 16
    .line 17
    invoke-static {v4}, Ltp3;->h(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    int-to-long v6, v6

    .line 22
    packed-switch v4, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :pswitch_0
    add-int/lit8 v4, v3, 0x2

    .line 28
    .line 29
    aget v4, v0, v4

    .line 30
    .line 31
    and-int/2addr v4, v5

    .line 32
    int-to-long v4, v4

    .line 33
    invoke-static {p1, v4, v5}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    invoke-static {p2, v4, v5}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v8, v4, :cond_2

    .line 42
    .line 43
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_1
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    :goto_1
    if-nez v4, :cond_0

    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_2

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_2

    .line 115
    .line 116
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    invoke-static {p2, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    cmp-long v4, v4, v6

    .line 125
    .line 126
    if-nez v4, :cond_2

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_2

    .line 135
    .line 136
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-static {p2, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-ne v4, v5, :cond_2

    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_2

    .line 153
    .line 154
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 155
    .line 156
    .line 157
    move-result-wide v4

    .line 158
    invoke-static {p2, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    cmp-long v4, v4, v6

    .line 163
    .line 164
    if-nez v4, :cond_2

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_2

    .line 173
    .line 174
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    invoke-static {p2, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-ne v4, v5, :cond_2

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_2

    .line 191
    .line 192
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-static {p2, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-ne v4, v5, :cond_2

    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_2

    .line 209
    .line 210
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    invoke-static {p2, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-ne v4, v5, :cond_2

    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_2

    .line 227
    .line 228
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-eqz v4, :cond_2

    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_2

    .line 249
    .line 250
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-eqz v4, :cond_2

    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    if-eqz v4, :cond_2

    .line 271
    .line 272
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-static {p2, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-static {v4, v5}, Lcq3;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-eqz v4, :cond_2

    .line 285
    .line 286
    goto/16 :goto_2

    .line 287
    .line 288
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_2

    .line 293
    .line 294
    sget-object v4, Ltq3;->c:Lsq3;

    .line 295
    .line 296
    invoke-virtual {v4, p1, v6, v7}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    invoke-virtual {v4, p2, v6, v7}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-ne v5, v4, :cond_2

    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_2

    .line 313
    .line 314
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    invoke-static {p2, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-ne v4, v5, :cond_2

    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-eqz v4, :cond_2

    .line 331
    .line 332
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 333
    .line 334
    .line 335
    move-result-wide v4

    .line 336
    invoke-static {p2, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 337
    .line 338
    .line 339
    move-result-wide v6

    .line 340
    cmp-long v4, v4, v6

    .line 341
    .line 342
    if-nez v4, :cond_2

    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-eqz v4, :cond_2

    .line 351
    .line 352
    invoke-static {p1, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    invoke-static {p2, v6, v7}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-ne v4, v5, :cond_2

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-eqz v4, :cond_2

    .line 368
    .line 369
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 370
    .line 371
    .line 372
    move-result-wide v4

    .line 373
    invoke-static {p2, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    cmp-long v4, v4, v6

    .line 378
    .line 379
    if-nez v4, :cond_2

    .line 380
    .line 381
    goto :goto_2

    .line 382
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-eqz v4, :cond_2

    .line 387
    .line 388
    invoke-static {p1, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    invoke-static {p2, v6, v7}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 393
    .line 394
    .line 395
    move-result-wide v6

    .line 396
    cmp-long v4, v4, v6

    .line 397
    .line 398
    if-nez v4, :cond_2

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_2

    .line 406
    .line 407
    sget-object v4, Ltq3;->c:Lsq3;

    .line 408
    .line 409
    invoke-virtual {v4, p1, v6, v7}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    invoke-virtual {v4, p2, v6, v7}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    if-ne v5, v4, :cond_2

    .line 426
    .line 427
    goto :goto_2

    .line 428
    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, Ltp3;->m(Leo3;Leo3;I)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-eqz v4, :cond_2

    .line 433
    .line 434
    sget-object v4, Ltq3;->c:Lsq3;

    .line 435
    .line 436
    invoke-virtual {v4, p1, v6, v7}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 437
    .line 438
    .line 439
    move-result-wide v8

    .line 440
    invoke-static {v8, v9}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 441
    .line 442
    .line 443
    move-result-wide v8

    .line 444
    invoke-virtual {v4, p2, v6, v7}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 445
    .line 446
    .line 447
    move-result-wide v4

    .line 448
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 449
    .line 450
    .line 451
    move-result-wide v4

    .line 452
    cmp-long v4, v8, v4

    .line 453
    .line 454
    if-nez v4, :cond_2

    .line 455
    .line 456
    :cond_0
    :goto_2
    add-int/lit8 v3, v3, 0x3

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_1
    iget-object v0, p0, Ltp3;->l:Lnq3;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object v0, p1, Leo3;->zzc:Lmq3;

    .line 466
    .line 467
    iget-object v1, p2, Leo3;->zzc:Lmq3;

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Lmq3;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-nez v0, :cond_3

    .line 474
    .line 475
    :cond_2
    :goto_3
    return v2

    .line 476
    :cond_3
    iget-boolean v0, p0, Ltp3;->f:Z

    .line 477
    .line 478
    if-eqz v0, :cond_4

    .line 479
    .line 480
    iget-object p0, p0, Ltp3;->m:Lqn3;

    .line 481
    .line 482
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    check-cast p1, Lbo3;

    .line 486
    .line 487
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 488
    .line 489
    check-cast p2, Lbo3;

    .line 490
    .line 491
    iget-object p1, p2, Lbo3;->zza:Lun3;

    .line 492
    .line 493
    invoke-virtual {p0, p1}, Lun3;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result p0

    .line 497
    return p0

    .line 498
    :cond_4
    const/4 p0, 0x1

    .line 499
    return p0

    .line 500
    nop

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Leo3;)I
    .locals 12

    .line 1
    iget-boolean v0, p0, Ltp3;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    sget-object v0, Ltp3;->o:Lsun/misc/Unsafe;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    move v3, v2

    .line 10
    :goto_0
    iget-object v4, p0, Ltp3;->a:[I

    .line 11
    .line 12
    array-length v5, v4

    .line 13
    if-ge v2, v5, :cond_e

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ltp3;->g(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-static {v5}, Ltp3;->h(I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    aget v7, v4, v2

    .line 24
    .line 25
    const v8, 0xfffff

    .line 26
    .line 27
    .line 28
    and-int/2addr v5, v8

    .line 29
    sget-object v8, Lwn3;->b:Lwn3;

    .line 30
    .line 31
    iget v8, v8, Lwn3;->a:I

    .line 32
    .line 33
    if-lt v6, v8, :cond_0

    .line 34
    .line 35
    sget-object v8, Lwn3;->c:Lwn3;

    .line 36
    .line 37
    iget v8, v8, Lwn3;->a:I

    .line 38
    .line 39
    if-gt v6, v8, :cond_0

    .line 40
    .line 41
    add-int/lit8 v8, v2, 0x2

    .line 42
    .line 43
    aget v4, v4, v8

    .line 44
    .line 45
    :cond_0
    int-to-long v4, v5

    .line 46
    const/4 v8, 0x1

    .line 47
    const/16 v9, 0x3f

    .line 48
    .line 49
    const/4 v10, 0x4

    .line 50
    const/16 v11, 0x8

    .line 51
    .line 52
    packed-switch v6, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_f

    .line 56
    .line 57
    :pswitch_0
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_d

    .line 62
    .line 63
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ltm3;

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v7, v4, v5}, Lkn3;->a(ILtm3;Lbq3;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    :goto_1
    add-int/2addr v3, v4

    .line 78
    goto/16 :goto_f

    .line 79
    .line 80
    :pswitch_1
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_d

    .line 85
    .line 86
    invoke-static {p1, v4, v5}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    shl-int/lit8 v6, v7, 0x3

    .line 91
    .line 92
    add-long v7, v4, v4

    .line 93
    .line 94
    shr-long/2addr v4, v9

    .line 95
    invoke-static {v6}, Lkn3;->p(I)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    xor-long/2addr v4, v7

    .line 100
    invoke-static {v4, v5}, Lkn3;->q(J)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    :goto_2
    add-int/2addr v4, v6

    .line 105
    goto :goto_1

    .line 106
    :pswitch_2
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_d

    .line 111
    .line 112
    invoke-static {p1, v4, v5}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    shl-int/lit8 v5, v7, 0x3

    .line 117
    .line 118
    add-int v6, v4, v4

    .line 119
    .line 120
    shr-int/lit8 v4, v4, 0x1f

    .line 121
    .line 122
    invoke-static {v5}, Lkn3;->p(I)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    :goto_3
    xor-int/2addr v4, v6

    .line 127
    invoke-static {v4, v5, v3}, Lpm2;->q(III)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    goto/16 :goto_f

    .line 132
    .line 133
    :pswitch_3
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_d

    .line 138
    .line 139
    :goto_4
    shl-int/lit8 v4, v7, 0x3

    .line 140
    .line 141
    invoke-static {v4, v11, v3}, Lpm2;->q(III)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    goto/16 :goto_f

    .line 146
    .line 147
    :pswitch_4
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_d

    .line 152
    .line 153
    :goto_5
    shl-int/lit8 v4, v7, 0x3

    .line 154
    .line 155
    invoke-static {v4, v10, v3}, Lpm2;->q(III)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    goto/16 :goto_f

    .line 160
    .line 161
    :pswitch_5
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_d

    .line 166
    .line 167
    invoke-static {p1, v4, v5}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    shl-int/lit8 v5, v7, 0x3

    .line 172
    .line 173
    invoke-static {v4}, Lkn3;->o(I)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    :goto_6
    invoke-static {v5, v4, v3}, Lpm2;->q(III)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    goto/16 :goto_f

    .line 182
    .line 183
    :pswitch_6
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_d

    .line 188
    .line 189
    invoke-static {p1, v4, v5}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    shl-int/lit8 v5, v7, 0x3

    .line 194
    .line 195
    invoke-static {v4}, Lkn3;->p(I)I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    goto :goto_6

    .line 200
    :pswitch_7
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-eqz v6, :cond_d

    .line 205
    .line 206
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Lcn3;

    .line 211
    .line 212
    shl-int/lit8 v5, v7, 0x3

    .line 213
    .line 214
    sget-object v6, Lkn3;->e:Ljava/util/logging/Logger;

    .line 215
    .line 216
    invoke-virtual {v4}, Lcn3;->c()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    invoke-static {v4}, Lkn3;->p(I)I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    :goto_7
    add-int/2addr v6, v4

    .line 225
    invoke-static {v5, v6, v3}, Lpm2;->q(III)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    goto/16 :goto_f

    .line 230
    .line 231
    :pswitch_8
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_d

    .line 236
    .line 237
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-static {v7, v4, v5}, Lcq3;->i(ILjava/lang/Object;Lbq3;)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :pswitch_9
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_d

    .line 256
    .line 257
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    instance-of v5, v4, Lcn3;

    .line 262
    .line 263
    if-eqz v5, :cond_1

    .line 264
    .line 265
    check-cast v4, Lcn3;

    .line 266
    .line 267
    shl-int/lit8 v5, v7, 0x3

    .line 268
    .line 269
    sget-object v6, Lkn3;->e:Ljava/util/logging/Logger;

    .line 270
    .line 271
    invoke-virtual {v4}, Lcn3;->c()I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    invoke-static {v4}, Lkn3;->p(I)I

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    goto :goto_7

    .line 280
    :cond_1
    check-cast v4, Ljava/lang/String;

    .line 281
    .line 282
    shl-int/lit8 v5, v7, 0x3

    .line 283
    .line 284
    invoke-static {v4}, Lkn3;->r(Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    goto :goto_6

    .line 289
    :pswitch_a
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v4, :cond_d

    .line 294
    .line 295
    :goto_8
    shl-int/lit8 v4, v7, 0x3

    .line 296
    .line 297
    invoke-static {v4, v8, v3}, Lpm2;->q(III)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    goto/16 :goto_f

    .line 302
    .line 303
    :pswitch_b
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_d

    .line 308
    .line 309
    goto/16 :goto_5

    .line 310
    .line 311
    :pswitch_c
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_d

    .line 316
    .line 317
    goto/16 :goto_4

    .line 318
    .line 319
    :pswitch_d
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    if-eqz v6, :cond_d

    .line 324
    .line 325
    invoke-static {p1, v4, v5}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    shl-int/lit8 v5, v7, 0x3

    .line 330
    .line 331
    invoke-static {v4}, Lkn3;->o(I)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    goto/16 :goto_6

    .line 336
    .line 337
    :pswitch_e
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    if-eqz v6, :cond_d

    .line 342
    .line 343
    invoke-static {p1, v4, v5}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 344
    .line 345
    .line 346
    move-result-wide v4

    .line 347
    shl-int/lit8 v6, v7, 0x3

    .line 348
    .line 349
    invoke-static {v4, v5}, Lkn3;->q(J)I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    :goto_9
    invoke-static {v6, v4, v3}, Lpm2;->q(III)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    goto/16 :goto_f

    .line 358
    .line 359
    :pswitch_f
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    if-eqz v6, :cond_d

    .line 364
    .line 365
    invoke-static {p1, v4, v5}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 366
    .line 367
    .line 368
    move-result-wide v4

    .line 369
    shl-int/lit8 v6, v7, 0x3

    .line 370
    .line 371
    invoke-static {v4, v5}, Lkn3;->q(J)I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    goto :goto_9

    .line 376
    :pswitch_10
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_d

    .line 381
    .line 382
    goto/16 :goto_5

    .line 383
    .line 384
    :pswitch_11
    invoke-virtual {p0, v7, p1, v2}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_d

    .line 389
    .line 390
    goto/16 :goto_4

    .line 391
    .line 392
    :pswitch_12
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-virtual {p0, v2}, Ltp3;->D(I)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-static {v4, v5}, Lnp3;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_f

    .line 404
    .line 405
    :pswitch_13
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    check-cast v4, Ljava/util/List;

    .line 410
    .line 411
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    sget-object v6, Lcq3;->a:Ljava/lang/Class;

    .line 416
    .line 417
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 418
    .line 419
    .line 420
    move-result v6

    .line 421
    if-eqz v6, :cond_2

    .line 422
    .line 423
    move v8, v1

    .line 424
    move v9, v8

    .line 425
    :goto_a
    if-ge v8, v6, :cond_3

    .line 426
    .line 427
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    check-cast v10, Ltm3;

    .line 432
    .line 433
    invoke-static {v7, v10, v5}, Lkn3;->a(ILtm3;Lbq3;)I

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    add-int/2addr v9, v10

    .line 438
    add-int/lit8 v8, v8, 0x1

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_2
    move v9, v1

    .line 442
    :cond_3
    add-int/2addr v3, v9

    .line 443
    goto/16 :goto_f

    .line 444
    .line 445
    :pswitch_14
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    check-cast v4, Ljava/util/List;

    .line 450
    .line 451
    invoke-static {v4}, Lcq3;->H(Ljava/util/List;)I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-lez v4, :cond_d

    .line 456
    .line 457
    shl-int/lit8 v5, v7, 0x3

    .line 458
    .line 459
    invoke-static {v4}, Lkn3;->p(I)I

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    :goto_b
    invoke-static {v5, v6, v4, v3}, Lpm2;->o(IIII)I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    goto/16 :goto_f

    .line 468
    .line 469
    :pswitch_15
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    check-cast v4, Ljava/util/List;

    .line 474
    .line 475
    invoke-static {v4}, Lcq3;->c(Ljava/util/List;)I

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    if-lez v4, :cond_d

    .line 480
    .line 481
    shl-int/lit8 v5, v7, 0x3

    .line 482
    .line 483
    invoke-static {v4}, Lkn3;->p(I)I

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    goto :goto_b

    .line 488
    :pswitch_16
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    check-cast v4, Ljava/util/List;

    .line 493
    .line 494
    invoke-static {v4}, Lcq3;->f(Ljava/util/List;)I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    if-lez v4, :cond_d

    .line 499
    .line 500
    shl-int/lit8 v5, v7, 0x3

    .line 501
    .line 502
    invoke-static {v4}, Lkn3;->p(I)I

    .line 503
    .line 504
    .line 505
    move-result v6

    .line 506
    goto :goto_b

    .line 507
    :pswitch_17
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    check-cast v4, Ljava/util/List;

    .line 512
    .line 513
    invoke-static {v4}, Lcq3;->d(Ljava/util/List;)I

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-lez v4, :cond_d

    .line 518
    .line 519
    shl-int/lit8 v5, v7, 0x3

    .line 520
    .line 521
    invoke-static {v4}, Lkn3;->p(I)I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    goto :goto_b

    .line 526
    :pswitch_18
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    check-cast v4, Ljava/util/List;

    .line 531
    .line 532
    invoke-static {v4}, Lcq3;->I(Ljava/util/List;)I

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    if-lez v4, :cond_d

    .line 537
    .line 538
    shl-int/lit8 v5, v7, 0x3

    .line 539
    .line 540
    invoke-static {v4}, Lkn3;->p(I)I

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    goto :goto_b

    .line 545
    :pswitch_19
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    check-cast v4, Ljava/util/List;

    .line 550
    .line 551
    invoke-static {v4}, Lcq3;->b(Ljava/util/List;)I

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-lez v4, :cond_d

    .line 556
    .line 557
    shl-int/lit8 v5, v7, 0x3

    .line 558
    .line 559
    invoke-static {v4}, Lkn3;->p(I)I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    goto :goto_b

    .line 564
    :pswitch_1a
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    check-cast v4, Ljava/util/List;

    .line 569
    .line 570
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 571
    .line 572
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 573
    .line 574
    .line 575
    move-result v4

    .line 576
    if-lez v4, :cond_d

    .line 577
    .line 578
    shl-int/lit8 v5, v7, 0x3

    .line 579
    .line 580
    invoke-static {v4}, Lkn3;->p(I)I

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    goto :goto_b

    .line 585
    :pswitch_1b
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    check-cast v4, Ljava/util/List;

    .line 590
    .line 591
    invoke-static {v4}, Lcq3;->d(Ljava/util/List;)I

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    if-lez v4, :cond_d

    .line 596
    .line 597
    shl-int/lit8 v5, v7, 0x3

    .line 598
    .line 599
    invoke-static {v4}, Lkn3;->p(I)I

    .line 600
    .line 601
    .line 602
    move-result v6

    .line 603
    goto/16 :goto_b

    .line 604
    .line 605
    :pswitch_1c
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    check-cast v4, Ljava/util/List;

    .line 610
    .line 611
    invoke-static {v4}, Lcq3;->f(Ljava/util/List;)I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    if-lez v4, :cond_d

    .line 616
    .line 617
    shl-int/lit8 v5, v7, 0x3

    .line 618
    .line 619
    invoke-static {v4}, Lkn3;->p(I)I

    .line 620
    .line 621
    .line 622
    move-result v6

    .line 623
    goto/16 :goto_b

    .line 624
    .line 625
    :pswitch_1d
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    check-cast v4, Ljava/util/List;

    .line 630
    .line 631
    invoke-static {v4}, Lcq3;->a(Ljava/util/List;)I

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-lez v4, :cond_d

    .line 636
    .line 637
    shl-int/lit8 v5, v7, 0x3

    .line 638
    .line 639
    invoke-static {v4}, Lkn3;->p(I)I

    .line 640
    .line 641
    .line 642
    move-result v6

    .line 643
    goto/16 :goto_b

    .line 644
    .line 645
    :pswitch_1e
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    check-cast v4, Ljava/util/List;

    .line 650
    .line 651
    invoke-static {v4}, Lcq3;->G(Ljava/util/List;)I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    if-lez v4, :cond_d

    .line 656
    .line 657
    shl-int/lit8 v5, v7, 0x3

    .line 658
    .line 659
    invoke-static {v4}, Lkn3;->p(I)I

    .line 660
    .line 661
    .line 662
    move-result v6

    .line 663
    goto/16 :goto_b

    .line 664
    .line 665
    :pswitch_1f
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    check-cast v4, Ljava/util/List;

    .line 670
    .line 671
    invoke-static {v4}, Lcq3;->F(Ljava/util/List;)I

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    if-lez v4, :cond_d

    .line 676
    .line 677
    shl-int/lit8 v5, v7, 0x3

    .line 678
    .line 679
    invoke-static {v4}, Lkn3;->p(I)I

    .line 680
    .line 681
    .line 682
    move-result v6

    .line 683
    goto/16 :goto_b

    .line 684
    .line 685
    :pswitch_20
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    check-cast v4, Ljava/util/List;

    .line 690
    .line 691
    invoke-static {v4}, Lcq3;->d(Ljava/util/List;)I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-lez v4, :cond_d

    .line 696
    .line 697
    shl-int/lit8 v5, v7, 0x3

    .line 698
    .line 699
    invoke-static {v4}, Lkn3;->p(I)I

    .line 700
    .line 701
    .line 702
    move-result v6

    .line 703
    goto/16 :goto_b

    .line 704
    .line 705
    :pswitch_21
    invoke-virtual {v0, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v4

    .line 709
    check-cast v4, Ljava/util/List;

    .line 710
    .line 711
    invoke-static {v4}, Lcq3;->f(Ljava/util/List;)I

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    if-lez v4, :cond_d

    .line 716
    .line 717
    shl-int/lit8 v5, v7, 0x3

    .line 718
    .line 719
    invoke-static {v4}, Lkn3;->p(I)I

    .line 720
    .line 721
    .line 722
    move-result v6

    .line 723
    goto/16 :goto_b

    .line 724
    .line 725
    :pswitch_22
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    check-cast v4, Ljava/util/List;

    .line 730
    .line 731
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 732
    .line 733
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-nez v5, :cond_4

    .line 738
    .line 739
    :goto_c
    move v4, v1

    .line 740
    goto/16 :goto_1

    .line 741
    .line 742
    :cond_4
    invoke-static {v4}, Lcq3;->H(Ljava/util/List;)I

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    :goto_d
    shl-int/lit8 v6, v7, 0x3

    .line 747
    .line 748
    invoke-static {v6, v5, v4}, Lpm2;->r(III)I

    .line 749
    .line 750
    .line 751
    move-result v4

    .line 752
    goto/16 :goto_1

    .line 753
    .line 754
    :pswitch_23
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    check-cast v4, Ljava/util/List;

    .line 759
    .line 760
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 761
    .line 762
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 763
    .line 764
    .line 765
    move-result v5

    .line 766
    if-nez v5, :cond_5

    .line 767
    .line 768
    goto :goto_c

    .line 769
    :cond_5
    invoke-static {v4}, Lcq3;->c(Ljava/util/List;)I

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    goto :goto_d

    .line 774
    :pswitch_24
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v4

    .line 778
    check-cast v4, Ljava/util/List;

    .line 779
    .line 780
    invoke-static {v7, v4}, Lcq3;->g(ILjava/util/List;)I

    .line 781
    .line 782
    .line 783
    move-result v4

    .line 784
    goto/16 :goto_1

    .line 785
    .line 786
    :pswitch_25
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    check-cast v4, Ljava/util/List;

    .line 791
    .line 792
    invoke-static {v7, v4}, Lcq3;->e(ILjava/util/List;)I

    .line 793
    .line 794
    .line 795
    move-result v4

    .line 796
    goto/16 :goto_1

    .line 797
    .line 798
    :pswitch_26
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    check-cast v4, Ljava/util/List;

    .line 803
    .line 804
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 805
    .line 806
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 807
    .line 808
    .line 809
    move-result v5

    .line 810
    if-nez v5, :cond_6

    .line 811
    .line 812
    goto :goto_c

    .line 813
    :cond_6
    invoke-static {v4}, Lcq3;->I(Ljava/util/List;)I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    goto :goto_d

    .line 818
    :pswitch_27
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    check-cast v4, Ljava/util/List;

    .line 823
    .line 824
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 825
    .line 826
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 827
    .line 828
    .line 829
    move-result v5

    .line 830
    if-nez v5, :cond_7

    .line 831
    .line 832
    goto :goto_c

    .line 833
    :cond_7
    invoke-static {v4}, Lcq3;->b(Ljava/util/List;)I

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    goto :goto_d

    .line 838
    :pswitch_28
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    check-cast v4, Ljava/util/List;

    .line 843
    .line 844
    invoke-static {v7, v4}, Lcq3;->k(ILjava/util/List;)I

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    goto/16 :goto_1

    .line 849
    .line 850
    :pswitch_29
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    check-cast v4, Ljava/util/List;

    .line 855
    .line 856
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    invoke-static {v7, v4, v5}, Lcq3;->j(ILjava/util/List;Lbq3;)I

    .line 861
    .line 862
    .line 863
    move-result v4

    .line 864
    goto/16 :goto_1

    .line 865
    .line 866
    :pswitch_2a
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    check-cast v4, Ljava/util/List;

    .line 871
    .line 872
    invoke-static {v7, v4}, Lcq3;->h(ILjava/util/List;)I

    .line 873
    .line 874
    .line 875
    move-result v4

    .line 876
    goto/16 :goto_1

    .line 877
    .line 878
    :pswitch_2b
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v4

    .line 882
    check-cast v4, Ljava/util/List;

    .line 883
    .line 884
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 885
    .line 886
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 887
    .line 888
    .line 889
    move-result v4

    .line 890
    if-nez v4, :cond_8

    .line 891
    .line 892
    move v5, v1

    .line 893
    goto :goto_e

    .line 894
    :cond_8
    shl-int/lit8 v5, v7, 0x3

    .line 895
    .line 896
    invoke-static {v5}, Lkn3;->p(I)I

    .line 897
    .line 898
    .line 899
    move-result v5

    .line 900
    add-int/2addr v5, v8

    .line 901
    mul-int/2addr v5, v4

    .line 902
    :goto_e
    add-int/2addr v3, v5

    .line 903
    goto/16 :goto_f

    .line 904
    .line 905
    :pswitch_2c
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    check-cast v4, Ljava/util/List;

    .line 910
    .line 911
    invoke-static {v7, v4}, Lcq3;->e(ILjava/util/List;)I

    .line 912
    .line 913
    .line 914
    move-result v4

    .line 915
    goto/16 :goto_1

    .line 916
    .line 917
    :pswitch_2d
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    check-cast v4, Ljava/util/List;

    .line 922
    .line 923
    invoke-static {v7, v4}, Lcq3;->g(ILjava/util/List;)I

    .line 924
    .line 925
    .line 926
    move-result v4

    .line 927
    goto/16 :goto_1

    .line 928
    .line 929
    :pswitch_2e
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v4

    .line 933
    check-cast v4, Ljava/util/List;

    .line 934
    .line 935
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 936
    .line 937
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 938
    .line 939
    .line 940
    move-result v5

    .line 941
    if-nez v5, :cond_9

    .line 942
    .line 943
    goto/16 :goto_c

    .line 944
    .line 945
    :cond_9
    invoke-static {v4}, Lcq3;->a(Ljava/util/List;)I

    .line 946
    .line 947
    .line 948
    move-result v4

    .line 949
    goto/16 :goto_d

    .line 950
    .line 951
    :pswitch_2f
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    check-cast v4, Ljava/util/List;

    .line 956
    .line 957
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 958
    .line 959
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 960
    .line 961
    .line 962
    move-result v5

    .line 963
    if-nez v5, :cond_a

    .line 964
    .line 965
    goto/16 :goto_c

    .line 966
    .line 967
    :cond_a
    invoke-static {v4}, Lcq3;->G(Ljava/util/List;)I

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    goto/16 :goto_d

    .line 972
    .line 973
    :pswitch_30
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    check-cast v4, Ljava/util/List;

    .line 978
    .line 979
    sget-object v5, Lcq3;->a:Ljava/lang/Class;

    .line 980
    .line 981
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 982
    .line 983
    .line 984
    move-result v5

    .line 985
    if-nez v5, :cond_b

    .line 986
    .line 987
    goto/16 :goto_c

    .line 988
    .line 989
    :cond_b
    invoke-static {v4}, Lcq3;->F(Ljava/util/List;)I

    .line 990
    .line 991
    .line 992
    move-result v5

    .line 993
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    shl-int/lit8 v6, v7, 0x3

    .line 998
    .line 999
    invoke-static {v6, v4, v5}, Lpm2;->r(III)I

    .line 1000
    .line 1001
    .line 1002
    move-result v4

    .line 1003
    goto/16 :goto_1

    .line 1004
    .line 1005
    :pswitch_31
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v4

    .line 1009
    check-cast v4, Ljava/util/List;

    .line 1010
    .line 1011
    invoke-static {v7, v4}, Lcq3;->e(ILjava/util/List;)I

    .line 1012
    .line 1013
    .line 1014
    move-result v4

    .line 1015
    goto/16 :goto_1

    .line 1016
    .line 1017
    :pswitch_32
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v4

    .line 1021
    check-cast v4, Ljava/util/List;

    .line 1022
    .line 1023
    invoke-static {v7, v4}, Lcq3;->g(ILjava/util/List;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v4

    .line 1027
    goto/16 :goto_1

    .line 1028
    .line 1029
    :pswitch_33
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v6

    .line 1033
    if-eqz v6, :cond_d

    .line 1034
    .line 1035
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v4

    .line 1039
    check-cast v4, Ltm3;

    .line 1040
    .line 1041
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v5

    .line 1045
    invoke-static {v7, v4, v5}, Lkn3;->a(ILtm3;Lbq3;)I

    .line 1046
    .line 1047
    .line 1048
    move-result v4

    .line 1049
    goto/16 :goto_1

    .line 1050
    .line 1051
    :pswitch_34
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v6

    .line 1055
    if-eqz v6, :cond_d

    .line 1056
    .line 1057
    invoke-static {p1, v4, v5}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1058
    .line 1059
    .line 1060
    move-result-wide v4

    .line 1061
    shl-int/lit8 v6, v7, 0x3

    .line 1062
    .line 1063
    add-long v7, v4, v4

    .line 1064
    .line 1065
    shr-long/2addr v4, v9

    .line 1066
    invoke-static {v6}, Lkn3;->p(I)I

    .line 1067
    .line 1068
    .line 1069
    move-result v6

    .line 1070
    xor-long/2addr v4, v7

    .line 1071
    invoke-static {v4, v5}, Lkn3;->q(J)I

    .line 1072
    .line 1073
    .line 1074
    move-result v4

    .line 1075
    goto/16 :goto_2

    .line 1076
    .line 1077
    :pswitch_35
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v6

    .line 1081
    if-eqz v6, :cond_d

    .line 1082
    .line 1083
    invoke-static {p1, v4, v5}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1084
    .line 1085
    .line 1086
    move-result v4

    .line 1087
    shl-int/lit8 v5, v7, 0x3

    .line 1088
    .line 1089
    add-int v6, v4, v4

    .line 1090
    .line 1091
    shr-int/lit8 v4, v4, 0x1f

    .line 1092
    .line 1093
    invoke-static {v5}, Lkn3;->p(I)I

    .line 1094
    .line 1095
    .line 1096
    move-result v5

    .line 1097
    goto/16 :goto_3

    .line 1098
    .line 1099
    :pswitch_36
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v4

    .line 1103
    if-eqz v4, :cond_d

    .line 1104
    .line 1105
    goto/16 :goto_4

    .line 1106
    .line 1107
    :pswitch_37
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v4

    .line 1111
    if-eqz v4, :cond_d

    .line 1112
    .line 1113
    goto/16 :goto_5

    .line 1114
    .line 1115
    :pswitch_38
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v6

    .line 1119
    if-eqz v6, :cond_d

    .line 1120
    .line 1121
    invoke-static {p1, v4, v5}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1122
    .line 1123
    .line 1124
    move-result v4

    .line 1125
    shl-int/lit8 v5, v7, 0x3

    .line 1126
    .line 1127
    invoke-static {v4}, Lkn3;->o(I)I

    .line 1128
    .line 1129
    .line 1130
    move-result v4

    .line 1131
    goto/16 :goto_6

    .line 1132
    .line 1133
    :pswitch_39
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v6

    .line 1137
    if-eqz v6, :cond_d

    .line 1138
    .line 1139
    invoke-static {p1, v4, v5}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1140
    .line 1141
    .line 1142
    move-result v4

    .line 1143
    shl-int/lit8 v5, v7, 0x3

    .line 1144
    .line 1145
    invoke-static {v4}, Lkn3;->p(I)I

    .line 1146
    .line 1147
    .line 1148
    move-result v4

    .line 1149
    goto/16 :goto_6

    .line 1150
    .line 1151
    :pswitch_3a
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v6

    .line 1155
    if-eqz v6, :cond_d

    .line 1156
    .line 1157
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v4

    .line 1161
    check-cast v4, Lcn3;

    .line 1162
    .line 1163
    shl-int/lit8 v5, v7, 0x3

    .line 1164
    .line 1165
    sget-object v6, Lkn3;->e:Ljava/util/logging/Logger;

    .line 1166
    .line 1167
    invoke-virtual {v4}, Lcn3;->c()I

    .line 1168
    .line 1169
    .line 1170
    move-result v4

    .line 1171
    invoke-static {v4}, Lkn3;->p(I)I

    .line 1172
    .line 1173
    .line 1174
    move-result v6

    .line 1175
    goto/16 :goto_7

    .line 1176
    .line 1177
    :pswitch_3b
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v6

    .line 1181
    if-eqz v6, :cond_d

    .line 1182
    .line 1183
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v4

    .line 1187
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v5

    .line 1191
    invoke-static {v7, v4, v5}, Lcq3;->i(ILjava/lang/Object;Lbq3;)I

    .line 1192
    .line 1193
    .line 1194
    move-result v4

    .line 1195
    goto/16 :goto_1

    .line 1196
    .line 1197
    :pswitch_3c
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v6

    .line 1201
    if-eqz v6, :cond_d

    .line 1202
    .line 1203
    invoke-static {p1, v4, v5}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v4

    .line 1207
    instance-of v5, v4, Lcn3;

    .line 1208
    .line 1209
    if-eqz v5, :cond_c

    .line 1210
    .line 1211
    check-cast v4, Lcn3;

    .line 1212
    .line 1213
    shl-int/lit8 v5, v7, 0x3

    .line 1214
    .line 1215
    sget-object v6, Lkn3;->e:Ljava/util/logging/Logger;

    .line 1216
    .line 1217
    invoke-virtual {v4}, Lcn3;->c()I

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    invoke-static {v4}, Lkn3;->p(I)I

    .line 1222
    .line 1223
    .line 1224
    move-result v6

    .line 1225
    goto/16 :goto_7

    .line 1226
    .line 1227
    :cond_c
    check-cast v4, Ljava/lang/String;

    .line 1228
    .line 1229
    shl-int/lit8 v5, v7, 0x3

    .line 1230
    .line 1231
    invoke-static {v4}, Lkn3;->r(Ljava/lang/String;)I

    .line 1232
    .line 1233
    .line 1234
    move-result v4

    .line 1235
    goto/16 :goto_6

    .line 1236
    .line 1237
    :pswitch_3d
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1238
    .line 1239
    .line 1240
    move-result v4

    .line 1241
    if-eqz v4, :cond_d

    .line 1242
    .line 1243
    goto/16 :goto_8

    .line 1244
    .line 1245
    :pswitch_3e
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v4

    .line 1249
    if-eqz v4, :cond_d

    .line 1250
    .line 1251
    goto/16 :goto_5

    .line 1252
    .line 1253
    :pswitch_3f
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v4

    .line 1257
    if-eqz v4, :cond_d

    .line 1258
    .line 1259
    goto/16 :goto_4

    .line 1260
    .line 1261
    :pswitch_40
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v6

    .line 1265
    if-eqz v6, :cond_d

    .line 1266
    .line 1267
    invoke-static {p1, v4, v5}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1268
    .line 1269
    .line 1270
    move-result v4

    .line 1271
    shl-int/lit8 v5, v7, 0x3

    .line 1272
    .line 1273
    invoke-static {v4}, Lkn3;->o(I)I

    .line 1274
    .line 1275
    .line 1276
    move-result v4

    .line 1277
    goto/16 :goto_6

    .line 1278
    .line 1279
    :pswitch_41
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v6

    .line 1283
    if-eqz v6, :cond_d

    .line 1284
    .line 1285
    invoke-static {p1, v4, v5}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1286
    .line 1287
    .line 1288
    move-result-wide v4

    .line 1289
    shl-int/lit8 v6, v7, 0x3

    .line 1290
    .line 1291
    invoke-static {v4, v5}, Lkn3;->q(J)I

    .line 1292
    .line 1293
    .line 1294
    move-result v4

    .line 1295
    goto/16 :goto_9

    .line 1296
    .line 1297
    :pswitch_42
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v6

    .line 1301
    if-eqz v6, :cond_d

    .line 1302
    .line 1303
    invoke-static {p1, v4, v5}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1304
    .line 1305
    .line 1306
    move-result-wide v4

    .line 1307
    shl-int/lit8 v6, v7, 0x3

    .line 1308
    .line 1309
    invoke-static {v4, v5}, Lkn3;->q(J)I

    .line 1310
    .line 1311
    .line 1312
    move-result v4

    .line 1313
    goto/16 :goto_9

    .line 1314
    .line 1315
    :pswitch_43
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1316
    .line 1317
    .line 1318
    move-result v4

    .line 1319
    if-eqz v4, :cond_d

    .line 1320
    .line 1321
    goto/16 :goto_5

    .line 1322
    .line 1323
    :pswitch_44
    invoke-virtual {p0, v2, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v4

    .line 1327
    if-eqz v4, :cond_d

    .line 1328
    .line 1329
    goto/16 :goto_4

    .line 1330
    .line 1331
    :cond_d
    :goto_f
    add-int/lit8 v2, v2, 0x3

    .line 1332
    .line 1333
    goto/16 :goto_0

    .line 1334
    .line 1335
    :cond_e
    iget-object p0, p0, Ltp3;->l:Lnq3;

    .line 1336
    .line 1337
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1338
    .line 1339
    .line 1340
    iget-object p0, p1, Leo3;->zzc:Lmq3;

    .line 1341
    .line 1342
    invoke-virtual {p0}, Lmq3;->c()I

    .line 1343
    .line 1344
    .line 1345
    move-result p0

    .line 1346
    add-int/2addr p0, v3

    .line 1347
    return p0

    .line 1348
    :cond_f
    invoke-virtual {p0, p1}, Ltp3;->y(Leo3;)I

    .line 1349
    .line 1350
    .line 1351
    move-result p0

    .line 1352
    return p0

    .line 1353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public final e(Ljava/lang/Object;Lpi3;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Ltp3;->l:Lnq3;

    .line 8
    .line 9
    iget-object v4, v0, Ltp3;->m:Lqn3;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, v0, Ltp3;->a:[I

    .line 14
    .line 15
    const v9, 0xfffff

    .line 16
    .line 17
    .line 18
    iget-boolean v10, v0, Ltp3;->g:Z

    .line 19
    .line 20
    iget-boolean v11, v0, Ltp3;->f:Z

    .line 21
    .line 22
    if-eqz v10, :cond_9

    .line 23
    .line 24
    if-eqz v11, :cond_0

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-object v10, v1

    .line 30
    check-cast v10, Lbo3;

    .line 31
    .line 32
    iget-object v10, v10, Lbo3;->zza:Lun3;

    .line 33
    .line 34
    iget-object v11, v10, Lun3;->a:Lhq3;

    .line 35
    .line 36
    invoke-virtual {v11}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    if-nez v11, :cond_0

    .line 41
    .line 42
    invoke-virtual {v10}, Lun3;->c()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    check-cast v10, Lff2;

    .line 47
    .line 48
    invoke-virtual {v10}, Lff2;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    check-cast v10, Ljava/util/Map$Entry;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v10, 0x0

    .line 56
    :goto_0
    array-length v11, v8

    .line 57
    move v12, v7

    .line 58
    :goto_1
    if-ge v12, v11, :cond_6

    .line 59
    .line 60
    invoke-virtual {v0, v12}, Ltp3;->g(I)I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    aget v14, v8, v12

    .line 65
    .line 66
    if-nez v10, :cond_5

    .line 67
    .line 68
    invoke-static {v13}, Ltp3;->h(I)I

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    packed-switch v15, :pswitch_data_0

    .line 73
    .line 74
    .line 75
    :cond_1
    move v15, v9

    .line 76
    move-object/from16 v16, v10

    .line 77
    .line 78
    :cond_2
    :goto_2
    const/16 v17, 0x0

    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :pswitch_0
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    if-eqz v15, :cond_1

    .line 87
    .line 88
    and-int/2addr v13, v9

    .line 89
    move v15, v9

    .line 90
    move-object/from16 v16, v10

    .line 91
    .line 92
    int-to-long v9, v13

    .line 93
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v0, v12}, Ltp3;->C(I)Lbq3;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-virtual {v2, v14, v9, v10}, Lpi3;->i(ILjava/lang/Object;Lbq3;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :pswitch_1
    move v15, v9

    .line 106
    move-object/from16 v16, v10

    .line 107
    .line 108
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-eqz v9, :cond_2

    .line 113
    .line 114
    and-int v9, v13, v15

    .line 115
    .line 116
    int-to-long v9, v9

    .line 117
    invoke-static {v1, v9, v10}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    invoke-virtual {v2, v14, v9, v10}, Lpi3;->g(IJ)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :pswitch_2
    move v15, v9

    .line 126
    move-object/from16 v16, v10

    .line 127
    .line 128
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_2

    .line 133
    .line 134
    and-int v9, v13, v15

    .line 135
    .line 136
    int-to-long v9, v9

    .line 137
    invoke-static {v1, v9, v10}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    invoke-virtual {v2, v14, v9}, Lpi3;->f(II)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :pswitch_3
    move v15, v9

    .line 146
    move-object/from16 v16, v10

    .line 147
    .line 148
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-eqz v9, :cond_2

    .line 153
    .line 154
    and-int v9, v13, v15

    .line 155
    .line 156
    int-to-long v9, v9

    .line 157
    invoke-static {v1, v9, v10}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v9

    .line 161
    iget-object v13, v2, Lpi3;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v13, Lkn3;

    .line 164
    .line 165
    invoke-virtual {v13, v14, v9, v10}, Lkn3;->f(IJ)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :pswitch_4
    move v15, v9

    .line 170
    move-object/from16 v16, v10

    .line 171
    .line 172
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-eqz v9, :cond_2

    .line 177
    .line 178
    and-int v9, v13, v15

    .line 179
    .line 180
    int-to-long v9, v9

    .line 181
    invoke-static {v1, v9, v10}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v10, Lkn3;

    .line 188
    .line 189
    invoke-virtual {v10, v14, v9}, Lkn3;->d(II)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :pswitch_5
    move v15, v9

    .line 194
    move-object/from16 v16, v10

    .line 195
    .line 196
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_2

    .line 201
    .line 202
    and-int v9, v13, v15

    .line 203
    .line 204
    int-to-long v9, v9

    .line 205
    invoke-static {v1, v9, v10}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v10, Lkn3;

    .line 212
    .line 213
    shl-int/lit8 v13, v14, 0x3

    .line 214
    .line 215
    invoke-virtual {v10, v13}, Lkn3;->j(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v10, v9}, Lkn3;->i(I)V

    .line 219
    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :pswitch_6
    move v15, v9

    .line 224
    move-object/from16 v16, v10

    .line 225
    .line 226
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    if-eqz v9, :cond_2

    .line 231
    .line 232
    and-int v9, v13, v15

    .line 233
    .line 234
    int-to-long v9, v9

    .line 235
    invoke-static {v1, v9, v10}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v10, Lkn3;

    .line 242
    .line 243
    invoke-virtual {v10, v14, v9}, Lkn3;->c(II)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :pswitch_7
    move v15, v9

    .line 249
    move-object/from16 v16, v10

    .line 250
    .line 251
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_2

    .line 256
    .line 257
    and-int v9, v13, v15

    .line 258
    .line 259
    int-to-long v9, v9

    .line 260
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    check-cast v9, Lcn3;

    .line 265
    .line 266
    invoke-virtual {v2, v14, v9}, Lpi3;->e(ILcn3;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :pswitch_8
    move v15, v9

    .line 272
    move-object/from16 v16, v10

    .line 273
    .line 274
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-eqz v9, :cond_2

    .line 279
    .line 280
    and-int v9, v13, v15

    .line 281
    .line 282
    int-to-long v9, v9

    .line 283
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    invoke-virtual {v0, v12}, Ltp3;->C(I)Lbq3;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-virtual {v2, v14, v9, v10}, Lpi3;->h(ILjava/lang/Object;Lbq3;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :pswitch_9
    move v15, v9

    .line 297
    move-object/from16 v16, v10

    .line 298
    .line 299
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    if-eqz v9, :cond_2

    .line 304
    .line 305
    and-int v9, v13, v15

    .line 306
    .line 307
    int-to-long v9, v9

    .line 308
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    invoke-static {v14, v9, v2}, Ltp3;->r(ILjava/lang/Object;Lpi3;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :pswitch_a
    move v15, v9

    .line 318
    move-object/from16 v16, v10

    .line 319
    .line 320
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    if-eqz v9, :cond_2

    .line 325
    .line 326
    and-int v9, v13, v15

    .line 327
    .line 328
    int-to-long v9, v9

    .line 329
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    check-cast v9, Ljava/lang/Boolean;

    .line 334
    .line 335
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v10, Lkn3;

    .line 342
    .line 343
    shl-int/lit8 v13, v14, 0x3

    .line 344
    .line 345
    invoke-virtual {v10, v13}, Lkn3;->j(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v10, v9}, Lkn3;->h(B)V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_2

    .line 352
    .line 353
    :pswitch_b
    move v15, v9

    .line 354
    move-object/from16 v16, v10

    .line 355
    .line 356
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-eqz v9, :cond_2

    .line 361
    .line 362
    and-int v9, v13, v15

    .line 363
    .line 364
    int-to-long v9, v9

    .line 365
    invoke-static {v1, v9, v10}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 366
    .line 367
    .line 368
    move-result v9

    .line 369
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v10, Lkn3;

    .line 372
    .line 373
    invoke-virtual {v10, v14, v9}, Lkn3;->d(II)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_2

    .line 377
    .line 378
    :pswitch_c
    move v15, v9

    .line 379
    move-object/from16 v16, v10

    .line 380
    .line 381
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 382
    .line 383
    .line 384
    move-result v9

    .line 385
    if-eqz v9, :cond_2

    .line 386
    .line 387
    and-int v9, v13, v15

    .line 388
    .line 389
    int-to-long v9, v9

    .line 390
    invoke-static {v1, v9, v10}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 391
    .line 392
    .line 393
    move-result-wide v9

    .line 394
    iget-object v13, v2, Lpi3;->a:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v13, Lkn3;

    .line 397
    .line 398
    invoke-virtual {v13, v14, v9, v10}, Lkn3;->f(IJ)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_2

    .line 402
    .line 403
    :pswitch_d
    move v15, v9

    .line 404
    move-object/from16 v16, v10

    .line 405
    .line 406
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    if-eqz v9, :cond_2

    .line 411
    .line 412
    and-int v9, v13, v15

    .line 413
    .line 414
    int-to-long v9, v9

    .line 415
    invoke-static {v1, v9, v10}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v10, Lkn3;

    .line 422
    .line 423
    shl-int/lit8 v13, v14, 0x3

    .line 424
    .line 425
    invoke-virtual {v10, v13}, Lkn3;->j(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v10, v9}, Lkn3;->i(I)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_2

    .line 432
    .line 433
    :pswitch_e
    move v15, v9

    .line 434
    move-object/from16 v16, v10

    .line 435
    .line 436
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    if-eqz v9, :cond_2

    .line 441
    .line 442
    and-int v9, v13, v15

    .line 443
    .line 444
    int-to-long v9, v9

    .line 445
    invoke-static {v1, v9, v10}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 446
    .line 447
    .line 448
    move-result-wide v9

    .line 449
    iget-object v13, v2, Lpi3;->a:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v13, Lkn3;

    .line 452
    .line 453
    invoke-virtual {v13, v14, v9, v10}, Lkn3;->e(IJ)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_2

    .line 457
    .line 458
    :pswitch_f
    move v15, v9

    .line 459
    move-object/from16 v16, v10

    .line 460
    .line 461
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    if-eqz v9, :cond_2

    .line 466
    .line 467
    and-int v9, v13, v15

    .line 468
    .line 469
    int-to-long v9, v9

    .line 470
    invoke-static {v1, v9, v10}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 471
    .line 472
    .line 473
    move-result-wide v9

    .line 474
    iget-object v13, v2, Lpi3;->a:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v13, Lkn3;

    .line 477
    .line 478
    invoke-virtual {v13, v14, v9, v10}, Lkn3;->e(IJ)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_2

    .line 482
    .line 483
    :pswitch_10
    move v15, v9

    .line 484
    move-object/from16 v16, v10

    .line 485
    .line 486
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    if-eqz v9, :cond_2

    .line 491
    .line 492
    and-int v9, v13, v15

    .line 493
    .line 494
    int-to-long v9, v9

    .line 495
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    check-cast v9, Ljava/lang/Float;

    .line 500
    .line 501
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    iget-object v10, v2, Lpi3;->a:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v10, Lkn3;

    .line 508
    .line 509
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    invoke-virtual {v10, v14, v9}, Lkn3;->d(II)V

    .line 514
    .line 515
    .line 516
    goto/16 :goto_2

    .line 517
    .line 518
    :pswitch_11
    move v15, v9

    .line 519
    move-object/from16 v16, v10

    .line 520
    .line 521
    invoke-virtual {v0, v14, v1, v12}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    if-eqz v9, :cond_2

    .line 526
    .line 527
    and-int v9, v13, v15

    .line 528
    .line 529
    int-to-long v9, v9

    .line 530
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    check-cast v9, Ljava/lang/Double;

    .line 535
    .line 536
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 537
    .line 538
    .line 539
    move-result-wide v9

    .line 540
    iget-object v13, v2, Lpi3;->a:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v13, Lkn3;

    .line 543
    .line 544
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 545
    .line 546
    .line 547
    move-result-wide v9

    .line 548
    invoke-virtual {v13, v14, v9, v10}, Lkn3;->f(IJ)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_2

    .line 552
    .line 553
    :pswitch_12
    move v15, v9

    .line 554
    move-object/from16 v16, v10

    .line 555
    .line 556
    and-int v9, v13, v15

    .line 557
    .line 558
    int-to-long v9, v9

    .line 559
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    if-nez v9, :cond_3

    .line 564
    .line 565
    goto/16 :goto_2

    .line 566
    .line 567
    :cond_3
    invoke-virtual {v0, v12}, Ltp3;->D(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :pswitch_13
    move v15, v9

    .line 579
    move-object/from16 v16, v10

    .line 580
    .line 581
    aget v9, v8, v12

    .line 582
    .line 583
    and-int v10, v13, v15

    .line 584
    .line 585
    int-to-long v13, v10

    .line 586
    invoke-static {v1, v13, v14}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v10

    .line 590
    check-cast v10, Ljava/util/List;

    .line 591
    .line 592
    invoke-virtual {v0, v12}, Ltp3;->C(I)Lbq3;

    .line 593
    .line 594
    .line 595
    move-result-object v13

    .line 596
    sget-object v14, Lcq3;->a:Ljava/lang/Class;

    .line 597
    .line 598
    if-eqz v10, :cond_2

    .line 599
    .line 600
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 601
    .line 602
    .line 603
    move-result v14

    .line 604
    if-nez v14, :cond_2

    .line 605
    .line 606
    move v14, v7

    .line 607
    const/16 v17, 0x0

    .line 608
    .line 609
    :goto_3
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    if-ge v14, v5, :cond_4

    .line 614
    .line 615
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v5

    .line 619
    invoke-virtual {v2, v9, v5, v13}, Lpi3;->i(ILjava/lang/Object;Lbq3;)V

    .line 620
    .line 621
    .line 622
    add-int/lit8 v14, v14, 0x1

    .line 623
    .line 624
    goto :goto_3

    .line 625
    :pswitch_14
    move v15, v9

    .line 626
    move-object/from16 v16, v10

    .line 627
    .line 628
    const/16 v17, 0x0

    .line 629
    .line 630
    aget v5, v8, v12

    .line 631
    .line 632
    and-int v9, v13, v15

    .line 633
    .line 634
    int-to-long v9, v9

    .line 635
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v9

    .line 639
    check-cast v9, Ljava/util/List;

    .line 640
    .line 641
    invoke-static {v5, v9, v2, v6}, Lcq3;->t(ILjava/util/List;Lpi3;Z)V

    .line 642
    .line 643
    .line 644
    goto/16 :goto_5

    .line 645
    .line 646
    :pswitch_15
    move v15, v9

    .line 647
    move-object/from16 v16, v10

    .line 648
    .line 649
    const/16 v17, 0x0

    .line 650
    .line 651
    aget v5, v8, v12

    .line 652
    .line 653
    and-int v9, v13, v15

    .line 654
    .line 655
    int-to-long v9, v9

    .line 656
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    check-cast v9, Ljava/util/List;

    .line 661
    .line 662
    invoke-static {v5, v9, v2, v6}, Lcq3;->y(ILjava/util/List;Lpi3;Z)V

    .line 663
    .line 664
    .line 665
    goto/16 :goto_5

    .line 666
    .line 667
    :pswitch_16
    move v15, v9

    .line 668
    move-object/from16 v16, v10

    .line 669
    .line 670
    const/16 v17, 0x0

    .line 671
    .line 672
    aget v5, v8, v12

    .line 673
    .line 674
    and-int v9, v13, v15

    .line 675
    .line 676
    int-to-long v9, v9

    .line 677
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v9

    .line 681
    check-cast v9, Ljava/util/List;

    .line 682
    .line 683
    invoke-static {v5, v9, v2, v6}, Lcq3;->v(ILjava/util/List;Lpi3;Z)V

    .line 684
    .line 685
    .line 686
    goto/16 :goto_5

    .line 687
    .line 688
    :pswitch_17
    move v15, v9

    .line 689
    move-object/from16 v16, v10

    .line 690
    .line 691
    const/16 v17, 0x0

    .line 692
    .line 693
    aget v5, v8, v12

    .line 694
    .line 695
    and-int v9, v13, v15

    .line 696
    .line 697
    int-to-long v9, v9

    .line 698
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    check-cast v9, Ljava/util/List;

    .line 703
    .line 704
    invoke-static {v5, v9, v2, v6}, Lcq3;->A(ILjava/util/List;Lpi3;Z)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_5

    .line 708
    .line 709
    :pswitch_18
    move v15, v9

    .line 710
    move-object/from16 v16, v10

    .line 711
    .line 712
    const/16 v17, 0x0

    .line 713
    .line 714
    aget v5, v8, v12

    .line 715
    .line 716
    and-int v9, v13, v15

    .line 717
    .line 718
    int-to-long v9, v9

    .line 719
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v9

    .line 723
    check-cast v9, Ljava/util/List;

    .line 724
    .line 725
    invoke-static {v5, v9, v2, v6}, Lcq3;->B(ILjava/util/List;Lpi3;Z)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_5

    .line 729
    .line 730
    :pswitch_19
    move v15, v9

    .line 731
    move-object/from16 v16, v10

    .line 732
    .line 733
    const/16 v17, 0x0

    .line 734
    .line 735
    aget v5, v8, v12

    .line 736
    .line 737
    and-int v9, v13, v15

    .line 738
    .line 739
    int-to-long v9, v9

    .line 740
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v9

    .line 744
    check-cast v9, Ljava/util/List;

    .line 745
    .line 746
    invoke-static {v5, v9, v2, v6}, Lcq3;->x(ILjava/util/List;Lpi3;Z)V

    .line 747
    .line 748
    .line 749
    goto/16 :goto_5

    .line 750
    .line 751
    :pswitch_1a
    move v15, v9

    .line 752
    move-object/from16 v16, v10

    .line 753
    .line 754
    const/16 v17, 0x0

    .line 755
    .line 756
    aget v5, v8, v12

    .line 757
    .line 758
    and-int v9, v13, v15

    .line 759
    .line 760
    int-to-long v9, v9

    .line 761
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v9

    .line 765
    check-cast v9, Ljava/util/List;

    .line 766
    .line 767
    invoke-static {v5, v9, v2, v6}, Lcq3;->C(ILjava/util/List;Lpi3;Z)V

    .line 768
    .line 769
    .line 770
    goto/16 :goto_5

    .line 771
    .line 772
    :pswitch_1b
    move v15, v9

    .line 773
    move-object/from16 v16, v10

    .line 774
    .line 775
    const/16 v17, 0x0

    .line 776
    .line 777
    aget v5, v8, v12

    .line 778
    .line 779
    and-int v9, v13, v15

    .line 780
    .line 781
    int-to-long v9, v9

    .line 782
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v9

    .line 786
    check-cast v9, Ljava/util/List;

    .line 787
    .line 788
    invoke-static {v5, v9, v2, v6}, Lcq3;->z(ILjava/util/List;Lpi3;Z)V

    .line 789
    .line 790
    .line 791
    goto/16 :goto_5

    .line 792
    .line 793
    :pswitch_1c
    move v15, v9

    .line 794
    move-object/from16 v16, v10

    .line 795
    .line 796
    const/16 v17, 0x0

    .line 797
    .line 798
    aget v5, v8, v12

    .line 799
    .line 800
    and-int v9, v13, v15

    .line 801
    .line 802
    int-to-long v9, v9

    .line 803
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v9

    .line 807
    check-cast v9, Ljava/util/List;

    .line 808
    .line 809
    invoke-static {v5, v9, v2, v6}, Lcq3;->u(ILjava/util/List;Lpi3;Z)V

    .line 810
    .line 811
    .line 812
    goto/16 :goto_5

    .line 813
    .line 814
    :pswitch_1d
    move v15, v9

    .line 815
    move-object/from16 v16, v10

    .line 816
    .line 817
    const/16 v17, 0x0

    .line 818
    .line 819
    aget v5, v8, v12

    .line 820
    .line 821
    and-int v9, v13, v15

    .line 822
    .line 823
    int-to-long v9, v9

    .line 824
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v9

    .line 828
    check-cast v9, Ljava/util/List;

    .line 829
    .line 830
    invoke-static {v5, v9, v2, v6}, Lcq3;->w(ILjava/util/List;Lpi3;Z)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_5

    .line 834
    .line 835
    :pswitch_1e
    move v15, v9

    .line 836
    move-object/from16 v16, v10

    .line 837
    .line 838
    const/16 v17, 0x0

    .line 839
    .line 840
    aget v5, v8, v12

    .line 841
    .line 842
    and-int v9, v13, v15

    .line 843
    .line 844
    int-to-long v9, v9

    .line 845
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v9

    .line 849
    check-cast v9, Ljava/util/List;

    .line 850
    .line 851
    invoke-static {v5, v9, v2, v6}, Lcq3;->s(ILjava/util/List;Lpi3;Z)V

    .line 852
    .line 853
    .line 854
    goto/16 :goto_5

    .line 855
    .line 856
    :pswitch_1f
    move v15, v9

    .line 857
    move-object/from16 v16, v10

    .line 858
    .line 859
    const/16 v17, 0x0

    .line 860
    .line 861
    aget v5, v8, v12

    .line 862
    .line 863
    and-int v9, v13, v15

    .line 864
    .line 865
    int-to-long v9, v9

    .line 866
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v9

    .line 870
    check-cast v9, Ljava/util/List;

    .line 871
    .line 872
    invoke-static {v5, v9, v2, v6}, Lcq3;->r(ILjava/util/List;Lpi3;Z)V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_5

    .line 876
    .line 877
    :pswitch_20
    move v15, v9

    .line 878
    move-object/from16 v16, v10

    .line 879
    .line 880
    const/16 v17, 0x0

    .line 881
    .line 882
    aget v5, v8, v12

    .line 883
    .line 884
    and-int v9, v13, v15

    .line 885
    .line 886
    int-to-long v9, v9

    .line 887
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    check-cast v9, Ljava/util/List;

    .line 892
    .line 893
    invoke-static {v5, v9, v2, v6}, Lcq3;->q(ILjava/util/List;Lpi3;Z)V

    .line 894
    .line 895
    .line 896
    goto/16 :goto_5

    .line 897
    .line 898
    :pswitch_21
    move v15, v9

    .line 899
    move-object/from16 v16, v10

    .line 900
    .line 901
    const/16 v17, 0x0

    .line 902
    .line 903
    aget v5, v8, v12

    .line 904
    .line 905
    and-int v9, v13, v15

    .line 906
    .line 907
    int-to-long v9, v9

    .line 908
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v9

    .line 912
    check-cast v9, Ljava/util/List;

    .line 913
    .line 914
    invoke-static {v5, v9, v2, v6}, Lcq3;->p(ILjava/util/List;Lpi3;Z)V

    .line 915
    .line 916
    .line 917
    goto/16 :goto_5

    .line 918
    .line 919
    :pswitch_22
    move v15, v9

    .line 920
    move-object/from16 v16, v10

    .line 921
    .line 922
    const/16 v17, 0x0

    .line 923
    .line 924
    aget v5, v8, v12

    .line 925
    .line 926
    and-int v9, v13, v15

    .line 927
    .line 928
    int-to-long v9, v9

    .line 929
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v9

    .line 933
    check-cast v9, Ljava/util/List;

    .line 934
    .line 935
    invoke-static {v5, v9, v2, v7}, Lcq3;->t(ILjava/util/List;Lpi3;Z)V

    .line 936
    .line 937
    .line 938
    goto/16 :goto_5

    .line 939
    .line 940
    :pswitch_23
    move v15, v9

    .line 941
    move-object/from16 v16, v10

    .line 942
    .line 943
    const/16 v17, 0x0

    .line 944
    .line 945
    aget v5, v8, v12

    .line 946
    .line 947
    and-int v9, v13, v15

    .line 948
    .line 949
    int-to-long v9, v9

    .line 950
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    check-cast v9, Ljava/util/List;

    .line 955
    .line 956
    invoke-static {v5, v9, v2, v7}, Lcq3;->y(ILjava/util/List;Lpi3;Z)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_5

    .line 960
    .line 961
    :pswitch_24
    move v15, v9

    .line 962
    move-object/from16 v16, v10

    .line 963
    .line 964
    const/16 v17, 0x0

    .line 965
    .line 966
    aget v5, v8, v12

    .line 967
    .line 968
    and-int v9, v13, v15

    .line 969
    .line 970
    int-to-long v9, v9

    .line 971
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v9

    .line 975
    check-cast v9, Ljava/util/List;

    .line 976
    .line 977
    invoke-static {v5, v9, v2, v7}, Lcq3;->v(ILjava/util/List;Lpi3;Z)V

    .line 978
    .line 979
    .line 980
    goto/16 :goto_5

    .line 981
    .line 982
    :pswitch_25
    move v15, v9

    .line 983
    move-object/from16 v16, v10

    .line 984
    .line 985
    const/16 v17, 0x0

    .line 986
    .line 987
    aget v5, v8, v12

    .line 988
    .line 989
    and-int v9, v13, v15

    .line 990
    .line 991
    int-to-long v9, v9

    .line 992
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v9

    .line 996
    check-cast v9, Ljava/util/List;

    .line 997
    .line 998
    invoke-static {v5, v9, v2, v7}, Lcq3;->A(ILjava/util/List;Lpi3;Z)V

    .line 999
    .line 1000
    .line 1001
    goto/16 :goto_5

    .line 1002
    .line 1003
    :pswitch_26
    move v15, v9

    .line 1004
    move-object/from16 v16, v10

    .line 1005
    .line 1006
    const/16 v17, 0x0

    .line 1007
    .line 1008
    aget v5, v8, v12

    .line 1009
    .line 1010
    and-int v9, v13, v15

    .line 1011
    .line 1012
    int-to-long v9, v9

    .line 1013
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v9

    .line 1017
    check-cast v9, Ljava/util/List;

    .line 1018
    .line 1019
    invoke-static {v5, v9, v2, v7}, Lcq3;->B(ILjava/util/List;Lpi3;Z)V

    .line 1020
    .line 1021
    .line 1022
    goto/16 :goto_5

    .line 1023
    .line 1024
    :pswitch_27
    move v15, v9

    .line 1025
    move-object/from16 v16, v10

    .line 1026
    .line 1027
    const/16 v17, 0x0

    .line 1028
    .line 1029
    aget v5, v8, v12

    .line 1030
    .line 1031
    and-int v9, v13, v15

    .line 1032
    .line 1033
    int-to-long v9, v9

    .line 1034
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v9

    .line 1038
    check-cast v9, Ljava/util/List;

    .line 1039
    .line 1040
    invoke-static {v5, v9, v2, v7}, Lcq3;->x(ILjava/util/List;Lpi3;Z)V

    .line 1041
    .line 1042
    .line 1043
    goto/16 :goto_5

    .line 1044
    .line 1045
    :pswitch_28
    move v15, v9

    .line 1046
    move-object/from16 v16, v10

    .line 1047
    .line 1048
    const/16 v17, 0x0

    .line 1049
    .line 1050
    aget v5, v8, v12

    .line 1051
    .line 1052
    and-int v9, v13, v15

    .line 1053
    .line 1054
    int-to-long v9, v9

    .line 1055
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v9

    .line 1059
    check-cast v9, Ljava/util/List;

    .line 1060
    .line 1061
    invoke-static {v5, v9, v2}, Lcq3;->E(ILjava/util/List;Lpi3;)V

    .line 1062
    .line 1063
    .line 1064
    goto/16 :goto_5

    .line 1065
    .line 1066
    :pswitch_29
    move v15, v9

    .line 1067
    move-object/from16 v16, v10

    .line 1068
    .line 1069
    const/16 v17, 0x0

    .line 1070
    .line 1071
    aget v5, v8, v12

    .line 1072
    .line 1073
    and-int v9, v13, v15

    .line 1074
    .line 1075
    int-to-long v9, v9

    .line 1076
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v9

    .line 1080
    check-cast v9, Ljava/util/List;

    .line 1081
    .line 1082
    invoke-virtual {v0, v12}, Ltp3;->C(I)Lbq3;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v10

    .line 1086
    sget-object v13, Lcq3;->a:Ljava/lang/Class;

    .line 1087
    .line 1088
    if-eqz v9, :cond_4

    .line 1089
    .line 1090
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v13

    .line 1094
    if-nez v13, :cond_4

    .line 1095
    .line 1096
    move v13, v7

    .line 1097
    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1098
    .line 1099
    .line 1100
    move-result v14

    .line 1101
    if-ge v13, v14, :cond_4

    .line 1102
    .line 1103
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v14

    .line 1107
    invoke-virtual {v2, v5, v14, v10}, Lpi3;->h(ILjava/lang/Object;Lbq3;)V

    .line 1108
    .line 1109
    .line 1110
    add-int/lit8 v13, v13, 0x1

    .line 1111
    .line 1112
    goto :goto_4

    .line 1113
    :pswitch_2a
    move v15, v9

    .line 1114
    move-object/from16 v16, v10

    .line 1115
    .line 1116
    const/16 v17, 0x0

    .line 1117
    .line 1118
    aget v5, v8, v12

    .line 1119
    .line 1120
    and-int v9, v13, v15

    .line 1121
    .line 1122
    int-to-long v9, v9

    .line 1123
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v9

    .line 1127
    check-cast v9, Ljava/util/List;

    .line 1128
    .line 1129
    invoke-static {v5, v9, v2}, Lcq3;->D(ILjava/util/List;Lpi3;)V

    .line 1130
    .line 1131
    .line 1132
    goto/16 :goto_5

    .line 1133
    .line 1134
    :pswitch_2b
    move v15, v9

    .line 1135
    move-object/from16 v16, v10

    .line 1136
    .line 1137
    const/16 v17, 0x0

    .line 1138
    .line 1139
    aget v5, v8, v12

    .line 1140
    .line 1141
    and-int v9, v13, v15

    .line 1142
    .line 1143
    int-to-long v9, v9

    .line 1144
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v9

    .line 1148
    check-cast v9, Ljava/util/List;

    .line 1149
    .line 1150
    invoke-static {v5, v9, v2, v7}, Lcq3;->C(ILjava/util/List;Lpi3;Z)V

    .line 1151
    .line 1152
    .line 1153
    goto/16 :goto_5

    .line 1154
    .line 1155
    :pswitch_2c
    move v15, v9

    .line 1156
    move-object/from16 v16, v10

    .line 1157
    .line 1158
    const/16 v17, 0x0

    .line 1159
    .line 1160
    aget v5, v8, v12

    .line 1161
    .line 1162
    and-int v9, v13, v15

    .line 1163
    .line 1164
    int-to-long v9, v9

    .line 1165
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v9

    .line 1169
    check-cast v9, Ljava/util/List;

    .line 1170
    .line 1171
    invoke-static {v5, v9, v2, v7}, Lcq3;->z(ILjava/util/List;Lpi3;Z)V

    .line 1172
    .line 1173
    .line 1174
    goto/16 :goto_5

    .line 1175
    .line 1176
    :pswitch_2d
    move v15, v9

    .line 1177
    move-object/from16 v16, v10

    .line 1178
    .line 1179
    const/16 v17, 0x0

    .line 1180
    .line 1181
    aget v5, v8, v12

    .line 1182
    .line 1183
    and-int v9, v13, v15

    .line 1184
    .line 1185
    int-to-long v9, v9

    .line 1186
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v9

    .line 1190
    check-cast v9, Ljava/util/List;

    .line 1191
    .line 1192
    invoke-static {v5, v9, v2, v7}, Lcq3;->u(ILjava/util/List;Lpi3;Z)V

    .line 1193
    .line 1194
    .line 1195
    goto/16 :goto_5

    .line 1196
    .line 1197
    :pswitch_2e
    move v15, v9

    .line 1198
    move-object/from16 v16, v10

    .line 1199
    .line 1200
    const/16 v17, 0x0

    .line 1201
    .line 1202
    aget v5, v8, v12

    .line 1203
    .line 1204
    and-int v9, v13, v15

    .line 1205
    .line 1206
    int-to-long v9, v9

    .line 1207
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v9

    .line 1211
    check-cast v9, Ljava/util/List;

    .line 1212
    .line 1213
    invoke-static {v5, v9, v2, v7}, Lcq3;->w(ILjava/util/List;Lpi3;Z)V

    .line 1214
    .line 1215
    .line 1216
    goto/16 :goto_5

    .line 1217
    .line 1218
    :pswitch_2f
    move v15, v9

    .line 1219
    move-object/from16 v16, v10

    .line 1220
    .line 1221
    const/16 v17, 0x0

    .line 1222
    .line 1223
    aget v5, v8, v12

    .line 1224
    .line 1225
    and-int v9, v13, v15

    .line 1226
    .line 1227
    int-to-long v9, v9

    .line 1228
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v9

    .line 1232
    check-cast v9, Ljava/util/List;

    .line 1233
    .line 1234
    invoke-static {v5, v9, v2, v7}, Lcq3;->s(ILjava/util/List;Lpi3;Z)V

    .line 1235
    .line 1236
    .line 1237
    goto/16 :goto_5

    .line 1238
    .line 1239
    :pswitch_30
    move v15, v9

    .line 1240
    move-object/from16 v16, v10

    .line 1241
    .line 1242
    const/16 v17, 0x0

    .line 1243
    .line 1244
    aget v5, v8, v12

    .line 1245
    .line 1246
    and-int v9, v13, v15

    .line 1247
    .line 1248
    int-to-long v9, v9

    .line 1249
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v9

    .line 1253
    check-cast v9, Ljava/util/List;

    .line 1254
    .line 1255
    invoke-static {v5, v9, v2, v7}, Lcq3;->r(ILjava/util/List;Lpi3;Z)V

    .line 1256
    .line 1257
    .line 1258
    goto/16 :goto_5

    .line 1259
    .line 1260
    :pswitch_31
    move v15, v9

    .line 1261
    move-object/from16 v16, v10

    .line 1262
    .line 1263
    const/16 v17, 0x0

    .line 1264
    .line 1265
    aget v5, v8, v12

    .line 1266
    .line 1267
    and-int v9, v13, v15

    .line 1268
    .line 1269
    int-to-long v9, v9

    .line 1270
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v9

    .line 1274
    check-cast v9, Ljava/util/List;

    .line 1275
    .line 1276
    invoke-static {v5, v9, v2, v7}, Lcq3;->q(ILjava/util/List;Lpi3;Z)V

    .line 1277
    .line 1278
    .line 1279
    goto/16 :goto_5

    .line 1280
    .line 1281
    :pswitch_32
    move v15, v9

    .line 1282
    move-object/from16 v16, v10

    .line 1283
    .line 1284
    const/16 v17, 0x0

    .line 1285
    .line 1286
    aget v5, v8, v12

    .line 1287
    .line 1288
    and-int v9, v13, v15

    .line 1289
    .line 1290
    int-to-long v9, v9

    .line 1291
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v9

    .line 1295
    check-cast v9, Ljava/util/List;

    .line 1296
    .line 1297
    invoke-static {v5, v9, v2, v7}, Lcq3;->p(ILjava/util/List;Lpi3;Z)V

    .line 1298
    .line 1299
    .line 1300
    goto/16 :goto_5

    .line 1301
    .line 1302
    :pswitch_33
    move v15, v9

    .line 1303
    move-object/from16 v16, v10

    .line 1304
    .line 1305
    const/16 v17, 0x0

    .line 1306
    .line 1307
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v5

    .line 1311
    if-eqz v5, :cond_4

    .line 1312
    .line 1313
    and-int v5, v13, v15

    .line 1314
    .line 1315
    int-to-long v9, v5

    .line 1316
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    invoke-virtual {v0, v12}, Ltp3;->C(I)Lbq3;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v9

    .line 1324
    invoke-virtual {v2, v14, v5, v9}, Lpi3;->i(ILjava/lang/Object;Lbq3;)V

    .line 1325
    .line 1326
    .line 1327
    goto/16 :goto_5

    .line 1328
    .line 1329
    :pswitch_34
    move v15, v9

    .line 1330
    move-object/from16 v16, v10

    .line 1331
    .line 1332
    const/16 v17, 0x0

    .line 1333
    .line 1334
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v5

    .line 1338
    if-eqz v5, :cond_4

    .line 1339
    .line 1340
    and-int v5, v13, v15

    .line 1341
    .line 1342
    int-to-long v9, v5

    .line 1343
    invoke-static {v1, v9, v10}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v9

    .line 1347
    invoke-virtual {v2, v14, v9, v10}, Lpi3;->g(IJ)V

    .line 1348
    .line 1349
    .line 1350
    goto/16 :goto_5

    .line 1351
    .line 1352
    :pswitch_35
    move v15, v9

    .line 1353
    move-object/from16 v16, v10

    .line 1354
    .line 1355
    const/16 v17, 0x0

    .line 1356
    .line 1357
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    move-result v5

    .line 1361
    if-eqz v5, :cond_4

    .line 1362
    .line 1363
    and-int v5, v13, v15

    .line 1364
    .line 1365
    int-to-long v9, v5

    .line 1366
    invoke-static {v1, v9, v10}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    invoke-virtual {v2, v14, v5}, Lpi3;->f(II)V

    .line 1371
    .line 1372
    .line 1373
    goto/16 :goto_5

    .line 1374
    .line 1375
    :pswitch_36
    move v15, v9

    .line 1376
    move-object/from16 v16, v10

    .line 1377
    .line 1378
    const/16 v17, 0x0

    .line 1379
    .line 1380
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v5

    .line 1384
    if-eqz v5, :cond_4

    .line 1385
    .line 1386
    and-int v5, v13, v15

    .line 1387
    .line 1388
    int-to-long v9, v5

    .line 1389
    invoke-static {v1, v9, v10}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v9

    .line 1393
    iget-object v5, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v5, Lkn3;

    .line 1396
    .line 1397
    invoke-virtual {v5, v14, v9, v10}, Lkn3;->f(IJ)V

    .line 1398
    .line 1399
    .line 1400
    goto/16 :goto_5

    .line 1401
    .line 1402
    :pswitch_37
    move v15, v9

    .line 1403
    move-object/from16 v16, v10

    .line 1404
    .line 1405
    const/16 v17, 0x0

    .line 1406
    .line 1407
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v5

    .line 1411
    if-eqz v5, :cond_4

    .line 1412
    .line 1413
    and-int v5, v13, v15

    .line 1414
    .line 1415
    int-to-long v9, v5

    .line 1416
    invoke-static {v1, v9, v10}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1417
    .line 1418
    .line 1419
    move-result v5

    .line 1420
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v9, Lkn3;

    .line 1423
    .line 1424
    invoke-virtual {v9, v14, v5}, Lkn3;->d(II)V

    .line 1425
    .line 1426
    .line 1427
    goto/16 :goto_5

    .line 1428
    .line 1429
    :pswitch_38
    move v15, v9

    .line 1430
    move-object/from16 v16, v10

    .line 1431
    .line 1432
    const/16 v17, 0x0

    .line 1433
    .line 1434
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v5

    .line 1438
    if-eqz v5, :cond_4

    .line 1439
    .line 1440
    and-int v5, v13, v15

    .line 1441
    .line 1442
    int-to-long v9, v5

    .line 1443
    invoke-static {v1, v9, v10}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1444
    .line 1445
    .line 1446
    move-result v5

    .line 1447
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v9, Lkn3;

    .line 1450
    .line 1451
    shl-int/lit8 v10, v14, 0x3

    .line 1452
    .line 1453
    invoke-virtual {v9, v10}, Lkn3;->j(I)V

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v9, v5}, Lkn3;->i(I)V

    .line 1457
    .line 1458
    .line 1459
    goto/16 :goto_5

    .line 1460
    .line 1461
    :pswitch_39
    move v15, v9

    .line 1462
    move-object/from16 v16, v10

    .line 1463
    .line 1464
    const/16 v17, 0x0

    .line 1465
    .line 1466
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v5

    .line 1470
    if-eqz v5, :cond_4

    .line 1471
    .line 1472
    and-int v5, v13, v15

    .line 1473
    .line 1474
    int-to-long v9, v5

    .line 1475
    invoke-static {v1, v9, v10}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1476
    .line 1477
    .line 1478
    move-result v5

    .line 1479
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1480
    .line 1481
    check-cast v9, Lkn3;

    .line 1482
    .line 1483
    invoke-virtual {v9, v14, v5}, Lkn3;->c(II)V

    .line 1484
    .line 1485
    .line 1486
    goto/16 :goto_5

    .line 1487
    .line 1488
    :pswitch_3a
    move v15, v9

    .line 1489
    move-object/from16 v16, v10

    .line 1490
    .line 1491
    const/16 v17, 0x0

    .line 1492
    .line 1493
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1494
    .line 1495
    .line 1496
    move-result v5

    .line 1497
    if-eqz v5, :cond_4

    .line 1498
    .line 1499
    and-int v5, v13, v15

    .line 1500
    .line 1501
    int-to-long v9, v5

    .line 1502
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v5

    .line 1506
    check-cast v5, Lcn3;

    .line 1507
    .line 1508
    invoke-virtual {v2, v14, v5}, Lpi3;->e(ILcn3;)V

    .line 1509
    .line 1510
    .line 1511
    goto/16 :goto_5

    .line 1512
    .line 1513
    :pswitch_3b
    move v15, v9

    .line 1514
    move-object/from16 v16, v10

    .line 1515
    .line 1516
    const/16 v17, 0x0

    .line 1517
    .line 1518
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v5

    .line 1522
    if-eqz v5, :cond_4

    .line 1523
    .line 1524
    and-int v5, v13, v15

    .line 1525
    .line 1526
    int-to-long v9, v5

    .line 1527
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v5

    .line 1531
    invoke-virtual {v0, v12}, Ltp3;->C(I)Lbq3;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v9

    .line 1535
    invoke-virtual {v2, v14, v5, v9}, Lpi3;->h(ILjava/lang/Object;Lbq3;)V

    .line 1536
    .line 1537
    .line 1538
    goto/16 :goto_5

    .line 1539
    .line 1540
    :pswitch_3c
    move v15, v9

    .line 1541
    move-object/from16 v16, v10

    .line 1542
    .line 1543
    const/16 v17, 0x0

    .line 1544
    .line 1545
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v5

    .line 1549
    if-eqz v5, :cond_4

    .line 1550
    .line 1551
    and-int v5, v13, v15

    .line 1552
    .line 1553
    int-to-long v9, v5

    .line 1554
    invoke-static {v1, v9, v10}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v5

    .line 1558
    invoke-static {v14, v5, v2}, Ltp3;->r(ILjava/lang/Object;Lpi3;)V

    .line 1559
    .line 1560
    .line 1561
    goto/16 :goto_5

    .line 1562
    .line 1563
    :pswitch_3d
    move v15, v9

    .line 1564
    move-object/from16 v16, v10

    .line 1565
    .line 1566
    const/16 v17, 0x0

    .line 1567
    .line 1568
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1569
    .line 1570
    .line 1571
    move-result v5

    .line 1572
    if-eqz v5, :cond_4

    .line 1573
    .line 1574
    and-int v5, v13, v15

    .line 1575
    .line 1576
    int-to-long v9, v5

    .line 1577
    sget-object v5, Ltq3;->c:Lsq3;

    .line 1578
    .line 1579
    invoke-virtual {v5, v1, v9, v10}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 1580
    .line 1581
    .line 1582
    move-result v5

    .line 1583
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1584
    .line 1585
    check-cast v9, Lkn3;

    .line 1586
    .line 1587
    shl-int/lit8 v10, v14, 0x3

    .line 1588
    .line 1589
    invoke-virtual {v9, v10}, Lkn3;->j(I)V

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v9, v5}, Lkn3;->h(B)V

    .line 1593
    .line 1594
    .line 1595
    goto/16 :goto_5

    .line 1596
    .line 1597
    :pswitch_3e
    move v15, v9

    .line 1598
    move-object/from16 v16, v10

    .line 1599
    .line 1600
    const/16 v17, 0x0

    .line 1601
    .line 1602
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v5

    .line 1606
    if-eqz v5, :cond_4

    .line 1607
    .line 1608
    and-int v5, v13, v15

    .line 1609
    .line 1610
    int-to-long v9, v5

    .line 1611
    invoke-static {v1, v9, v10}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1612
    .line 1613
    .line 1614
    move-result v5

    .line 1615
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1616
    .line 1617
    check-cast v9, Lkn3;

    .line 1618
    .line 1619
    invoke-virtual {v9, v14, v5}, Lkn3;->d(II)V

    .line 1620
    .line 1621
    .line 1622
    goto/16 :goto_5

    .line 1623
    .line 1624
    :pswitch_3f
    move v15, v9

    .line 1625
    move-object/from16 v16, v10

    .line 1626
    .line 1627
    const/16 v17, 0x0

    .line 1628
    .line 1629
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1630
    .line 1631
    .line 1632
    move-result v5

    .line 1633
    if-eqz v5, :cond_4

    .line 1634
    .line 1635
    and-int v5, v13, v15

    .line 1636
    .line 1637
    int-to-long v9, v5

    .line 1638
    invoke-static {v1, v9, v10}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1639
    .line 1640
    .line 1641
    move-result-wide v9

    .line 1642
    iget-object v5, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1643
    .line 1644
    check-cast v5, Lkn3;

    .line 1645
    .line 1646
    invoke-virtual {v5, v14, v9, v10}, Lkn3;->f(IJ)V

    .line 1647
    .line 1648
    .line 1649
    goto/16 :goto_5

    .line 1650
    .line 1651
    :pswitch_40
    move v15, v9

    .line 1652
    move-object/from16 v16, v10

    .line 1653
    .line 1654
    const/16 v17, 0x0

    .line 1655
    .line 1656
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v5

    .line 1660
    if-eqz v5, :cond_4

    .line 1661
    .line 1662
    and-int v5, v13, v15

    .line 1663
    .line 1664
    int-to-long v9, v5

    .line 1665
    invoke-static {v1, v9, v10}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 1666
    .line 1667
    .line 1668
    move-result v5

    .line 1669
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1670
    .line 1671
    check-cast v9, Lkn3;

    .line 1672
    .line 1673
    shl-int/lit8 v10, v14, 0x3

    .line 1674
    .line 1675
    invoke-virtual {v9, v10}, Lkn3;->j(I)V

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v9, v5}, Lkn3;->i(I)V

    .line 1679
    .line 1680
    .line 1681
    goto/16 :goto_5

    .line 1682
    .line 1683
    :pswitch_41
    move v15, v9

    .line 1684
    move-object/from16 v16, v10

    .line 1685
    .line 1686
    const/16 v17, 0x0

    .line 1687
    .line 1688
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1689
    .line 1690
    .line 1691
    move-result v5

    .line 1692
    if-eqz v5, :cond_4

    .line 1693
    .line 1694
    and-int v5, v13, v15

    .line 1695
    .line 1696
    int-to-long v9, v5

    .line 1697
    invoke-static {v1, v9, v10}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1698
    .line 1699
    .line 1700
    move-result-wide v9

    .line 1701
    iget-object v5, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1702
    .line 1703
    check-cast v5, Lkn3;

    .line 1704
    .line 1705
    invoke-virtual {v5, v14, v9, v10}, Lkn3;->e(IJ)V

    .line 1706
    .line 1707
    .line 1708
    goto :goto_5

    .line 1709
    :pswitch_42
    move v15, v9

    .line 1710
    move-object/from16 v16, v10

    .line 1711
    .line 1712
    const/16 v17, 0x0

    .line 1713
    .line 1714
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1715
    .line 1716
    .line 1717
    move-result v5

    .line 1718
    if-eqz v5, :cond_4

    .line 1719
    .line 1720
    and-int v5, v13, v15

    .line 1721
    .line 1722
    int-to-long v9, v5

    .line 1723
    invoke-static {v1, v9, v10}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 1724
    .line 1725
    .line 1726
    move-result-wide v9

    .line 1727
    iget-object v5, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1728
    .line 1729
    check-cast v5, Lkn3;

    .line 1730
    .line 1731
    invoke-virtual {v5, v14, v9, v10}, Lkn3;->e(IJ)V

    .line 1732
    .line 1733
    .line 1734
    goto :goto_5

    .line 1735
    :pswitch_43
    move v15, v9

    .line 1736
    move-object/from16 v16, v10

    .line 1737
    .line 1738
    const/16 v17, 0x0

    .line 1739
    .line 1740
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1741
    .line 1742
    .line 1743
    move-result v5

    .line 1744
    if-eqz v5, :cond_4

    .line 1745
    .line 1746
    and-int v5, v13, v15

    .line 1747
    .line 1748
    int-to-long v9, v5

    .line 1749
    sget-object v5, Ltq3;->c:Lsq3;

    .line 1750
    .line 1751
    invoke-virtual {v5, v1, v9, v10}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 1752
    .line 1753
    .line 1754
    move-result v5

    .line 1755
    iget-object v9, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1756
    .line 1757
    check-cast v9, Lkn3;

    .line 1758
    .line 1759
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1760
    .line 1761
    .line 1762
    move-result v5

    .line 1763
    invoke-virtual {v9, v14, v5}, Lkn3;->d(II)V

    .line 1764
    .line 1765
    .line 1766
    goto :goto_5

    .line 1767
    :pswitch_44
    move v15, v9

    .line 1768
    move-object/from16 v16, v10

    .line 1769
    .line 1770
    const/16 v17, 0x0

    .line 1771
    .line 1772
    invoke-virtual {v0, v12, v1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 1773
    .line 1774
    .line 1775
    move-result v5

    .line 1776
    if-eqz v5, :cond_4

    .line 1777
    .line 1778
    and-int v5, v13, v15

    .line 1779
    .line 1780
    int-to-long v9, v5

    .line 1781
    sget-object v5, Ltq3;->c:Lsq3;

    .line 1782
    .line 1783
    invoke-virtual {v5, v1, v9, v10}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 1784
    .line 1785
    .line 1786
    move-result-wide v9

    .line 1787
    iget-object v5, v2, Lpi3;->a:Ljava/lang/Object;

    .line 1788
    .line 1789
    check-cast v5, Lkn3;

    .line 1790
    .line 1791
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1792
    .line 1793
    .line 1794
    move-result-wide v9

    .line 1795
    invoke-virtual {v5, v14, v9, v10}, Lkn3;->f(IJ)V

    .line 1796
    .line 1797
    .line 1798
    :cond_4
    :goto_5
    add-int/lit8 v12, v12, 0x3

    .line 1799
    .line 1800
    move v9, v15

    .line 1801
    move-object/from16 v10, v16

    .line 1802
    .line 1803
    goto/16 :goto_1

    .line 1804
    .line 1805
    :cond_5
    move-object/from16 v16, v10

    .line 1806
    .line 1807
    const/16 v17, 0x0

    .line 1808
    .line 1809
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v0

    .line 1816
    invoke-static {v0}, Lpm2;->m(Ljava/lang/Object;)V

    .line 1817
    .line 1818
    .line 1819
    throw v17

    .line 1820
    :cond_6
    move-object/from16 v16, v10

    .line 1821
    .line 1822
    const/16 v17, 0x0

    .line 1823
    .line 1824
    if-nez v16, :cond_7

    .line 1825
    .line 1826
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1827
    .line 1828
    .line 1829
    move-object v0, v1

    .line 1830
    check-cast v0, Leo3;

    .line 1831
    .line 1832
    iget-object v0, v0, Leo3;->zzc:Lmq3;

    .line 1833
    .line 1834
    invoke-virtual {v0, v2}, Lmq3;->b(Lpi3;)V

    .line 1835
    .line 1836
    .line 1837
    return-void

    .line 1838
    :cond_7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1839
    .line 1840
    .line 1841
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v0

    .line 1845
    if-eqz v0, :cond_8

    .line 1846
    .line 1847
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 1848
    .line 1849
    .line 1850
    return-void

    .line 1851
    :cond_8
    sget-object v0, Lar3;->a:[Lar3;

    .line 1852
    .line 1853
    throw v17

    .line 1854
    :cond_9
    move v15, v9

    .line 1855
    const/16 v17, 0x0

    .line 1856
    .line 1857
    if-eqz v11, :cond_a

    .line 1858
    .line 1859
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1860
    .line 1861
    .line 1862
    move-object v5, v1

    .line 1863
    check-cast v5, Lbo3;

    .line 1864
    .line 1865
    iget-object v5, v5, Lbo3;->zza:Lun3;

    .line 1866
    .line 1867
    iget-object v9, v5, Lun3;->a:Lhq3;

    .line 1868
    .line 1869
    invoke-virtual {v9}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1870
    .line 1871
    .line 1872
    move-result v9

    .line 1873
    if-nez v9, :cond_a

    .line 1874
    .line 1875
    invoke-virtual {v5}, Lun3;->c()Ljava/util/Iterator;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v5

    .line 1879
    check-cast v5, Lff2;

    .line 1880
    .line 1881
    invoke-virtual {v5}, Lff2;->next()Ljava/lang/Object;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v5

    .line 1885
    check-cast v5, Ljava/util/Map$Entry;

    .line 1886
    .line 1887
    goto :goto_6

    .line 1888
    :cond_a
    move-object/from16 v5, v17

    .line 1889
    .line 1890
    :goto_6
    array-length v9, v8

    .line 1891
    sget-object v10, Ltp3;->o:Lsun/misc/Unsafe;

    .line 1892
    .line 1893
    move v11, v7

    .line 1894
    move v13, v11

    .line 1895
    move v12, v15

    .line 1896
    :goto_7
    if-ge v11, v9, :cond_11

    .line 1897
    .line 1898
    invoke-virtual {v0, v11}, Ltp3;->g(I)I

    .line 1899
    .line 1900
    .line 1901
    move-result v14

    .line 1902
    move/from16 v16, v15

    .line 1903
    .line 1904
    aget v15, v8, v11

    .line 1905
    .line 1906
    invoke-static {v14}, Ltp3;->h(I)I

    .line 1907
    .line 1908
    .line 1909
    move-result v7

    .line 1910
    move/from16 v18, v6

    .line 1911
    .line 1912
    const/16 v6, 0x11

    .line 1913
    .line 1914
    if-gt v7, v6, :cond_c

    .line 1915
    .line 1916
    add-int/lit8 v6, v11, 0x2

    .line 1917
    .line 1918
    aget v6, v8, v6

    .line 1919
    .line 1920
    move-object/from16 v19, v3

    .line 1921
    .line 1922
    and-int v3, v6, v16

    .line 1923
    .line 1924
    if-eq v3, v12, :cond_b

    .line 1925
    .line 1926
    int-to-long v12, v3

    .line 1927
    invoke-virtual {v10, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1928
    .line 1929
    .line 1930
    move-result v13

    .line 1931
    move v12, v3

    .line 1932
    :cond_b
    ushr-int/lit8 v3, v6, 0x14

    .line 1933
    .line 1934
    shl-int v3, v18, v3

    .line 1935
    .line 1936
    goto :goto_8

    .line 1937
    :cond_c
    move-object/from16 v19, v3

    .line 1938
    .line 1939
    const/4 v3, 0x0

    .line 1940
    :goto_8
    if-nez v5, :cond_10

    .line 1941
    .line 1942
    and-int v6, v14, v16

    .line 1943
    .line 1944
    move/from16 v20, v3

    .line 1945
    .line 1946
    move-object v14, v4

    .line 1947
    int-to-long v3, v6

    .line 1948
    packed-switch v7, :pswitch_data_1

    .line 1949
    .line 1950
    .line 1951
    :cond_d
    :goto_9
    const/4 v7, 0x0

    .line 1952
    goto/16 :goto_d

    .line 1953
    .line 1954
    :pswitch_45
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 1955
    .line 1956
    .line 1957
    move-result v6

    .line 1958
    if-eqz v6, :cond_d

    .line 1959
    .line 1960
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v3

    .line 1964
    invoke-virtual {v0, v11}, Ltp3;->C(I)Lbq3;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v4

    .line 1968
    invoke-virtual {v2, v15, v3, v4}, Lpi3;->i(ILjava/lang/Object;Lbq3;)V

    .line 1969
    .line 1970
    .line 1971
    goto :goto_9

    .line 1972
    :pswitch_46
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 1973
    .line 1974
    .line 1975
    move-result v6

    .line 1976
    if-eqz v6, :cond_d

    .line 1977
    .line 1978
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 1979
    .line 1980
    .line 1981
    move-result-wide v3

    .line 1982
    invoke-virtual {v2, v15, v3, v4}, Lpi3;->g(IJ)V

    .line 1983
    .line 1984
    .line 1985
    goto :goto_9

    .line 1986
    :pswitch_47
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 1987
    .line 1988
    .line 1989
    move-result v6

    .line 1990
    if-eqz v6, :cond_d

    .line 1991
    .line 1992
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 1993
    .line 1994
    .line 1995
    move-result v3

    .line 1996
    invoke-virtual {v2, v15, v3}, Lpi3;->f(II)V

    .line 1997
    .line 1998
    .line 1999
    goto :goto_9

    .line 2000
    :pswitch_48
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2001
    .line 2002
    .line 2003
    move-result v6

    .line 2004
    if-eqz v6, :cond_d

    .line 2005
    .line 2006
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 2007
    .line 2008
    .line 2009
    move-result-wide v3

    .line 2010
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2011
    .line 2012
    check-cast v6, Lkn3;

    .line 2013
    .line 2014
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->f(IJ)V

    .line 2015
    .line 2016
    .line 2017
    goto :goto_9

    .line 2018
    :pswitch_49
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2019
    .line 2020
    .line 2021
    move-result v6

    .line 2022
    if-eqz v6, :cond_d

    .line 2023
    .line 2024
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 2025
    .line 2026
    .line 2027
    move-result v3

    .line 2028
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2029
    .line 2030
    check-cast v4, Lkn3;

    .line 2031
    .line 2032
    invoke-virtual {v4, v15, v3}, Lkn3;->d(II)V

    .line 2033
    .line 2034
    .line 2035
    goto :goto_9

    .line 2036
    :pswitch_4a
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2037
    .line 2038
    .line 2039
    move-result v6

    .line 2040
    if-eqz v6, :cond_d

    .line 2041
    .line 2042
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 2043
    .line 2044
    .line 2045
    move-result v3

    .line 2046
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2047
    .line 2048
    check-cast v4, Lkn3;

    .line 2049
    .line 2050
    shl-int/lit8 v6, v15, 0x3

    .line 2051
    .line 2052
    invoke-virtual {v4, v6}, Lkn3;->j(I)V

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual {v4, v3}, Lkn3;->i(I)V

    .line 2056
    .line 2057
    .line 2058
    goto :goto_9

    .line 2059
    :pswitch_4b
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2060
    .line 2061
    .line 2062
    move-result v6

    .line 2063
    if-eqz v6, :cond_d

    .line 2064
    .line 2065
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 2066
    .line 2067
    .line 2068
    move-result v3

    .line 2069
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2070
    .line 2071
    check-cast v4, Lkn3;

    .line 2072
    .line 2073
    invoke-virtual {v4, v15, v3}, Lkn3;->c(II)V

    .line 2074
    .line 2075
    .line 2076
    goto :goto_9

    .line 2077
    :pswitch_4c
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2078
    .line 2079
    .line 2080
    move-result v6

    .line 2081
    if-eqz v6, :cond_d

    .line 2082
    .line 2083
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v3

    .line 2087
    check-cast v3, Lcn3;

    .line 2088
    .line 2089
    invoke-virtual {v2, v15, v3}, Lpi3;->e(ILcn3;)V

    .line 2090
    .line 2091
    .line 2092
    goto/16 :goto_9

    .line 2093
    .line 2094
    :pswitch_4d
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2095
    .line 2096
    .line 2097
    move-result v6

    .line 2098
    if-eqz v6, :cond_d

    .line 2099
    .line 2100
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v3

    .line 2104
    invoke-virtual {v0, v11}, Ltp3;->C(I)Lbq3;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v4

    .line 2108
    invoke-virtual {v2, v15, v3, v4}, Lpi3;->h(ILjava/lang/Object;Lbq3;)V

    .line 2109
    .line 2110
    .line 2111
    goto/16 :goto_9

    .line 2112
    .line 2113
    :pswitch_4e
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v6

    .line 2117
    if-eqz v6, :cond_d

    .line 2118
    .line 2119
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v3

    .line 2123
    invoke-static {v15, v3, v2}, Ltp3;->r(ILjava/lang/Object;Lpi3;)V

    .line 2124
    .line 2125
    .line 2126
    goto/16 :goto_9

    .line 2127
    .line 2128
    :pswitch_4f
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2129
    .line 2130
    .line 2131
    move-result v6

    .line 2132
    if-eqz v6, :cond_d

    .line 2133
    .line 2134
    invoke-static {v1, v3, v4}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v3

    .line 2138
    check-cast v3, Ljava/lang/Boolean;

    .line 2139
    .line 2140
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2141
    .line 2142
    .line 2143
    move-result v3

    .line 2144
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2145
    .line 2146
    check-cast v4, Lkn3;

    .line 2147
    .line 2148
    shl-int/lit8 v6, v15, 0x3

    .line 2149
    .line 2150
    invoke-virtual {v4, v6}, Lkn3;->j(I)V

    .line 2151
    .line 2152
    .line 2153
    invoke-virtual {v4, v3}, Lkn3;->h(B)V

    .line 2154
    .line 2155
    .line 2156
    goto/16 :goto_9

    .line 2157
    .line 2158
    :pswitch_50
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2159
    .line 2160
    .line 2161
    move-result v6

    .line 2162
    if-eqz v6, :cond_d

    .line 2163
    .line 2164
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 2165
    .line 2166
    .line 2167
    move-result v3

    .line 2168
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2169
    .line 2170
    check-cast v4, Lkn3;

    .line 2171
    .line 2172
    invoke-virtual {v4, v15, v3}, Lkn3;->d(II)V

    .line 2173
    .line 2174
    .line 2175
    goto/16 :goto_9

    .line 2176
    .line 2177
    :pswitch_51
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2178
    .line 2179
    .line 2180
    move-result v6

    .line 2181
    if-eqz v6, :cond_d

    .line 2182
    .line 2183
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 2184
    .line 2185
    .line 2186
    move-result-wide v3

    .line 2187
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2188
    .line 2189
    check-cast v6, Lkn3;

    .line 2190
    .line 2191
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->f(IJ)V

    .line 2192
    .line 2193
    .line 2194
    goto/16 :goto_9

    .line 2195
    .line 2196
    :pswitch_52
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2197
    .line 2198
    .line 2199
    move-result v6

    .line 2200
    if-eqz v6, :cond_d

    .line 2201
    .line 2202
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 2203
    .line 2204
    .line 2205
    move-result v3

    .line 2206
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2207
    .line 2208
    check-cast v4, Lkn3;

    .line 2209
    .line 2210
    shl-int/lit8 v6, v15, 0x3

    .line 2211
    .line 2212
    invoke-virtual {v4, v6}, Lkn3;->j(I)V

    .line 2213
    .line 2214
    .line 2215
    invoke-virtual {v4, v3}, Lkn3;->i(I)V

    .line 2216
    .line 2217
    .line 2218
    goto/16 :goto_9

    .line 2219
    .line 2220
    :pswitch_53
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2221
    .line 2222
    .line 2223
    move-result v6

    .line 2224
    if-eqz v6, :cond_d

    .line 2225
    .line 2226
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 2227
    .line 2228
    .line 2229
    move-result-wide v3

    .line 2230
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2231
    .line 2232
    check-cast v6, Lkn3;

    .line 2233
    .line 2234
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->e(IJ)V

    .line 2235
    .line 2236
    .line 2237
    goto/16 :goto_9

    .line 2238
    .line 2239
    :pswitch_54
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2240
    .line 2241
    .line 2242
    move-result v6

    .line 2243
    if-eqz v6, :cond_d

    .line 2244
    .line 2245
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 2246
    .line 2247
    .line 2248
    move-result-wide v3

    .line 2249
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2250
    .line 2251
    check-cast v6, Lkn3;

    .line 2252
    .line 2253
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->e(IJ)V

    .line 2254
    .line 2255
    .line 2256
    goto/16 :goto_9

    .line 2257
    .line 2258
    :pswitch_55
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2259
    .line 2260
    .line 2261
    move-result v6

    .line 2262
    if-eqz v6, :cond_d

    .line 2263
    .line 2264
    invoke-static {v1, v3, v4}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v3

    .line 2268
    check-cast v3, Ljava/lang/Float;

    .line 2269
    .line 2270
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 2271
    .line 2272
    .line 2273
    move-result v3

    .line 2274
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2275
    .line 2276
    check-cast v4, Lkn3;

    .line 2277
    .line 2278
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2279
    .line 2280
    .line 2281
    move-result v3

    .line 2282
    invoke-virtual {v4, v15, v3}, Lkn3;->d(II)V

    .line 2283
    .line 2284
    .line 2285
    goto/16 :goto_9

    .line 2286
    .line 2287
    :pswitch_56
    invoke-virtual {v0, v15, v1, v11}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 2288
    .line 2289
    .line 2290
    move-result v6

    .line 2291
    if-eqz v6, :cond_d

    .line 2292
    .line 2293
    invoke-static {v1, v3, v4}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v3

    .line 2297
    check-cast v3, Ljava/lang/Double;

    .line 2298
    .line 2299
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 2300
    .line 2301
    .line 2302
    move-result-wide v3

    .line 2303
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2304
    .line 2305
    check-cast v6, Lkn3;

    .line 2306
    .line 2307
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 2308
    .line 2309
    .line 2310
    move-result-wide v3

    .line 2311
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->f(IJ)V

    .line 2312
    .line 2313
    .line 2314
    goto/16 :goto_9

    .line 2315
    .line 2316
    :pswitch_57
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v3

    .line 2320
    if-nez v3, :cond_e

    .line 2321
    .line 2322
    goto/16 :goto_9

    .line 2323
    .line 2324
    :cond_e
    invoke-virtual {v0, v11}, Ltp3;->D(I)Ljava/lang/Object;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v0

    .line 2328
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2329
    .line 2330
    .line 2331
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 2332
    .line 2333
    .line 2334
    return-void

    .line 2335
    :pswitch_58
    aget v6, v8, v11

    .line 2336
    .line 2337
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v3

    .line 2341
    check-cast v3, Ljava/util/List;

    .line 2342
    .line 2343
    invoke-virtual {v0, v11}, Ltp3;->C(I)Lbq3;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v4

    .line 2347
    sget-object v7, Lcq3;->a:Ljava/lang/Class;

    .line 2348
    .line 2349
    if-eqz v3, :cond_d

    .line 2350
    .line 2351
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 2352
    .line 2353
    .line 2354
    move-result v7

    .line 2355
    if-nez v7, :cond_d

    .line 2356
    .line 2357
    const/4 v7, 0x0

    .line 2358
    :goto_a
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2359
    .line 2360
    .line 2361
    move-result v15

    .line 2362
    if-ge v7, v15, :cond_d

    .line 2363
    .line 2364
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v15

    .line 2368
    invoke-virtual {v2, v6, v15, v4}, Lpi3;->i(ILjava/lang/Object;Lbq3;)V

    .line 2369
    .line 2370
    .line 2371
    add-int/lit8 v7, v7, 0x1

    .line 2372
    .line 2373
    goto :goto_a

    .line 2374
    :pswitch_59
    aget v6, v8, v11

    .line 2375
    .line 2376
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v3

    .line 2380
    check-cast v3, Ljava/util/List;

    .line 2381
    .line 2382
    move/from16 v7, v18

    .line 2383
    .line 2384
    invoke-static {v6, v3, v2, v7}, Lcq3;->t(ILjava/util/List;Lpi3;Z)V

    .line 2385
    .line 2386
    .line 2387
    goto/16 :goto_9

    .line 2388
    .line 2389
    :pswitch_5a
    move/from16 v7, v18

    .line 2390
    .line 2391
    aget v6, v8, v11

    .line 2392
    .line 2393
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v3

    .line 2397
    check-cast v3, Ljava/util/List;

    .line 2398
    .line 2399
    invoke-static {v6, v3, v2, v7}, Lcq3;->y(ILjava/util/List;Lpi3;Z)V

    .line 2400
    .line 2401
    .line 2402
    goto/16 :goto_9

    .line 2403
    .line 2404
    :pswitch_5b
    move/from16 v7, v18

    .line 2405
    .line 2406
    aget v6, v8, v11

    .line 2407
    .line 2408
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2409
    .line 2410
    .line 2411
    move-result-object v3

    .line 2412
    check-cast v3, Ljava/util/List;

    .line 2413
    .line 2414
    invoke-static {v6, v3, v2, v7}, Lcq3;->v(ILjava/util/List;Lpi3;Z)V

    .line 2415
    .line 2416
    .line 2417
    goto/16 :goto_9

    .line 2418
    .line 2419
    :pswitch_5c
    move/from16 v7, v18

    .line 2420
    .line 2421
    aget v6, v8, v11

    .line 2422
    .line 2423
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v3

    .line 2427
    check-cast v3, Ljava/util/List;

    .line 2428
    .line 2429
    invoke-static {v6, v3, v2, v7}, Lcq3;->A(ILjava/util/List;Lpi3;Z)V

    .line 2430
    .line 2431
    .line 2432
    goto/16 :goto_9

    .line 2433
    .line 2434
    :pswitch_5d
    move/from16 v7, v18

    .line 2435
    .line 2436
    aget v6, v8, v11

    .line 2437
    .line 2438
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v3

    .line 2442
    check-cast v3, Ljava/util/List;

    .line 2443
    .line 2444
    invoke-static {v6, v3, v2, v7}, Lcq3;->B(ILjava/util/List;Lpi3;Z)V

    .line 2445
    .line 2446
    .line 2447
    goto/16 :goto_9

    .line 2448
    .line 2449
    :pswitch_5e
    move/from16 v7, v18

    .line 2450
    .line 2451
    aget v6, v8, v11

    .line 2452
    .line 2453
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v3

    .line 2457
    check-cast v3, Ljava/util/List;

    .line 2458
    .line 2459
    invoke-static {v6, v3, v2, v7}, Lcq3;->x(ILjava/util/List;Lpi3;Z)V

    .line 2460
    .line 2461
    .line 2462
    goto/16 :goto_9

    .line 2463
    .line 2464
    :pswitch_5f
    move/from16 v7, v18

    .line 2465
    .line 2466
    aget v6, v8, v11

    .line 2467
    .line 2468
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v3

    .line 2472
    check-cast v3, Ljava/util/List;

    .line 2473
    .line 2474
    invoke-static {v6, v3, v2, v7}, Lcq3;->C(ILjava/util/List;Lpi3;Z)V

    .line 2475
    .line 2476
    .line 2477
    goto/16 :goto_9

    .line 2478
    .line 2479
    :pswitch_60
    move/from16 v7, v18

    .line 2480
    .line 2481
    aget v6, v8, v11

    .line 2482
    .line 2483
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v3

    .line 2487
    check-cast v3, Ljava/util/List;

    .line 2488
    .line 2489
    invoke-static {v6, v3, v2, v7}, Lcq3;->z(ILjava/util/List;Lpi3;Z)V

    .line 2490
    .line 2491
    .line 2492
    goto/16 :goto_9

    .line 2493
    .line 2494
    :pswitch_61
    move/from16 v7, v18

    .line 2495
    .line 2496
    aget v6, v8, v11

    .line 2497
    .line 2498
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v3

    .line 2502
    check-cast v3, Ljava/util/List;

    .line 2503
    .line 2504
    invoke-static {v6, v3, v2, v7}, Lcq3;->u(ILjava/util/List;Lpi3;Z)V

    .line 2505
    .line 2506
    .line 2507
    goto/16 :goto_9

    .line 2508
    .line 2509
    :pswitch_62
    move/from16 v7, v18

    .line 2510
    .line 2511
    aget v6, v8, v11

    .line 2512
    .line 2513
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2514
    .line 2515
    .line 2516
    move-result-object v3

    .line 2517
    check-cast v3, Ljava/util/List;

    .line 2518
    .line 2519
    invoke-static {v6, v3, v2, v7}, Lcq3;->w(ILjava/util/List;Lpi3;Z)V

    .line 2520
    .line 2521
    .line 2522
    goto/16 :goto_9

    .line 2523
    .line 2524
    :pswitch_63
    move/from16 v7, v18

    .line 2525
    .line 2526
    aget v6, v8, v11

    .line 2527
    .line 2528
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v3

    .line 2532
    check-cast v3, Ljava/util/List;

    .line 2533
    .line 2534
    invoke-static {v6, v3, v2, v7}, Lcq3;->s(ILjava/util/List;Lpi3;Z)V

    .line 2535
    .line 2536
    .line 2537
    goto/16 :goto_9

    .line 2538
    .line 2539
    :pswitch_64
    move/from16 v7, v18

    .line 2540
    .line 2541
    aget v6, v8, v11

    .line 2542
    .line 2543
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v3

    .line 2547
    check-cast v3, Ljava/util/List;

    .line 2548
    .line 2549
    invoke-static {v6, v3, v2, v7}, Lcq3;->r(ILjava/util/List;Lpi3;Z)V

    .line 2550
    .line 2551
    .line 2552
    goto/16 :goto_9

    .line 2553
    .line 2554
    :pswitch_65
    move/from16 v7, v18

    .line 2555
    .line 2556
    aget v6, v8, v11

    .line 2557
    .line 2558
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v3

    .line 2562
    check-cast v3, Ljava/util/List;

    .line 2563
    .line 2564
    invoke-static {v6, v3, v2, v7}, Lcq3;->q(ILjava/util/List;Lpi3;Z)V

    .line 2565
    .line 2566
    .line 2567
    goto/16 :goto_9

    .line 2568
    .line 2569
    :pswitch_66
    move/from16 v7, v18

    .line 2570
    .line 2571
    aget v6, v8, v11

    .line 2572
    .line 2573
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v3

    .line 2577
    check-cast v3, Ljava/util/List;

    .line 2578
    .line 2579
    invoke-static {v6, v3, v2, v7}, Lcq3;->p(ILjava/util/List;Lpi3;Z)V

    .line 2580
    .line 2581
    .line 2582
    goto/16 :goto_9

    .line 2583
    .line 2584
    :pswitch_67
    move/from16 v7, v18

    .line 2585
    .line 2586
    aget v6, v8, v11

    .line 2587
    .line 2588
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v3

    .line 2592
    check-cast v3, Ljava/util/List;

    .line 2593
    .line 2594
    const/4 v15, 0x0

    .line 2595
    invoke-static {v6, v3, v2, v15}, Lcq3;->t(ILjava/util/List;Lpi3;Z)V

    .line 2596
    .line 2597
    .line 2598
    :goto_b
    move v7, v15

    .line 2599
    goto/16 :goto_d

    .line 2600
    .line 2601
    :pswitch_68
    move/from16 v7, v18

    .line 2602
    .line 2603
    const/4 v15, 0x0

    .line 2604
    aget v6, v8, v11

    .line 2605
    .line 2606
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v3

    .line 2610
    check-cast v3, Ljava/util/List;

    .line 2611
    .line 2612
    invoke-static {v6, v3, v2, v15}, Lcq3;->y(ILjava/util/List;Lpi3;Z)V

    .line 2613
    .line 2614
    .line 2615
    goto :goto_b

    .line 2616
    :pswitch_69
    move/from16 v7, v18

    .line 2617
    .line 2618
    const/4 v15, 0x0

    .line 2619
    aget v6, v8, v11

    .line 2620
    .line 2621
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v3

    .line 2625
    check-cast v3, Ljava/util/List;

    .line 2626
    .line 2627
    invoke-static {v6, v3, v2, v15}, Lcq3;->v(ILjava/util/List;Lpi3;Z)V

    .line 2628
    .line 2629
    .line 2630
    goto :goto_b

    .line 2631
    :pswitch_6a
    move/from16 v7, v18

    .line 2632
    .line 2633
    const/4 v15, 0x0

    .line 2634
    aget v6, v8, v11

    .line 2635
    .line 2636
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v3

    .line 2640
    check-cast v3, Ljava/util/List;

    .line 2641
    .line 2642
    invoke-static {v6, v3, v2, v15}, Lcq3;->A(ILjava/util/List;Lpi3;Z)V

    .line 2643
    .line 2644
    .line 2645
    goto :goto_b

    .line 2646
    :pswitch_6b
    move/from16 v7, v18

    .line 2647
    .line 2648
    const/4 v15, 0x0

    .line 2649
    aget v6, v8, v11

    .line 2650
    .line 2651
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v3

    .line 2655
    check-cast v3, Ljava/util/List;

    .line 2656
    .line 2657
    invoke-static {v6, v3, v2, v15}, Lcq3;->B(ILjava/util/List;Lpi3;Z)V

    .line 2658
    .line 2659
    .line 2660
    goto :goto_b

    .line 2661
    :pswitch_6c
    move/from16 v7, v18

    .line 2662
    .line 2663
    const/4 v15, 0x0

    .line 2664
    aget v6, v8, v11

    .line 2665
    .line 2666
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v3

    .line 2670
    check-cast v3, Ljava/util/List;

    .line 2671
    .line 2672
    invoke-static {v6, v3, v2, v15}, Lcq3;->x(ILjava/util/List;Lpi3;Z)V

    .line 2673
    .line 2674
    .line 2675
    goto :goto_b

    .line 2676
    :pswitch_6d
    move/from16 v7, v18

    .line 2677
    .line 2678
    aget v6, v8, v11

    .line 2679
    .line 2680
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2681
    .line 2682
    .line 2683
    move-result-object v3

    .line 2684
    check-cast v3, Ljava/util/List;

    .line 2685
    .line 2686
    invoke-static {v6, v3, v2}, Lcq3;->E(ILjava/util/List;Lpi3;)V

    .line 2687
    .line 2688
    .line 2689
    goto/16 :goto_9

    .line 2690
    .line 2691
    :pswitch_6e
    move/from16 v7, v18

    .line 2692
    .line 2693
    aget v6, v8, v11

    .line 2694
    .line 2695
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2696
    .line 2697
    .line 2698
    move-result-object v3

    .line 2699
    check-cast v3, Ljava/util/List;

    .line 2700
    .line 2701
    invoke-virtual {v0, v11}, Ltp3;->C(I)Lbq3;

    .line 2702
    .line 2703
    .line 2704
    move-result-object v4

    .line 2705
    sget-object v15, Lcq3;->a:Ljava/lang/Class;

    .line 2706
    .line 2707
    if-eqz v3, :cond_d

    .line 2708
    .line 2709
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 2710
    .line 2711
    .line 2712
    move-result v15

    .line 2713
    if-nez v15, :cond_d

    .line 2714
    .line 2715
    const/4 v15, 0x0

    .line 2716
    :goto_c
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2717
    .line 2718
    .line 2719
    move-result v7

    .line 2720
    if-ge v15, v7, :cond_d

    .line 2721
    .line 2722
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v7

    .line 2726
    invoke-virtual {v2, v6, v7, v4}, Lpi3;->h(ILjava/lang/Object;Lbq3;)V

    .line 2727
    .line 2728
    .line 2729
    add-int/lit8 v15, v15, 0x1

    .line 2730
    .line 2731
    goto :goto_c

    .line 2732
    :pswitch_6f
    aget v6, v8, v11

    .line 2733
    .line 2734
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v3

    .line 2738
    check-cast v3, Ljava/util/List;

    .line 2739
    .line 2740
    invoke-static {v6, v3, v2}, Lcq3;->D(ILjava/util/List;Lpi3;)V

    .line 2741
    .line 2742
    .line 2743
    goto/16 :goto_9

    .line 2744
    .line 2745
    :pswitch_70
    aget v6, v8, v11

    .line 2746
    .line 2747
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2748
    .line 2749
    .line 2750
    move-result-object v3

    .line 2751
    check-cast v3, Ljava/util/List;

    .line 2752
    .line 2753
    const/4 v7, 0x0

    .line 2754
    invoke-static {v6, v3, v2, v7}, Lcq3;->C(ILjava/util/List;Lpi3;Z)V

    .line 2755
    .line 2756
    .line 2757
    goto/16 :goto_d

    .line 2758
    .line 2759
    :pswitch_71
    const/4 v7, 0x0

    .line 2760
    aget v6, v8, v11

    .line 2761
    .line 2762
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v3

    .line 2766
    check-cast v3, Ljava/util/List;

    .line 2767
    .line 2768
    invoke-static {v6, v3, v2, v7}, Lcq3;->z(ILjava/util/List;Lpi3;Z)V

    .line 2769
    .line 2770
    .line 2771
    goto/16 :goto_d

    .line 2772
    .line 2773
    :pswitch_72
    const/4 v7, 0x0

    .line 2774
    aget v6, v8, v11

    .line 2775
    .line 2776
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v3

    .line 2780
    check-cast v3, Ljava/util/List;

    .line 2781
    .line 2782
    invoke-static {v6, v3, v2, v7}, Lcq3;->u(ILjava/util/List;Lpi3;Z)V

    .line 2783
    .line 2784
    .line 2785
    goto/16 :goto_d

    .line 2786
    .line 2787
    :pswitch_73
    const/4 v7, 0x0

    .line 2788
    aget v6, v8, v11

    .line 2789
    .line 2790
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2791
    .line 2792
    .line 2793
    move-result-object v3

    .line 2794
    check-cast v3, Ljava/util/List;

    .line 2795
    .line 2796
    invoke-static {v6, v3, v2, v7}, Lcq3;->w(ILjava/util/List;Lpi3;Z)V

    .line 2797
    .line 2798
    .line 2799
    goto/16 :goto_d

    .line 2800
    .line 2801
    :pswitch_74
    const/4 v7, 0x0

    .line 2802
    aget v6, v8, v11

    .line 2803
    .line 2804
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v3

    .line 2808
    check-cast v3, Ljava/util/List;

    .line 2809
    .line 2810
    invoke-static {v6, v3, v2, v7}, Lcq3;->s(ILjava/util/List;Lpi3;Z)V

    .line 2811
    .line 2812
    .line 2813
    goto/16 :goto_d

    .line 2814
    .line 2815
    :pswitch_75
    const/4 v7, 0x0

    .line 2816
    aget v6, v8, v11

    .line 2817
    .line 2818
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v3

    .line 2822
    check-cast v3, Ljava/util/List;

    .line 2823
    .line 2824
    invoke-static {v6, v3, v2, v7}, Lcq3;->r(ILjava/util/List;Lpi3;Z)V

    .line 2825
    .line 2826
    .line 2827
    goto/16 :goto_d

    .line 2828
    .line 2829
    :pswitch_76
    const/4 v7, 0x0

    .line 2830
    aget v6, v8, v11

    .line 2831
    .line 2832
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v3

    .line 2836
    check-cast v3, Ljava/util/List;

    .line 2837
    .line 2838
    invoke-static {v6, v3, v2, v7}, Lcq3;->q(ILjava/util/List;Lpi3;Z)V

    .line 2839
    .line 2840
    .line 2841
    goto/16 :goto_d

    .line 2842
    .line 2843
    :pswitch_77
    const/4 v7, 0x0

    .line 2844
    aget v6, v8, v11

    .line 2845
    .line 2846
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2847
    .line 2848
    .line 2849
    move-result-object v3

    .line 2850
    check-cast v3, Ljava/util/List;

    .line 2851
    .line 2852
    invoke-static {v6, v3, v2, v7}, Lcq3;->p(ILjava/util/List;Lpi3;Z)V

    .line 2853
    .line 2854
    .line 2855
    goto/16 :goto_d

    .line 2856
    .line 2857
    :pswitch_78
    const/4 v7, 0x0

    .line 2858
    and-int v6, v13, v20

    .line 2859
    .line 2860
    if-eqz v6, :cond_f

    .line 2861
    .line 2862
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v3

    .line 2866
    invoke-virtual {v0, v11}, Ltp3;->C(I)Lbq3;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v4

    .line 2870
    invoke-virtual {v2, v15, v3, v4}, Lpi3;->i(ILjava/lang/Object;Lbq3;)V

    .line 2871
    .line 2872
    .line 2873
    goto/16 :goto_d

    .line 2874
    .line 2875
    :pswitch_79
    const/4 v7, 0x0

    .line 2876
    and-int v6, v13, v20

    .line 2877
    .line 2878
    if-eqz v6, :cond_f

    .line 2879
    .line 2880
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2881
    .line 2882
    .line 2883
    move-result-wide v3

    .line 2884
    invoke-virtual {v2, v15, v3, v4}, Lpi3;->g(IJ)V

    .line 2885
    .line 2886
    .line 2887
    goto/16 :goto_d

    .line 2888
    .line 2889
    :pswitch_7a
    const/4 v7, 0x0

    .line 2890
    and-int v6, v13, v20

    .line 2891
    .line 2892
    if-eqz v6, :cond_f

    .line 2893
    .line 2894
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2895
    .line 2896
    .line 2897
    move-result v3

    .line 2898
    invoke-virtual {v2, v15, v3}, Lpi3;->f(II)V

    .line 2899
    .line 2900
    .line 2901
    goto/16 :goto_d

    .line 2902
    .line 2903
    :pswitch_7b
    const/4 v7, 0x0

    .line 2904
    and-int v6, v13, v20

    .line 2905
    .line 2906
    if-eqz v6, :cond_f

    .line 2907
    .line 2908
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2909
    .line 2910
    .line 2911
    move-result-wide v3

    .line 2912
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2913
    .line 2914
    check-cast v6, Lkn3;

    .line 2915
    .line 2916
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->f(IJ)V

    .line 2917
    .line 2918
    .line 2919
    goto/16 :goto_d

    .line 2920
    .line 2921
    :pswitch_7c
    const/4 v7, 0x0

    .line 2922
    and-int v6, v13, v20

    .line 2923
    .line 2924
    if-eqz v6, :cond_f

    .line 2925
    .line 2926
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2927
    .line 2928
    .line 2929
    move-result v3

    .line 2930
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2931
    .line 2932
    check-cast v4, Lkn3;

    .line 2933
    .line 2934
    invoke-virtual {v4, v15, v3}, Lkn3;->d(II)V

    .line 2935
    .line 2936
    .line 2937
    goto/16 :goto_d

    .line 2938
    .line 2939
    :pswitch_7d
    const/4 v7, 0x0

    .line 2940
    and-int v6, v13, v20

    .line 2941
    .line 2942
    if-eqz v6, :cond_f

    .line 2943
    .line 2944
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2945
    .line 2946
    .line 2947
    move-result v3

    .line 2948
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2949
    .line 2950
    check-cast v4, Lkn3;

    .line 2951
    .line 2952
    shl-int/lit8 v6, v15, 0x3

    .line 2953
    .line 2954
    invoke-virtual {v4, v6}, Lkn3;->j(I)V

    .line 2955
    .line 2956
    .line 2957
    invoke-virtual {v4, v3}, Lkn3;->i(I)V

    .line 2958
    .line 2959
    .line 2960
    goto/16 :goto_d

    .line 2961
    .line 2962
    :pswitch_7e
    const/4 v7, 0x0

    .line 2963
    and-int v6, v13, v20

    .line 2964
    .line 2965
    if-eqz v6, :cond_f

    .line 2966
    .line 2967
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2968
    .line 2969
    .line 2970
    move-result v3

    .line 2971
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 2972
    .line 2973
    check-cast v4, Lkn3;

    .line 2974
    .line 2975
    invoke-virtual {v4, v15, v3}, Lkn3;->c(II)V

    .line 2976
    .line 2977
    .line 2978
    goto/16 :goto_d

    .line 2979
    .line 2980
    :pswitch_7f
    const/4 v7, 0x0

    .line 2981
    and-int v6, v13, v20

    .line 2982
    .line 2983
    if-eqz v6, :cond_f

    .line 2984
    .line 2985
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v3

    .line 2989
    check-cast v3, Lcn3;

    .line 2990
    .line 2991
    invoke-virtual {v2, v15, v3}, Lpi3;->e(ILcn3;)V

    .line 2992
    .line 2993
    .line 2994
    goto/16 :goto_d

    .line 2995
    .line 2996
    :pswitch_80
    const/4 v7, 0x0

    .line 2997
    and-int v6, v13, v20

    .line 2998
    .line 2999
    if-eqz v6, :cond_f

    .line 3000
    .line 3001
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 3002
    .line 3003
    .line 3004
    move-result-object v3

    .line 3005
    invoke-virtual {v0, v11}, Ltp3;->C(I)Lbq3;

    .line 3006
    .line 3007
    .line 3008
    move-result-object v4

    .line 3009
    invoke-virtual {v2, v15, v3, v4}, Lpi3;->h(ILjava/lang/Object;Lbq3;)V

    .line 3010
    .line 3011
    .line 3012
    goto/16 :goto_d

    .line 3013
    .line 3014
    :pswitch_81
    const/4 v7, 0x0

    .line 3015
    and-int v6, v13, v20

    .line 3016
    .line 3017
    if-eqz v6, :cond_f

    .line 3018
    .line 3019
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v3

    .line 3023
    invoke-static {v15, v3, v2}, Ltp3;->r(ILjava/lang/Object;Lpi3;)V

    .line 3024
    .line 3025
    .line 3026
    goto/16 :goto_d

    .line 3027
    .line 3028
    :pswitch_82
    const/4 v7, 0x0

    .line 3029
    and-int v6, v13, v20

    .line 3030
    .line 3031
    if-eqz v6, :cond_f

    .line 3032
    .line 3033
    sget-object v6, Ltq3;->c:Lsq3;

    .line 3034
    .line 3035
    invoke-virtual {v6, v1, v3, v4}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 3036
    .line 3037
    .line 3038
    move-result v3

    .line 3039
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3040
    .line 3041
    check-cast v4, Lkn3;

    .line 3042
    .line 3043
    shl-int/lit8 v6, v15, 0x3

    .line 3044
    .line 3045
    invoke-virtual {v4, v6}, Lkn3;->j(I)V

    .line 3046
    .line 3047
    .line 3048
    invoke-virtual {v4, v3}, Lkn3;->h(B)V

    .line 3049
    .line 3050
    .line 3051
    goto/16 :goto_d

    .line 3052
    .line 3053
    :pswitch_83
    const/4 v7, 0x0

    .line 3054
    and-int v6, v13, v20

    .line 3055
    .line 3056
    if-eqz v6, :cond_f

    .line 3057
    .line 3058
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 3059
    .line 3060
    .line 3061
    move-result v3

    .line 3062
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3063
    .line 3064
    check-cast v4, Lkn3;

    .line 3065
    .line 3066
    invoke-virtual {v4, v15, v3}, Lkn3;->d(II)V

    .line 3067
    .line 3068
    .line 3069
    goto/16 :goto_d

    .line 3070
    .line 3071
    :pswitch_84
    const/4 v7, 0x0

    .line 3072
    and-int v6, v13, v20

    .line 3073
    .line 3074
    if-eqz v6, :cond_f

    .line 3075
    .line 3076
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 3077
    .line 3078
    .line 3079
    move-result-wide v3

    .line 3080
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3081
    .line 3082
    check-cast v6, Lkn3;

    .line 3083
    .line 3084
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->f(IJ)V

    .line 3085
    .line 3086
    .line 3087
    goto :goto_d

    .line 3088
    :pswitch_85
    const/4 v7, 0x0

    .line 3089
    and-int v6, v13, v20

    .line 3090
    .line 3091
    if-eqz v6, :cond_f

    .line 3092
    .line 3093
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 3094
    .line 3095
    .line 3096
    move-result v3

    .line 3097
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3098
    .line 3099
    check-cast v4, Lkn3;

    .line 3100
    .line 3101
    shl-int/lit8 v6, v15, 0x3

    .line 3102
    .line 3103
    invoke-virtual {v4, v6}, Lkn3;->j(I)V

    .line 3104
    .line 3105
    .line 3106
    invoke-virtual {v4, v3}, Lkn3;->i(I)V

    .line 3107
    .line 3108
    .line 3109
    goto :goto_d

    .line 3110
    :pswitch_86
    const/4 v7, 0x0

    .line 3111
    and-int v6, v13, v20

    .line 3112
    .line 3113
    if-eqz v6, :cond_f

    .line 3114
    .line 3115
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 3116
    .line 3117
    .line 3118
    move-result-wide v3

    .line 3119
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3120
    .line 3121
    check-cast v6, Lkn3;

    .line 3122
    .line 3123
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->e(IJ)V

    .line 3124
    .line 3125
    .line 3126
    goto :goto_d

    .line 3127
    :pswitch_87
    const/4 v7, 0x0

    .line 3128
    and-int v6, v13, v20

    .line 3129
    .line 3130
    if-eqz v6, :cond_f

    .line 3131
    .line 3132
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 3133
    .line 3134
    .line 3135
    move-result-wide v3

    .line 3136
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3137
    .line 3138
    check-cast v6, Lkn3;

    .line 3139
    .line 3140
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->e(IJ)V

    .line 3141
    .line 3142
    .line 3143
    goto :goto_d

    .line 3144
    :pswitch_88
    const/4 v7, 0x0

    .line 3145
    and-int v6, v13, v20

    .line 3146
    .line 3147
    if-eqz v6, :cond_f

    .line 3148
    .line 3149
    sget-object v6, Ltq3;->c:Lsq3;

    .line 3150
    .line 3151
    invoke-virtual {v6, v1, v3, v4}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 3152
    .line 3153
    .line 3154
    move-result v3

    .line 3155
    iget-object v4, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3156
    .line 3157
    check-cast v4, Lkn3;

    .line 3158
    .line 3159
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 3160
    .line 3161
    .line 3162
    move-result v3

    .line 3163
    invoke-virtual {v4, v15, v3}, Lkn3;->d(II)V

    .line 3164
    .line 3165
    .line 3166
    goto :goto_d

    .line 3167
    :pswitch_89
    const/4 v7, 0x0

    .line 3168
    and-int v6, v13, v20

    .line 3169
    .line 3170
    if-eqz v6, :cond_f

    .line 3171
    .line 3172
    sget-object v6, Ltq3;->c:Lsq3;

    .line 3173
    .line 3174
    invoke-virtual {v6, v1, v3, v4}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 3175
    .line 3176
    .line 3177
    move-result-wide v3

    .line 3178
    iget-object v6, v2, Lpi3;->a:Ljava/lang/Object;

    .line 3179
    .line 3180
    check-cast v6, Lkn3;

    .line 3181
    .line 3182
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 3183
    .line 3184
    .line 3185
    move-result-wide v3

    .line 3186
    invoke-virtual {v6, v15, v3, v4}, Lkn3;->f(IJ)V

    .line 3187
    .line 3188
    .line 3189
    :cond_f
    :goto_d
    add-int/lit8 v11, v11, 0x3

    .line 3190
    .line 3191
    move-object v4, v14

    .line 3192
    move/from16 v15, v16

    .line 3193
    .line 3194
    move-object/from16 v3, v19

    .line 3195
    .line 3196
    const/4 v6, 0x1

    .line 3197
    goto/16 :goto_7

    .line 3198
    .line 3199
    :cond_10
    move-object v14, v4

    .line 3200
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3201
    .line 3202
    .line 3203
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 3204
    .line 3205
    .line 3206
    move-result-object v0

    .line 3207
    invoke-static {v0}, Lpm2;->m(Ljava/lang/Object;)V

    .line 3208
    .line 3209
    .line 3210
    throw v17

    .line 3211
    :cond_11
    move-object/from16 v19, v3

    .line 3212
    .line 3213
    move-object v14, v4

    .line 3214
    if-nez v5, :cond_12

    .line 3215
    .line 3216
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3217
    .line 3218
    .line 3219
    move-object v0, v1

    .line 3220
    check-cast v0, Leo3;

    .line 3221
    .line 3222
    iget-object v0, v0, Leo3;->zzc:Lmq3;

    .line 3223
    .line 3224
    invoke-virtual {v0, v2}, Lmq3;->b(Lpi3;)V

    .line 3225
    .line 3226
    .line 3227
    return-void

    .line 3228
    :cond_12
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3229
    .line 3230
    .line 3231
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 3232
    .line 3233
    .line 3234
    move-result-object v0

    .line 3235
    if-eqz v0, :cond_13

    .line 3236
    .line 3237
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 3238
    .line 3239
    .line 3240
    return-void

    .line 3241
    :cond_13
    sget-object v0, Lar3;->a:[Lar3;

    .line 3242
    .line 3243
    throw v17

    .line 3244
    nop

    .line 3245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 5

    .line 1
    sget-object v0, Ltp3;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Ltp3;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v3, v1

    .line 12
    invoke-virtual {v0, p1, v3, v4, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 p3, p3, 0x2

    .line 16
    .line 17
    iget-object p0, p0, Ltp3;->a:[I

    .line 18
    .line 19
    aget p0, p0, p3

    .line 20
    .line 21
    and-int/2addr p0, v2

    .line 22
    int-to-long p3, p0

    .line 23
    invoke-static {p1, p3, p4, p2}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final g(I)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object p0, p0, Ltp3;->a:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method public final m(Leo3;Leo3;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ne p1, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final n(ILjava/lang/Object;)Z
    .locals 7

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, Ltp3;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v4, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ltp3;->g(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-int p1, p0, v1

    .line 27
    .line 28
    invoke-static {p0}, Ltp3;->h(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-long v0, p1

    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    packed-switch p0, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lf42;->e()V

    .line 39
    .line 40
    .line 41
    return v5

    .line 42
    :pswitch_0
    invoke-static {p2, v0, v1}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :pswitch_1
    invoke-static {p2, v0, v1}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    cmp-long p0, p0, v2

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :pswitch_2
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :pswitch_3
    invoke-static {p2, v0, v1}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    cmp-long p0, p0, v2

    .line 73
    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :pswitch_4
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :pswitch_5
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :pswitch_6
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :pswitch_7
    sget-object p0, Lcn3;->b:Lan3;

    .line 103
    .line 104
    invoke-static {p2, v0, v1}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, Lan3;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-nez p0, :cond_3

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :pswitch_8
    invoke-static {p2, v0, v1}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-eqz p0, :cond_3

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :pswitch_9
    invoke-static {p2, v0, v1}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    instance-of p1, p0, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz p1, :cond_0

    .line 131
    .line 132
    check-cast p0, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-nez p0, :cond_3

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_0
    instance-of p1, p0, Lcn3;

    .line 143
    .line 144
    if-eqz p1, :cond_1

    .line 145
    .line 146
    sget-object p1, Lcn3;->b:Lan3;

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Lan3;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_3

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_1
    invoke-static {}, Lf42;->e()V

    .line 156
    .line 157
    .line 158
    return v5

    .line 159
    :pswitch_a
    sget-object p0, Ltq3;->c:Lsq3;

    .line 160
    .line 161
    invoke-virtual {p0, p2, v0, v1}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    return p0

    .line 166
    :pswitch_b
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-eqz p0, :cond_3

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :pswitch_c
    invoke-static {p2, v0, v1}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 174
    .line 175
    .line 176
    move-result-wide p0

    .line 177
    cmp-long p0, p0, v2

    .line 178
    .line 179
    if-eqz p0, :cond_3

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :pswitch_d
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-eqz p0, :cond_3

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :pswitch_e
    invoke-static {p2, v0, v1}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 190
    .line 191
    .line 192
    move-result-wide p0

    .line 193
    cmp-long p0, p0, v2

    .line 194
    .line 195
    if-eqz p0, :cond_3

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :pswitch_f
    invoke-static {p2, v0, v1}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 199
    .line 200
    .line 201
    move-result-wide p0

    .line 202
    cmp-long p0, p0, v2

    .line 203
    .line 204
    if-eqz p0, :cond_3

    .line 205
    .line 206
    goto :goto_0

    .line 207
    :pswitch_10
    sget-object p0, Ltq3;->c:Lsq3;

    .line 208
    .line 209
    invoke-virtual {p0, p2, v0, v1}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    if-eqz p0, :cond_3

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :pswitch_11
    sget-object p0, Ltq3;->c:Lsq3;

    .line 221
    .line 222
    invoke-virtual {p0, p2, v0, v1}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 223
    .line 224
    .line 225
    move-result-wide p0

    .line 226
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 227
    .line 228
    .line 229
    move-result-wide p0

    .line 230
    cmp-long p0, p0, v2

    .line 231
    .line 232
    if-eqz p0, :cond_3

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_2
    ushr-int/lit8 p0, v0, 0x14

    .line 236
    .line 237
    shl-int p0, v6, p0

    .line 238
    .line 239
    invoke-static {p2, v2, v3}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    and-int/2addr p0, p1

    .line 244
    if-eqz p0, :cond_3

    .line 245
    .line 246
    :goto_0
    return v6

    .line 247
    :cond_3
    return v5

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public final o(ILjava/lang/Object;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object p0, p0, Ltp3;->a:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    const p1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, p0

    .line 11
    int-to-long v0, p1

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p0, p0, 0x14

    .line 21
    .line 22
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v2, 0x1

    .line 27
    shl-int p0, v2, p0

    .line 28
    .line 29
    or-int/2addr p0, p1

    .line 30
    invoke-static {p2, v0, v1, p0}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final p(ILjava/lang/Object;I)Z
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object p0, p0, Ltp3;->a:[I

    .line 4
    .line 5
    aget p0, p0, p3

    .line 6
    .line 7
    const p3, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p0, p3

    .line 11
    int-to-long v0, p0

    .line 12
    invoke-static {p2, v0, v1}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final q(II)I
    .locals 5

    .line 1
    iget-object p0, p0, Ltp3;->a:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    :goto_0
    if-gt p2, v0, :cond_2

    .line 9
    .line 10
    add-int v2, v0, p2

    .line 11
    .line 12
    ushr-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    mul-int/lit8 v3, v2, 0x3

    .line 15
    .line 16
    aget v4, p0, v3

    .line 17
    .line 18
    if-ne p1, v4, :cond_0

    .line 19
    .line 20
    return v3

    .line 21
    :cond_0
    if-ge p1, v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v0, v2, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 p2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return v1
.end method

.method public final t(Ljava/lang/Object;[BIIILym3;)I
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    move/from16 v3, p4

    move/from16 v15, p5

    move-object/from16 v5, p6

    .line 1
    invoke-static {v2}, Ltp3;->j(Ljava/lang/Object;)V

    sget-object v10, Ltp3;->o:Lsun/misc/Unsafe;

    move/from16 v4, p3

    const/4 v6, -0x1

    const/4 v7, 0x0

    const v8, 0xfffff

    const/4 v9, 0x0

    const/4 v14, 0x0

    :goto_0
    const v16, 0xfffff

    :goto_1
    iget-object v13, v0, Ltp3;->a:[I

    if-ge v4, v3, :cond_1f

    add-int/lit8 v14, v4, 0x1

    .line 2
    aget-byte v4, v1, v4

    if-gez v4, :cond_0

    .line 3
    invoke-static {v4, v1, v14, v5}, Lw11;->d0(I[BILym3;)I

    move-result v14

    iget v4, v5, Lym3;->a:I

    :cond_0
    move/from16 v29, v14

    move v14, v4

    move/from16 v4, v29

    ushr-int/lit8 v12, v14, 0x3

    iget v11, v0, Ltp3;->d:I

    const/16 p3, 0x3

    iget v1, v0, Ltp3;->c:I

    if-le v12, v6, :cond_2

    div-int/lit8 v7, v7, 0x3

    if-lt v12, v1, :cond_1

    if-gt v12, v11, :cond_1

    .line 4
    invoke-virtual {v0, v12, v7}, Ltp3;->q(II)I

    move-result v1

    goto :goto_2

    :cond_1
    const/4 v1, -0x1

    :goto_2
    const/4 v11, 0x0

    :goto_3
    const/4 v6, -0x1

    goto :goto_4

    :cond_2
    if-lt v12, v1, :cond_3

    if-gt v12, v11, :cond_3

    const/4 v11, 0x0

    .line 5
    invoke-virtual {v0, v12, v11}, Ltp3;->q(II)I

    move-result v1

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    const/4 v1, -0x1

    goto :goto_3

    :goto_4
    if-ne v1, v6, :cond_4

    move/from16 v20, v6

    move/from16 v17, v9

    move-object/from16 v28, v10

    move v7, v11

    move/from16 v19, v7

    move v6, v12

    move-object/from16 v18, v13

    move-object v9, v0

    move-object v11, v2

    move v2, v4

    move v0, v14

    goto/16 :goto_1a

    :cond_4
    and-int/lit8 v7, v14, 0x7

    add-int/lit8 v17, v1, 0x1

    .line 6
    aget v6, v13, v17

    move/from16 v17, v11

    invoke-static {v6}, Ltp3;->h(I)I

    move-result v11

    and-int v3, v6, v16

    move/from16 v19, v4

    int-to-long v3, v3

    move-wide/from16 v20, v3

    const/16 v3, 0x11

    if-gt v11, v3, :cond_13

    add-int/lit8 v3, v1, 0x2

    .line 7
    aget v3, v13, v3

    ushr-int/lit8 v22, v3, 0x14

    const/4 v4, 0x1

    shl-int v22, v4, v22

    and-int v3, v3, v16

    move/from16 v23, v12

    if-eq v3, v8, :cond_6

    move/from16 v12, v16

    move-object/from16 v16, v13

    if-eq v8, v12, :cond_5

    int-to-long v12, v8

    .line 8
    invoke-virtual {v10, v2, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    int-to-long v8, v3

    .line 9
    invoke-virtual {v10, v2, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v12, v3

    move v13, v8

    goto :goto_5

    :cond_6
    move-object/from16 v16, v13

    move v12, v8

    move v13, v9

    :goto_5
    const/4 v3, 0x5

    packed-switch v11, :pswitch_data_0

    move/from16 v8, p3

    if-ne v7, v8, :cond_7

    .line 10
    invoke-virtual {v0, v2, v1}, Ltp3;->F(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    shl-int/lit8 v3, v23, 0x3

    or-int/lit8 v8, v3, 0x4

    .line 11
    invoke-virtual {v0, v1}, Ltp3;->C(I)Lbq3;

    move-result-object v3

    .line 12
    check-cast v3, Ltp3;

    move/from16 v7, p4

    move-object v9, v5

    move/from16 v6, v19

    const/16 v18, -0x1

    move-object/from16 v5, p2

    .line 13
    invoke-virtual/range {v3 .. v9}, Ltp3;->t(Ljava/lang/Object;[BIIILym3;)I

    move-result v3

    move-object v8, v5

    iput-object v4, v9, Lym3;->c:Ljava/lang/Object;

    .line 14
    invoke-virtual {v0, v1, v2, v4}, Ltp3;->G(ILjava/lang/Object;Ljava/lang/Object;)V

    or-int v4, v13, v22

    move v7, v1

    move-object v1, v8

    move-object v5, v9

    move v8, v12

    move/from16 v6, v23

    const v16, 0xfffff

    move v9, v4

    move v4, v3

    :goto_6
    move/from16 v3, p4

    goto/16 :goto_1

    :cond_7
    const/16 v18, -0x1

    move-object/from16 v9, p2

    move-object v8, v5

    move-object v7, v10

    move/from16 v11, v19

    move v10, v1

    :goto_7
    move-object v1, v2

    goto/16 :goto_15

    :pswitch_0
    move-object/from16 v8, p2

    move-object v9, v5

    move/from16 v3, v19

    const/16 v18, -0x1

    if-nez v7, :cond_8

    .line 15
    invoke-static {v8, v3, v9}, Lw11;->e0([BILym3;)I

    move-result v7

    iget-wide v5, v9, Lym3;->b:J

    const-wide/16 v24, 0x1

    move/from16 p3, v4

    move-wide/from16 v26, v5

    and-long v4, v26, v24

    ushr-long v24, v26, p3

    neg-long v3, v4

    xor-long v5, v24, v3

    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-wide/from16 v3, v20

    .line 16
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v11, v2

    or-int v2, v13, v22

    move/from16 v3, p4

    move v4, v7

    move-object v5, v9

    move v7, v10

    move/from16 v6, v23

    const v16, 0xfffff

    move-object v10, v1

    move v9, v2

    move-object v1, v8

    :goto_8
    move-object v2, v11

    :goto_9
    move v8, v12

    goto/16 :goto_1

    :cond_8
    move-object/from16 v29, v10

    move v10, v1

    move-object/from16 v1, v29

    move-object v7, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v1

    move-object v1, v2

    :goto_a
    move v11, v3

    goto/16 :goto_15

    :pswitch_1
    move-object/from16 p3, v10

    move v10, v1

    move-object/from16 v1, p3

    move-object/from16 v8, p2

    move-object v11, v2

    move/from16 p3, v4

    move-object v9, v5

    move/from16 v3, v19

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-nez v7, :cond_9

    .line 17
    invoke-static {v8, v3, v9}, Lw11;->Z([BILym3;)I

    move-result v2

    iget v3, v9, Lym3;->a:I

    and-int/lit8 v6, v3, 0x1

    ushr-int/lit8 v3, v3, 0x1

    neg-int v6, v6

    xor-int/2addr v3, v6

    .line 18
    invoke-virtual {v1, v11, v4, v5, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_b
    or-int v3, v13, v22

    move v4, v2

    move-object v5, v9

    move v7, v10

    move-object v2, v11

    move/from16 v6, v23

    const v16, 0xfffff

    move-object v10, v1

    move v9, v3

    move-object v1, v8

    :goto_c
    move v8, v12

    goto/16 :goto_6

    :cond_9
    move-object v7, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v1

    :goto_d
    move-object v1, v11

    goto :goto_a

    :pswitch_2
    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-object/from16 v8, p2

    move-object v11, v2

    move-object v9, v5

    move/from16 v3, v19

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-nez v7, :cond_9

    .line 19
    invoke-static {v8, v3, v9}, Lw11;->Z([BILym3;)I

    move-result v2

    iget v3, v9, Lym3;->a:I

    .line 20
    invoke-virtual {v0, v10}, Ltp3;->E(I)Lqm3;

    move-result-object v6

    if-eqz v6, :cond_b

    .line 21
    invoke-virtual {v6, v3}, Lqm3;->a(I)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_e

    .line 22
    :cond_a
    invoke-static {v11}, Ltp3;->s(Ljava/lang/Object;)Lmq3;

    move-result-object v4

    int-to-long v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v4, v14, v3}, Lmq3;->d(ILjava/lang/Object;)V

    move/from16 v3, p4

    move v4, v2

    move-object v5, v9

    move v7, v10

    move-object v2, v11

    move v9, v13

    move/from16 v6, v23

    const v16, 0xfffff

    move-object v10, v1

    move-object v1, v8

    goto/16 :goto_9

    .line 23
    :cond_b
    :goto_e
    invoke-virtual {v1, v11, v4, v5, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_b

    :pswitch_3
    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-object/from16 v8, p2

    move-object v11, v2

    move-object v9, v5

    move/from16 v3, v19

    move-wide/from16 v4, v20

    const/4 v2, 0x2

    const/16 v18, -0x1

    if-ne v7, v2, :cond_9

    .line 24
    invoke-static {v8, v3, v9}, Lw11;->k0([BILym3;)I

    move-result v2

    iget-object v3, v9, Lym3;->c:Ljava/lang/Object;

    .line 25
    invoke-virtual {v1, v11, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_b

    :pswitch_4
    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-object/from16 v8, p2

    move-object v11, v2

    move-object v9, v5

    move/from16 v3, v19

    const/4 v2, 0x2

    const/16 v18, -0x1

    if-ne v7, v2, :cond_c

    move-object v2, v1

    .line 26
    invoke-virtual {v0, v11, v10}, Ltp3;->F(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v2

    .line 27
    invoke-virtual {v0, v10}, Ltp3;->C(I)Lbq3;

    move-result-object v2

    move-object v5, v4

    move v4, v3

    move-object v3, v8

    move-object v8, v5

    move/from16 v5, p4

    move-object v6, v9

    .line 28
    invoke-static/range {v1 .. v6}, Lw11;->l0(Ljava/lang/Object;Lbq3;[BIILym3;)I

    move-result v4

    move-object v2, v1

    move-object v9, v3

    move-object v1, v6

    .line 29
    invoke-virtual {v0, v10, v11, v2}, Ltp3;->G(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_f
    or-int v2, v13, v22

    move/from16 v3, p4

    move-object v5, v1

    move-object v1, v9

    move v7, v10

    move/from16 v6, v23

    const v16, 0xfffff

    move v9, v2

    move-object v10, v8

    goto/16 :goto_8

    :cond_c
    move-object/from16 v29, v8

    move-object v8, v1

    move-object v1, v9

    move-object/from16 v9, v29

    :cond_d
    move-object v7, v8

    move-object v8, v1

    goto/16 :goto_d

    :pswitch_5
    move-object/from16 v9, p2

    move-object v11, v2

    move-object v8, v10

    move/from16 v3, v19

    const/4 v2, 0x2

    const/16 v18, -0x1

    move v10, v1

    move-object v1, v5

    move-wide/from16 v4, v20

    if-ne v7, v2, :cond_d

    const/high16 v2, 0x20000000

    and-int/2addr v2, v6

    if-nez v2, :cond_e

    .line 30
    invoke-static {v9, v3, v1}, Lw11;->i0([BILym3;)I

    move-result v2

    goto :goto_10

    .line 31
    :cond_e
    invoke-static {v9, v3, v1}, Lw11;->j0([BILym3;)I

    move-result v2

    .line 32
    :goto_10
    iget-object v3, v1, Lym3;->c:Ljava/lang/Object;

    .line 33
    invoke-virtual {v8, v11, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_11
    or-int v3, v13, v22

    move-object v5, v1

    move v4, v2

    move-object v1, v9

    move v7, v10

    move-object v2, v11

    move/from16 v6, v23

    const v16, 0xfffff

    move v9, v3

    move-object v10, v8

    goto/16 :goto_c

    :pswitch_6
    move-object/from16 v9, p2

    move-object v11, v2

    move/from16 p3, v4

    move-object v8, v10

    move/from16 v3, v19

    const/16 v18, -0x1

    move v10, v1

    move-object v1, v5

    move-wide/from16 v4, v20

    if-nez v7, :cond_d

    .line 34
    invoke-static {v9, v3, v1}, Lw11;->e0([BILym3;)I

    move-result v2

    iget-wide v6, v1, Lym3;->b:J

    const-wide/16 v19, 0x0

    cmp-long v3, v6, v19

    if-eqz v3, :cond_f

    move/from16 v3, p3

    goto :goto_12

    :cond_f
    move/from16 v3, v17

    .line 35
    :goto_12
    sget-object v6, Ltq3;->c:Lsq3;

    invoke-virtual {v6, v11, v4, v5, v3}, Lsq3;->s(Ljava/lang/Object;JZ)V

    goto :goto_11

    :pswitch_7
    move-object/from16 v9, p2

    move-object v11, v2

    move-object v8, v10

    move/from16 v2, v19

    const/16 v18, -0x1

    move v10, v1

    move-object v1, v5

    move-wide/from16 v4, v20

    if-ne v7, v3, :cond_10

    .line 36
    invoke-static {v9, v2}, Lw11;->g0([BI)I

    move-result v3

    invoke-virtual {v8, v11, v4, v5, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v4, v2, 0x4

    goto/16 :goto_f

    :cond_10
    move-object v7, v8

    move-object v8, v1

    move-object v1, v11

    move v11, v2

    goto/16 :goto_15

    :pswitch_8
    move-object/from16 v9, p2

    move-object v11, v2

    move v3, v4

    move-object v8, v10

    move/from16 v2, v19

    const/16 v18, -0x1

    move v10, v1

    move-object v1, v5

    move-wide/from16 v4, v20

    if-ne v7, v3, :cond_11

    move-wide v3, v4

    .line 37
    invoke-static {v9, v2}, Lw11;->h0([BI)J

    move-result-wide v5

    move-object/from16 v29, v8

    move-object v8, v1

    move-object/from16 v1, v29

    move-object/from16 v29, v11

    move v11, v2

    move-object/from16 v2, v29

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v4, v11, 0x8

    :goto_13
    or-int v3, v13, v22

    :goto_14
    move-object v5, v8

    move v7, v10

    move v8, v12

    move/from16 v6, v23

    const v16, 0xfffff

    move-object v10, v1

    move-object v1, v9

    move v9, v3

    goto/16 :goto_6

    :cond_11
    move-object/from16 v29, v8

    move-object v8, v1

    move-object/from16 v1, v29

    move-object/from16 v29, v11

    move v11, v2

    move-object/from16 v2, v29

    :cond_12
    move-object v7, v1

    goto/16 :goto_7

    :pswitch_9
    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-object/from16 v9, p2

    move-object v8, v5

    move/from16 v11, v19

    move-wide/from16 v3, v20

    const/16 v18, -0x1

    if-nez v7, :cond_12

    .line 38
    invoke-static {v9, v11, v8}, Lw11;->Z([BILym3;)I

    move-result v5

    iget v6, v8, Lym3;->a:I

    .line 39
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v3, v13, v22

    move v4, v5

    goto :goto_14

    :pswitch_a
    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-object/from16 v9, p2

    move-object v8, v5

    move/from16 v11, v19

    move-wide/from16 v3, v20

    const/16 v18, -0x1

    if-nez v7, :cond_12

    .line 40
    invoke-static {v9, v11, v8}, Lw11;->e0([BILym3;)I

    move-result v7

    iget-wide v5, v8, Lym3;->b:J

    .line 41
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v3, v13, v22

    move v4, v7

    goto :goto_14

    :pswitch_b
    move-object v4, v10

    move v10, v1

    move-object v1, v4

    move-object/from16 v9, p2

    move-object v8, v5

    move/from16 v11, v19

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-ne v7, v3, :cond_12

    .line 42
    invoke-static {v9, v11}, Lw11;->g0([BI)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    .line 43
    sget-object v6, Ltq3;->c:Lsq3;

    invoke-virtual {v6, v2, v4, v5, v3}, Lsq3;->w(Ljava/lang/Object;JF)V

    add-int/lit8 v4, v11, 0x4

    goto :goto_13

    :pswitch_c
    move-object v3, v10

    move v10, v1

    move-object v1, v3

    move-object/from16 v9, p2

    move v3, v4

    move-object v8, v5

    move/from16 v11, v19

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    if-ne v7, v3, :cond_12

    .line 44
    invoke-static {v9, v11}, Lw11;->h0([BI)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v6

    move-object v3, v1

    .line 45
    sget-object v1, Ltq3;->c:Lsq3;

    move-wide/from16 v29, v6

    move-object v7, v3

    move-wide v3, v4

    move-wide/from16 v5, v29

    invoke-virtual/range {v1 .. v6}, Lsq3;->z(Ljava/lang/Object;JD)V

    move-object v1, v2

    add-int/lit8 v4, v11, 0x8

    or-int v2, v13, v22

    move v3, v2

    move-object v2, v1

    move-object v1, v9

    move v9, v3

    move v3, v10

    move-object v10, v7

    move v7, v3

    move/from16 v3, p4

    move-object v5, v8

    move v8, v12

    move/from16 v6, v23

    goto/16 :goto_0

    :goto_15
    move-object v9, v0

    move-object/from16 v28, v7

    move-object v5, v8

    move v7, v10

    move v2, v11

    move v8, v12

    move v0, v14

    move/from16 v19, v17

    move/from16 v20, v18

    move/from16 v6, v23

    move-object v11, v1

    move/from16 v17, v13

    move-object/from16 v18, v16

    goto/16 :goto_1a

    :cond_13
    move/from16 v23, v12

    move-object/from16 v16, v13

    move/from16 v3, v19

    move-wide/from16 v4, v20

    const/16 v18, -0x1

    move-object v12, v10

    move v10, v1

    move-object v1, v2

    const/16 v2, 0x1b

    if-ne v11, v2, :cond_17

    const/4 v2, 0x2

    if-ne v7, v2, :cond_16

    .line 46
    invoke-virtual {v12, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lro3;

    .line 47
    move-object v6, v2

    check-cast v6, Lvm3;

    .line 48
    iget-boolean v6, v6, Lvm3;->a:Z

    if-nez v6, :cond_15

    .line 49
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_14

    const/16 v6, 0xa

    goto :goto_16

    :cond_14
    add-int/2addr v6, v6

    .line 50
    :goto_16
    invoke-interface {v2, v6}, Lro3;->I(I)Lro3;

    move-result-object v2

    .line 51
    invoke-virtual {v12, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_15
    move-object v6, v2

    .line 52
    invoke-virtual {v0, v10}, Ltp3;->C(I)Lbq3;

    move-result-object v1

    move/from16 v5, p4

    move-object/from16 v7, p6

    move v4, v3

    move v2, v14

    move-object/from16 v3, p2

    .line 53
    invoke-static/range {v1 .. v7}, Lw11;->m0(Lbq3;I[BIILro3;Lym3;)I

    move-result v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    move v7, v10

    move-object v10, v12

    move/from16 v6, v23

    const v16, 0xfffff

    move-object/from16 v2, p1

    goto/16 :goto_1

    :cond_16
    move-object/from16 v2, p1

    move-object v1, v0

    move-object/from16 v28, v12

    move v0, v14

    move/from16 v19, v17

    move/from16 v20, v18

    move/from16 v17, v9

    move-object/from16 v18, v16

    move/from16 v16, v8

    move v8, v10

    goto/16 :goto_18

    :cond_17
    move v2, v14

    const/16 v1, 0x31

    if-gt v11, v1, :cond_19

    move v1, v8

    move v13, v9

    move v8, v10

    int-to-long v9, v6

    move-object/from16 v14, p6

    move-object/from16 v28, v12

    move/from16 v19, v17

    move/from16 v20, v18

    move/from16 v6, v23

    move/from16 v17, v13

    move-object/from16 v18, v16

    move/from16 v16, v1

    move-wide v12, v4

    move-object/from16 v1, p1

    move/from16 v4, p4

    move v5, v2

    move-object/from16 v2, p2

    .line 54
    invoke-virtual/range {v0 .. v14}, Ltp3;->z(Ljava/lang/Object;[BIIIIIIJIJLym3;)I

    move-result v7

    move-object v2, v1

    move-object v1, v0

    move v0, v5

    if-eq v7, v3, :cond_18

    move/from16 v3, p4

    move-object/from16 v5, p6

    move v14, v0

    move-object v0, v1

    move v4, v7

    move v7, v8

    move/from16 v8, v16

    move/from16 v9, v17

    move/from16 v6, v23

    move-object/from16 v10, v28

    const v16, 0xfffff

    move-object/from16 v1, p2

    goto/16 :goto_1

    :cond_18
    move-object/from16 v5, p6

    move-object v9, v1

    move-object v11, v2

    move v2, v7

    :goto_17
    move v7, v8

    move/from16 v8, v16

    move/from16 v6, v23

    goto/16 :goto_1a

    :cond_19
    move-object v1, v0

    move v0, v2

    move-object/from16 v28, v12

    move/from16 v19, v17

    move/from16 v20, v18

    move-object/from16 v2, p1

    move/from16 v17, v9

    move v9, v11

    move-object/from16 v18, v16

    move/from16 v16, v8

    move v8, v10

    const/16 v10, 0x32

    if-ne v9, v10, :cond_1b

    const/4 v10, 0x2

    if-eq v7, v10, :cond_1a

    :goto_18
    move-object/from16 v5, p6

    move-object v9, v1

    move-object v11, v2

    move v2, v3

    goto :goto_17

    .line 55
    :cond_1a
    invoke-virtual {v1, v2, v8, v4, v5}, Ltp3;->A(Ljava/lang/Object;IJ)V

    const/4 v0, 0x0

    throw v0

    :cond_1b
    move-object/from16 v13, p6

    move-wide v10, v4

    move v12, v8

    move/from16 v4, p4

    move v5, v0

    move-object v0, v1

    move-object v1, v2

    move v8, v6

    move/from16 v6, v23

    move-object/from16 v2, p2

    .line 56
    invoke-virtual/range {v0 .. v13}, Ltp3;->B(Ljava/lang/Object;[BIIIIIIIJILym3;)I

    move-result v7

    move-object v9, v0

    move-object v11, v1

    move v0, v5

    move v8, v12

    move-object v5, v13

    if-eq v7, v3, :cond_1c

    move-object/from16 v1, p2

    move/from16 v3, p4

    move v14, v0

    move v4, v7

    move v7, v8

    move-object v0, v9

    move-object v2, v11

    move/from16 v8, v16

    :goto_19
    move/from16 v9, v17

    move-object/from16 v10, v28

    goto/16 :goto_0

    :cond_1c
    move v2, v7

    move v7, v8

    move/from16 v8, v16

    :goto_1a
    if-ne v0, v15, :cond_1d

    if-eqz v15, :cond_1d

    move/from16 v3, p4

    move v14, v0

    move v4, v2

    :goto_1b
    move/from16 v0, v17

    const v12, 0xfffff

    goto :goto_1e

    .line 57
    :cond_1d
    iget-boolean v1, v9, Ltp3;->f:Z

    if-eqz v1, :cond_1e

    iget-object v1, v5, Lym3;->d:Lon3;

    sget-object v3, Lon3;->c:Lon3;

    if-eq v1, v3, :cond_1e

    iget-object v3, v9, Ltp3;->e:Ltm3;

    .line 58
    invoke-virtual {v1, v3, v6}, Lon3;->b(Ltm3;I)V

    .line 59
    invoke-static {v11}, Ltp3;->s(Ljava/lang/Object;)Lmq3;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    .line 60
    invoke-static/range {v0 .. v5}, Lw11;->n0(I[BIILmq3;Lym3;)I

    move-result v2

    :goto_1c
    move v4, v2

    goto :goto_1d

    .line 61
    :cond_1e
    invoke-static {v11}, Ltp3;->s(Ljava/lang/Object;)Lmq3;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    .line 62
    invoke-static/range {v0 .. v5}, Lw11;->n0(I[BIILmq3;Lym3;)I

    move-result v2

    goto :goto_1c

    :goto_1d
    move-object/from16 v1, p2

    move-object/from16 v5, p6

    move v14, v0

    move-object v0, v9

    move-object v2, v11

    goto :goto_19

    :cond_1f
    move-object v11, v2

    move/from16 v16, v8

    move/from16 v17, v9

    move-object/from16 v28, v10

    move-object/from16 v18, v13

    const/16 v19, 0x0

    move-object v9, v0

    goto :goto_1b

    :goto_1e
    if-eq v8, v12, :cond_20

    int-to-long v1, v8

    move-object/from16 v7, v28

    .line 63
    invoke-virtual {v7, v11, v1, v2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_20
    iget v0, v9, Ltp3;->i:I

    :goto_1f
    iget v1, v9, Ltp3;->j:I

    if-ge v0, v1, :cond_23

    iget-object v1, v9, Ltp3;->h:[I

    .line 64
    aget v1, v1, v0

    .line 65
    aget v2, v18, v1

    .line 66
    invoke-virtual {v9, v1}, Ltp3;->g(I)I

    move-result v2

    and-int/2addr v2, v12

    int-to-long v5, v2

    .line 67
    invoke-static {v11, v5, v6}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_22

    .line 68
    invoke-virtual {v9, v1}, Ltp3;->E(I)Lqm3;

    move-result-object v5

    if-nez v5, :cond_21

    goto :goto_20

    .line 69
    :cond_21
    check-cast v2, Llp3;

    .line 70
    invoke-virtual {v9, v1}, Ltp3;->D(I)Ljava/lang/Object;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/sentry/u2;->g()V

    return v19

    :cond_22
    :goto_20
    add-int/lit8 v0, v0, 0x1

    goto :goto_1f

    :cond_23
    if-nez v15, :cond_25

    if-ne v4, v3, :cond_24

    goto :goto_21

    .line 72
    :cond_24
    invoke-static {}, Luo3;->c()Luo3;

    move-result-object v0

    throw v0

    :cond_25
    if-gt v4, v3, :cond_26

    if-ne v14, v15, :cond_26

    :goto_21
    return v4

    .line 73
    :cond_26
    invoke-static {}, Luo3;->c()Luo3;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p3, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p3}, Ltp3;->g(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    sget-object v1, Ltp3;->o:Lsun/misc/Unsafe;

    .line 17
    .line 18
    int-to-long v2, v0

    .line 19
    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p3}, Ltp3;->C(I)Lbq3;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p0, p3, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p2}, Lbq3;->zza()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p2, v4, v0}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p3, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-nez p3, :cond_3

    .line 68
    .line 69
    invoke-interface {p2}, Lbq3;->zza()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-interface {p2, p3, p0}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1, v2, v3, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p0, p3

    .line 80
    :cond_3
    invoke-interface {p2, p0, v0}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    iget-object p0, p0, Ltp3;->a:[I

    .line 85
    .line 86
    aget p0, p0, p3

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    add-int/lit8 p2, p2, 0x26

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    add-int/2addr p2, p3

    .line 107
    invoke-static {p2, p1, p0}, Lpk3;->e(ILjava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Ltp3;->a:[I

    .line 2
    .line 3
    aget v1, v0, p3

    .line 4
    .line 5
    invoke-virtual {p0, v1, p2, p3}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p3}, Ltp3;->g(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    sget-object v4, Ltp3;->o:Lsun/misc/Unsafe;

    .line 21
    .line 22
    int-to-long v5, v2

    .line 23
    invoke-virtual {v4, p2, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, p3}, Ltp3;->C(I)Lbq3;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p0, v1, p1, p3}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    invoke-static {v2}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, p1, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p2}, Lbq3;->zza()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p2, p0, v2}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p1, v5, v6, p0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    add-int/lit8 p3, p3, 0x2

    .line 60
    .line 61
    aget p0, v0, p3

    .line 62
    .line 63
    and-int/2addr p0, v3

    .line 64
    int-to-long p2, p0

    .line 65
    invoke-static {p1, p2, p3, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {v4, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-nez p3, :cond_3

    .line 78
    .line 79
    invoke-interface {p2}, Lbq3;->zza()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-interface {p2, p3, p0}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, p1, v5, v6, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object p0, p3

    .line 90
    :cond_3
    invoke-interface {p2, p0, v2}, Lbq3;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    aget p0, v0, p3

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    add-int/lit8 p2, p2, 0x26

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    add-int/2addr p2, p3

    .line 115
    invoke-static {p2, p1, p0}, Lpk3;->e(ILjava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final y(Leo3;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Ltp3;->o:Lsun/misc/Unsafe;

    .line 6
    .line 7
    const v4, 0xfffff

    .line 8
    .line 9
    .line 10
    move v7, v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    :goto_0
    iget-object v9, v0, Ltp3;->a:[I

    .line 15
    .line 16
    array-length v10, v9

    .line 17
    if-ge v5, v10, :cond_f

    .line 18
    .line 19
    invoke-virtual {v0, v5}, Ltp3;->g(I)I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    aget v11, v9, v5

    .line 24
    .line 25
    invoke-static {v10}, Ltp3;->h(I)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    const/16 v13, 0x11

    .line 30
    .line 31
    const/4 v14, 0x1

    .line 32
    if-gt v12, v13, :cond_1

    .line 33
    .line 34
    add-int/lit8 v13, v5, 0x2

    .line 35
    .line 36
    aget v9, v9, v13

    .line 37
    .line 38
    and-int v13, v9, v4

    .line 39
    .line 40
    ushr-int/lit8 v9, v9, 0x14

    .line 41
    .line 42
    if-eq v13, v7, :cond_0

    .line 43
    .line 44
    int-to-long v7, v13

    .line 45
    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    move v7, v13

    .line 50
    :cond_0
    shl-int v9, v14, v9

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v9, 0x0

    .line 54
    :goto_1
    and-int/2addr v10, v4

    .line 55
    const/4 v13, 0x0

    .line 56
    int-to-long v3, v10

    .line 57
    const/16 v15, 0x3f

    .line 58
    .line 59
    const/4 v10, 0x4

    .line 60
    move/from16 v16, v13

    .line 61
    .line 62
    const/16 v13, 0x8

    .line 63
    .line 64
    packed-switch v12, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    goto/16 :goto_10

    .line 68
    .line 69
    :pswitch_0
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_e

    .line 74
    .line 75
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ltm3;

    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ltp3;->C(I)Lbq3;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v11, v3, v4}, Lkn3;->a(ILtm3;Lbq3;)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :goto_2
    add-int/2addr v6, v3

    .line 90
    goto/16 :goto_10

    .line 91
    .line 92
    :pswitch_1
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_e

    .line 97
    .line 98
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    shl-int/lit8 v9, v11, 0x3

    .line 103
    .line 104
    add-long v10, v3, v3

    .line 105
    .line 106
    shr-long/2addr v3, v15

    .line 107
    invoke-static {v9}, Lkn3;->p(I)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    xor-long/2addr v3, v10

    .line 112
    invoke-static {v3, v4}, Lkn3;->q(J)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    :goto_3
    add-int/2addr v3, v9

    .line 117
    goto :goto_2

    .line 118
    :pswitch_2
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_e

    .line 123
    .line 124
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    shl-int/lit8 v4, v11, 0x3

    .line 129
    .line 130
    add-int v9, v3, v3

    .line 131
    .line 132
    shr-int/lit8 v3, v3, 0x1f

    .line 133
    .line 134
    invoke-static {v4}, Lkn3;->p(I)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    :goto_4
    xor-int/2addr v3, v9

    .line 139
    invoke-static {v3, v4, v6}, Lpm2;->q(III)I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    goto/16 :goto_10

    .line 144
    .line 145
    :pswitch_3
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_e

    .line 150
    .line 151
    :goto_5
    shl-int/lit8 v3, v11, 0x3

    .line 152
    .line 153
    invoke-static {v3, v13, v6}, Lpm2;->q(III)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    goto/16 :goto_10

    .line 158
    .line 159
    :pswitch_4
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_e

    .line 164
    .line 165
    :goto_6
    shl-int/lit8 v3, v11, 0x3

    .line 166
    .line 167
    invoke-static {v3, v10, v6}, Lpm2;->q(III)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    goto/16 :goto_10

    .line 172
    .line 173
    :pswitch_5
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-eqz v9, :cond_e

    .line 178
    .line 179
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    shl-int/lit8 v4, v11, 0x3

    .line 184
    .line 185
    invoke-static {v3}, Lkn3;->o(I)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    :goto_7
    invoke-static {v4, v3, v6}, Lpm2;->q(III)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    goto/16 :goto_10

    .line 194
    .line 195
    :pswitch_6
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    if-eqz v9, :cond_e

    .line 200
    .line 201
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    shl-int/lit8 v4, v11, 0x3

    .line 206
    .line 207
    invoke-static {v3}, Lkn3;->p(I)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    goto :goto_7

    .line 212
    :pswitch_7
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_e

    .line 217
    .line 218
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lcn3;

    .line 223
    .line 224
    shl-int/lit8 v4, v11, 0x3

    .line 225
    .line 226
    sget-object v9, Lkn3;->e:Ljava/util/logging/Logger;

    .line 227
    .line 228
    invoke-virtual {v3}, Lcn3;->c()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-static {v3}, Lkn3;->p(I)I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    :goto_8
    add-int/2addr v9, v3

    .line 237
    invoke-static {v4, v9, v6}, Lpm2;->q(III)I

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    goto/16 :goto_10

    .line 242
    .line 243
    :pswitch_8
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    if-eqz v9, :cond_e

    .line 248
    .line 249
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v0, v5}, Ltp3;->C(I)Lbq3;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-static {v11, v3, v4}, Lcq3;->i(ILjava/lang/Object;Lbq3;)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    goto/16 :goto_2

    .line 262
    .line 263
    :pswitch_9
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    if-eqz v9, :cond_e

    .line 268
    .line 269
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    instance-of v4, v3, Lcn3;

    .line 274
    .line 275
    if-eqz v4, :cond_2

    .line 276
    .line 277
    check-cast v3, Lcn3;

    .line 278
    .line 279
    shl-int/lit8 v4, v11, 0x3

    .line 280
    .line 281
    sget-object v9, Lkn3;->e:Ljava/util/logging/Logger;

    .line 282
    .line 283
    invoke-virtual {v3}, Lcn3;->c()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    invoke-static {v3}, Lkn3;->p(I)I

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    goto :goto_8

    .line 292
    :cond_2
    check-cast v3, Ljava/lang/String;

    .line 293
    .line 294
    shl-int/lit8 v4, v11, 0x3

    .line 295
    .line 296
    invoke-static {v3}, Lkn3;->r(Ljava/lang/String;)I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    goto :goto_7

    .line 301
    :pswitch_a
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_e

    .line 306
    .line 307
    :goto_9
    shl-int/lit8 v3, v11, 0x3

    .line 308
    .line 309
    invoke-static {v3, v14, v6}, Lpm2;->q(III)I

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    goto/16 :goto_10

    .line 314
    .line 315
    :pswitch_b
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-eqz v3, :cond_e

    .line 320
    .line 321
    goto/16 :goto_6

    .line 322
    .line 323
    :pswitch_c
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_e

    .line 328
    .line 329
    goto/16 :goto_5

    .line 330
    .line 331
    :pswitch_d
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-eqz v9, :cond_e

    .line 336
    .line 337
    invoke-static {v1, v3, v4}, Ltp3;->k(Ljava/lang/Object;J)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    shl-int/lit8 v4, v11, 0x3

    .line 342
    .line 343
    invoke-static {v3}, Lkn3;->o(I)I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    goto/16 :goto_7

    .line 348
    .line 349
    :pswitch_e
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    if-eqz v9, :cond_e

    .line 354
    .line 355
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 356
    .line 357
    .line 358
    move-result-wide v3

    .line 359
    shl-int/lit8 v9, v11, 0x3

    .line 360
    .line 361
    invoke-static {v3, v4}, Lkn3;->q(J)I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    :goto_a
    invoke-static {v9, v3, v6}, Lpm2;->q(III)I

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    goto/16 :goto_10

    .line 370
    .line 371
    :pswitch_f
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    if-eqz v9, :cond_e

    .line 376
    .line 377
    invoke-static {v1, v3, v4}, Ltp3;->l(Ljava/lang/Object;J)J

    .line 378
    .line 379
    .line 380
    move-result-wide v3

    .line 381
    shl-int/lit8 v9, v11, 0x3

    .line 382
    .line 383
    invoke-static {v3, v4}, Lkn3;->q(J)I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    goto :goto_a

    .line 388
    :pswitch_10
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_e

    .line 393
    .line 394
    goto/16 :goto_6

    .line 395
    .line 396
    :pswitch_11
    invoke-virtual {v0, v11, v1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-eqz v3, :cond_e

    .line 401
    .line 402
    goto/16 :goto_5

    .line 403
    .line 404
    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v0, v5}, Ltp3;->D(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-static {v3, v4}, Lnp3;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_10

    .line 416
    .line 417
    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    check-cast v3, Ljava/util/List;

    .line 422
    .line 423
    invoke-virtual {v0, v5}, Ltp3;->C(I)Lbq3;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    sget-object v9, Lcq3;->a:Ljava/lang/Class;

    .line 428
    .line 429
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    if-eqz v9, :cond_3

    .line 434
    .line 435
    move/from16 v10, v16

    .line 436
    .line 437
    move v12, v10

    .line 438
    :goto_b
    if-ge v10, v9, :cond_4

    .line 439
    .line 440
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v13

    .line 444
    check-cast v13, Ltm3;

    .line 445
    .line 446
    invoke-static {v11, v13, v4}, Lkn3;->a(ILtm3;Lbq3;)I

    .line 447
    .line 448
    .line 449
    move-result v13

    .line 450
    add-int/2addr v12, v13

    .line 451
    add-int/lit8 v10, v10, 0x1

    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_3
    move/from16 v12, v16

    .line 455
    .line 456
    :cond_4
    add-int/2addr v6, v12

    .line 457
    goto/16 :goto_10

    .line 458
    .line 459
    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    check-cast v3, Ljava/util/List;

    .line 464
    .line 465
    invoke-static {v3}, Lcq3;->H(Ljava/util/List;)I

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-lez v3, :cond_e

    .line 470
    .line 471
    shl-int/lit8 v4, v11, 0x3

    .line 472
    .line 473
    invoke-static {v3}, Lkn3;->p(I)I

    .line 474
    .line 475
    .line 476
    move-result v9

    .line 477
    :goto_c
    invoke-static {v4, v9, v3, v6}, Lpm2;->o(IIII)I

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    goto/16 :goto_10

    .line 482
    .line 483
    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Ljava/util/List;

    .line 488
    .line 489
    invoke-static {v3}, Lcq3;->c(Ljava/util/List;)I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    if-lez v3, :cond_e

    .line 494
    .line 495
    shl-int/lit8 v4, v11, 0x3

    .line 496
    .line 497
    invoke-static {v3}, Lkn3;->p(I)I

    .line 498
    .line 499
    .line 500
    move-result v9

    .line 501
    goto :goto_c

    .line 502
    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    check-cast v3, Ljava/util/List;

    .line 507
    .line 508
    invoke-static {v3}, Lcq3;->f(Ljava/util/List;)I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    if-lez v3, :cond_e

    .line 513
    .line 514
    shl-int/lit8 v4, v11, 0x3

    .line 515
    .line 516
    invoke-static {v3}, Lkn3;->p(I)I

    .line 517
    .line 518
    .line 519
    move-result v9

    .line 520
    goto :goto_c

    .line 521
    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    check-cast v3, Ljava/util/List;

    .line 526
    .line 527
    invoke-static {v3}, Lcq3;->d(Ljava/util/List;)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-lez v3, :cond_e

    .line 532
    .line 533
    shl-int/lit8 v4, v11, 0x3

    .line 534
    .line 535
    invoke-static {v3}, Lkn3;->p(I)I

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    goto :goto_c

    .line 540
    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    check-cast v3, Ljava/util/List;

    .line 545
    .line 546
    invoke-static {v3}, Lcq3;->I(Ljava/util/List;)I

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    if-lez v3, :cond_e

    .line 551
    .line 552
    shl-int/lit8 v4, v11, 0x3

    .line 553
    .line 554
    invoke-static {v3}, Lkn3;->p(I)I

    .line 555
    .line 556
    .line 557
    move-result v9

    .line 558
    goto :goto_c

    .line 559
    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    check-cast v3, Ljava/util/List;

    .line 564
    .line 565
    invoke-static {v3}, Lcq3;->b(Ljava/util/List;)I

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-lez v3, :cond_e

    .line 570
    .line 571
    shl-int/lit8 v4, v11, 0x3

    .line 572
    .line 573
    invoke-static {v3}, Lkn3;->p(I)I

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    goto :goto_c

    .line 578
    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    check-cast v3, Ljava/util/List;

    .line 583
    .line 584
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 585
    .line 586
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-lez v3, :cond_e

    .line 591
    .line 592
    shl-int/lit8 v4, v11, 0x3

    .line 593
    .line 594
    invoke-static {v3}, Lkn3;->p(I)I

    .line 595
    .line 596
    .line 597
    move-result v9

    .line 598
    goto :goto_c

    .line 599
    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    check-cast v3, Ljava/util/List;

    .line 604
    .line 605
    invoke-static {v3}, Lcq3;->d(Ljava/util/List;)I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-lez v3, :cond_e

    .line 610
    .line 611
    shl-int/lit8 v4, v11, 0x3

    .line 612
    .line 613
    invoke-static {v3}, Lkn3;->p(I)I

    .line 614
    .line 615
    .line 616
    move-result v9

    .line 617
    goto/16 :goto_c

    .line 618
    .line 619
    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    check-cast v3, Ljava/util/List;

    .line 624
    .line 625
    invoke-static {v3}, Lcq3;->f(Ljava/util/List;)I

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-lez v3, :cond_e

    .line 630
    .line 631
    shl-int/lit8 v4, v11, 0x3

    .line 632
    .line 633
    invoke-static {v3}, Lkn3;->p(I)I

    .line 634
    .line 635
    .line 636
    move-result v9

    .line 637
    goto/16 :goto_c

    .line 638
    .line 639
    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v3

    .line 643
    check-cast v3, Ljava/util/List;

    .line 644
    .line 645
    invoke-static {v3}, Lcq3;->a(Ljava/util/List;)I

    .line 646
    .line 647
    .line 648
    move-result v3

    .line 649
    if-lez v3, :cond_e

    .line 650
    .line 651
    shl-int/lit8 v4, v11, 0x3

    .line 652
    .line 653
    invoke-static {v3}, Lkn3;->p(I)I

    .line 654
    .line 655
    .line 656
    move-result v9

    .line 657
    goto/16 :goto_c

    .line 658
    .line 659
    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    check-cast v3, Ljava/util/List;

    .line 664
    .line 665
    invoke-static {v3}, Lcq3;->G(Ljava/util/List;)I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    if-lez v3, :cond_e

    .line 670
    .line 671
    shl-int/lit8 v4, v11, 0x3

    .line 672
    .line 673
    invoke-static {v3}, Lkn3;->p(I)I

    .line 674
    .line 675
    .line 676
    move-result v9

    .line 677
    goto/16 :goto_c

    .line 678
    .line 679
    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    check-cast v3, Ljava/util/List;

    .line 684
    .line 685
    invoke-static {v3}, Lcq3;->F(Ljava/util/List;)I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    if-lez v3, :cond_e

    .line 690
    .line 691
    shl-int/lit8 v4, v11, 0x3

    .line 692
    .line 693
    invoke-static {v3}, Lkn3;->p(I)I

    .line 694
    .line 695
    .line 696
    move-result v9

    .line 697
    goto/16 :goto_c

    .line 698
    .line 699
    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    check-cast v3, Ljava/util/List;

    .line 704
    .line 705
    invoke-static {v3}, Lcq3;->d(Ljava/util/List;)I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    if-lez v3, :cond_e

    .line 710
    .line 711
    shl-int/lit8 v4, v11, 0x3

    .line 712
    .line 713
    invoke-static {v3}, Lkn3;->p(I)I

    .line 714
    .line 715
    .line 716
    move-result v9

    .line 717
    goto/16 :goto_c

    .line 718
    .line 719
    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    check-cast v3, Ljava/util/List;

    .line 724
    .line 725
    invoke-static {v3}, Lcq3;->f(Ljava/util/List;)I

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-lez v3, :cond_e

    .line 730
    .line 731
    shl-int/lit8 v4, v11, 0x3

    .line 732
    .line 733
    invoke-static {v3}, Lkn3;->p(I)I

    .line 734
    .line 735
    .line 736
    move-result v9

    .line 737
    goto/16 :goto_c

    .line 738
    .line 739
    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v3

    .line 743
    check-cast v3, Ljava/util/List;

    .line 744
    .line 745
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 746
    .line 747
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 748
    .line 749
    .line 750
    move-result v4

    .line 751
    if-nez v4, :cond_5

    .line 752
    .line 753
    :goto_d
    move/from16 v3, v16

    .line 754
    .line 755
    goto/16 :goto_2

    .line 756
    .line 757
    :cond_5
    invoke-static {v3}, Lcq3;->H(Ljava/util/List;)I

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    :goto_e
    shl-int/lit8 v9, v11, 0x3

    .line 762
    .line 763
    invoke-static {v9, v4, v3}, Lpm2;->r(III)I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    goto/16 :goto_2

    .line 768
    .line 769
    :pswitch_23
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    check-cast v3, Ljava/util/List;

    .line 774
    .line 775
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 776
    .line 777
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    if-nez v4, :cond_6

    .line 782
    .line 783
    goto :goto_d

    .line 784
    :cond_6
    invoke-static {v3}, Lcq3;->c(Ljava/util/List;)I

    .line 785
    .line 786
    .line 787
    move-result v3

    .line 788
    goto :goto_e

    .line 789
    :pswitch_24
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    check-cast v3, Ljava/util/List;

    .line 794
    .line 795
    invoke-static {v11, v3}, Lcq3;->g(ILjava/util/List;)I

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    goto/16 :goto_2

    .line 800
    .line 801
    :pswitch_25
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    check-cast v3, Ljava/util/List;

    .line 806
    .line 807
    invoke-static {v11, v3}, Lcq3;->e(ILjava/util/List;)I

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    goto/16 :goto_2

    .line 812
    .line 813
    :pswitch_26
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    check-cast v3, Ljava/util/List;

    .line 818
    .line 819
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 820
    .line 821
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 822
    .line 823
    .line 824
    move-result v4

    .line 825
    if-nez v4, :cond_7

    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_7
    invoke-static {v3}, Lcq3;->I(Ljava/util/List;)I

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    goto :goto_e

    .line 833
    :pswitch_27
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    check-cast v3, Ljava/util/List;

    .line 838
    .line 839
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 840
    .line 841
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 842
    .line 843
    .line 844
    move-result v4

    .line 845
    if-nez v4, :cond_8

    .line 846
    .line 847
    goto :goto_d

    .line 848
    :cond_8
    invoke-static {v3}, Lcq3;->b(Ljava/util/List;)I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    goto :goto_e

    .line 853
    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    check-cast v3, Ljava/util/List;

    .line 858
    .line 859
    invoke-static {v11, v3}, Lcq3;->k(ILjava/util/List;)I

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    goto/16 :goto_2

    .line 864
    .line 865
    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    check-cast v3, Ljava/util/List;

    .line 870
    .line 871
    invoke-virtual {v0, v5}, Ltp3;->C(I)Lbq3;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    invoke-static {v11, v3, v4}, Lcq3;->j(ILjava/util/List;Lbq3;)I

    .line 876
    .line 877
    .line 878
    move-result v3

    .line 879
    goto/16 :goto_2

    .line 880
    .line 881
    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    check-cast v3, Ljava/util/List;

    .line 886
    .line 887
    invoke-static {v11, v3}, Lcq3;->h(ILjava/util/List;)I

    .line 888
    .line 889
    .line 890
    move-result v3

    .line 891
    goto/16 :goto_2

    .line 892
    .line 893
    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    check-cast v3, Ljava/util/List;

    .line 898
    .line 899
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 900
    .line 901
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    if-nez v3, :cond_9

    .line 906
    .line 907
    move/from16 v4, v16

    .line 908
    .line 909
    goto :goto_f

    .line 910
    :cond_9
    shl-int/lit8 v4, v11, 0x3

    .line 911
    .line 912
    invoke-static {v4}, Lkn3;->p(I)I

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    add-int/2addr v4, v14

    .line 917
    mul-int/2addr v4, v3

    .line 918
    :goto_f
    add-int/2addr v6, v4

    .line 919
    goto/16 :goto_10

    .line 920
    .line 921
    :pswitch_2c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    check-cast v3, Ljava/util/List;

    .line 926
    .line 927
    invoke-static {v11, v3}, Lcq3;->e(ILjava/util/List;)I

    .line 928
    .line 929
    .line 930
    move-result v3

    .line 931
    goto/16 :goto_2

    .line 932
    .line 933
    :pswitch_2d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    check-cast v3, Ljava/util/List;

    .line 938
    .line 939
    invoke-static {v11, v3}, Lcq3;->g(ILjava/util/List;)I

    .line 940
    .line 941
    .line 942
    move-result v3

    .line 943
    goto/16 :goto_2

    .line 944
    .line 945
    :pswitch_2e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    check-cast v3, Ljava/util/List;

    .line 950
    .line 951
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 952
    .line 953
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 954
    .line 955
    .line 956
    move-result v4

    .line 957
    if-nez v4, :cond_a

    .line 958
    .line 959
    goto/16 :goto_d

    .line 960
    .line 961
    :cond_a
    invoke-static {v3}, Lcq3;->a(Ljava/util/List;)I

    .line 962
    .line 963
    .line 964
    move-result v3

    .line 965
    goto/16 :goto_e

    .line 966
    .line 967
    :pswitch_2f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v3

    .line 971
    check-cast v3, Ljava/util/List;

    .line 972
    .line 973
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 974
    .line 975
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 976
    .line 977
    .line 978
    move-result v4

    .line 979
    if-nez v4, :cond_b

    .line 980
    .line 981
    goto/16 :goto_d

    .line 982
    .line 983
    :cond_b
    invoke-static {v3}, Lcq3;->G(Ljava/util/List;)I

    .line 984
    .line 985
    .line 986
    move-result v3

    .line 987
    goto/16 :goto_e

    .line 988
    .line 989
    :pswitch_30
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v3

    .line 993
    check-cast v3, Ljava/util/List;

    .line 994
    .line 995
    sget-object v4, Lcq3;->a:Ljava/lang/Class;

    .line 996
    .line 997
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    if-nez v4, :cond_c

    .line 1002
    .line 1003
    goto/16 :goto_d

    .line 1004
    .line 1005
    :cond_c
    invoke-static {v3}, Lcq3;->F(Ljava/util/List;)I

    .line 1006
    .line 1007
    .line 1008
    move-result v4

    .line 1009
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    shl-int/lit8 v9, v11, 0x3

    .line 1014
    .line 1015
    invoke-static {v9, v3, v4}, Lpm2;->r(III)I

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    goto/16 :goto_2

    .line 1020
    .line 1021
    :pswitch_31
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    check-cast v3, Ljava/util/List;

    .line 1026
    .line 1027
    invoke-static {v11, v3}, Lcq3;->e(ILjava/util/List;)I

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    goto/16 :goto_2

    .line 1032
    .line 1033
    :pswitch_32
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    check-cast v3, Ljava/util/List;

    .line 1038
    .line 1039
    invoke-static {v11, v3}, Lcq3;->g(ILjava/util/List;)I

    .line 1040
    .line 1041
    .line 1042
    move-result v3

    .line 1043
    goto/16 :goto_2

    .line 1044
    .line 1045
    :pswitch_33
    and-int/2addr v9, v8

    .line 1046
    if-eqz v9, :cond_e

    .line 1047
    .line 1048
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    check-cast v3, Ltm3;

    .line 1053
    .line 1054
    invoke-virtual {v0, v5}, Ltp3;->C(I)Lbq3;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v4

    .line 1058
    invoke-static {v11, v3, v4}, Lkn3;->a(ILtm3;Lbq3;)I

    .line 1059
    .line 1060
    .line 1061
    move-result v3

    .line 1062
    goto/16 :goto_2

    .line 1063
    .line 1064
    :pswitch_34
    and-int/2addr v9, v8

    .line 1065
    if-eqz v9, :cond_e

    .line 1066
    .line 1067
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1068
    .line 1069
    .line 1070
    move-result-wide v3

    .line 1071
    shl-int/lit8 v9, v11, 0x3

    .line 1072
    .line 1073
    add-long v10, v3, v3

    .line 1074
    .line 1075
    shr-long/2addr v3, v15

    .line 1076
    invoke-static {v9}, Lkn3;->p(I)I

    .line 1077
    .line 1078
    .line 1079
    move-result v9

    .line 1080
    xor-long/2addr v3, v10

    .line 1081
    invoke-static {v3, v4}, Lkn3;->q(J)I

    .line 1082
    .line 1083
    .line 1084
    move-result v3

    .line 1085
    goto/16 :goto_3

    .line 1086
    .line 1087
    :pswitch_35
    and-int/2addr v9, v8

    .line 1088
    if-eqz v9, :cond_e

    .line 1089
    .line 1090
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1091
    .line 1092
    .line 1093
    move-result v3

    .line 1094
    shl-int/lit8 v4, v11, 0x3

    .line 1095
    .line 1096
    add-int v9, v3, v3

    .line 1097
    .line 1098
    shr-int/lit8 v3, v3, 0x1f

    .line 1099
    .line 1100
    invoke-static {v4}, Lkn3;->p(I)I

    .line 1101
    .line 1102
    .line 1103
    move-result v4

    .line 1104
    goto/16 :goto_4

    .line 1105
    .line 1106
    :pswitch_36
    and-int v3, v8, v9

    .line 1107
    .line 1108
    if-eqz v3, :cond_e

    .line 1109
    .line 1110
    goto/16 :goto_5

    .line 1111
    .line 1112
    :pswitch_37
    and-int v3, v8, v9

    .line 1113
    .line 1114
    if-eqz v3, :cond_e

    .line 1115
    .line 1116
    goto/16 :goto_6

    .line 1117
    .line 1118
    :pswitch_38
    and-int/2addr v9, v8

    .line 1119
    if-eqz v9, :cond_e

    .line 1120
    .line 1121
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    shl-int/lit8 v4, v11, 0x3

    .line 1126
    .line 1127
    invoke-static {v3}, Lkn3;->o(I)I

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    goto/16 :goto_7

    .line 1132
    .line 1133
    :pswitch_39
    and-int/2addr v9, v8

    .line 1134
    if-eqz v9, :cond_e

    .line 1135
    .line 1136
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1137
    .line 1138
    .line 1139
    move-result v3

    .line 1140
    shl-int/lit8 v4, v11, 0x3

    .line 1141
    .line 1142
    invoke-static {v3}, Lkn3;->p(I)I

    .line 1143
    .line 1144
    .line 1145
    move-result v3

    .line 1146
    goto/16 :goto_7

    .line 1147
    .line 1148
    :pswitch_3a
    and-int/2addr v9, v8

    .line 1149
    if-eqz v9, :cond_e

    .line 1150
    .line 1151
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v3

    .line 1155
    check-cast v3, Lcn3;

    .line 1156
    .line 1157
    shl-int/lit8 v4, v11, 0x3

    .line 1158
    .line 1159
    sget-object v9, Lkn3;->e:Ljava/util/logging/Logger;

    .line 1160
    .line 1161
    invoke-virtual {v3}, Lcn3;->c()I

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    invoke-static {v3}, Lkn3;->p(I)I

    .line 1166
    .line 1167
    .line 1168
    move-result v9

    .line 1169
    goto/16 :goto_8

    .line 1170
    .line 1171
    :pswitch_3b
    and-int/2addr v9, v8

    .line 1172
    if-eqz v9, :cond_e

    .line 1173
    .line 1174
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v3

    .line 1178
    invoke-virtual {v0, v5}, Ltp3;->C(I)Lbq3;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v4

    .line 1182
    invoke-static {v11, v3, v4}, Lcq3;->i(ILjava/lang/Object;Lbq3;)I

    .line 1183
    .line 1184
    .line 1185
    move-result v3

    .line 1186
    goto/16 :goto_2

    .line 1187
    .line 1188
    :pswitch_3c
    and-int/2addr v9, v8

    .line 1189
    if-eqz v9, :cond_e

    .line 1190
    .line 1191
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    instance-of v4, v3, Lcn3;

    .line 1196
    .line 1197
    if-eqz v4, :cond_d

    .line 1198
    .line 1199
    check-cast v3, Lcn3;

    .line 1200
    .line 1201
    shl-int/lit8 v4, v11, 0x3

    .line 1202
    .line 1203
    sget-object v9, Lkn3;->e:Ljava/util/logging/Logger;

    .line 1204
    .line 1205
    invoke-virtual {v3}, Lcn3;->c()I

    .line 1206
    .line 1207
    .line 1208
    move-result v3

    .line 1209
    invoke-static {v3}, Lkn3;->p(I)I

    .line 1210
    .line 1211
    .line 1212
    move-result v9

    .line 1213
    goto/16 :goto_8

    .line 1214
    .line 1215
    :cond_d
    check-cast v3, Ljava/lang/String;

    .line 1216
    .line 1217
    shl-int/lit8 v4, v11, 0x3

    .line 1218
    .line 1219
    invoke-static {v3}, Lkn3;->r(Ljava/lang/String;)I

    .line 1220
    .line 1221
    .line 1222
    move-result v3

    .line 1223
    goto/16 :goto_7

    .line 1224
    .line 1225
    :pswitch_3d
    and-int v3, v8, v9

    .line 1226
    .line 1227
    if-eqz v3, :cond_e

    .line 1228
    .line 1229
    goto/16 :goto_9

    .line 1230
    .line 1231
    :pswitch_3e
    and-int v3, v8, v9

    .line 1232
    .line 1233
    if-eqz v3, :cond_e

    .line 1234
    .line 1235
    goto/16 :goto_6

    .line 1236
    .line 1237
    :pswitch_3f
    and-int v3, v8, v9

    .line 1238
    .line 1239
    if-eqz v3, :cond_e

    .line 1240
    .line 1241
    goto/16 :goto_5

    .line 1242
    .line 1243
    :pswitch_40
    and-int/2addr v9, v8

    .line 1244
    if-eqz v9, :cond_e

    .line 1245
    .line 1246
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1247
    .line 1248
    .line 1249
    move-result v3

    .line 1250
    shl-int/lit8 v4, v11, 0x3

    .line 1251
    .line 1252
    invoke-static {v3}, Lkn3;->o(I)I

    .line 1253
    .line 1254
    .line 1255
    move-result v3

    .line 1256
    goto/16 :goto_7

    .line 1257
    .line 1258
    :pswitch_41
    and-int/2addr v9, v8

    .line 1259
    if-eqz v9, :cond_e

    .line 1260
    .line 1261
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1262
    .line 1263
    .line 1264
    move-result-wide v3

    .line 1265
    shl-int/lit8 v9, v11, 0x3

    .line 1266
    .line 1267
    invoke-static {v3, v4}, Lkn3;->q(J)I

    .line 1268
    .line 1269
    .line 1270
    move-result v3

    .line 1271
    goto/16 :goto_a

    .line 1272
    .line 1273
    :pswitch_42
    and-int/2addr v9, v8

    .line 1274
    if-eqz v9, :cond_e

    .line 1275
    .line 1276
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v3

    .line 1280
    shl-int/lit8 v9, v11, 0x3

    .line 1281
    .line 1282
    invoke-static {v3, v4}, Lkn3;->q(J)I

    .line 1283
    .line 1284
    .line 1285
    move-result v3

    .line 1286
    goto/16 :goto_a

    .line 1287
    .line 1288
    :pswitch_43
    and-int v3, v8, v9

    .line 1289
    .line 1290
    if-eqz v3, :cond_e

    .line 1291
    .line 1292
    goto/16 :goto_6

    .line 1293
    .line 1294
    :pswitch_44
    and-int v3, v8, v9

    .line 1295
    .line 1296
    if-eqz v3, :cond_e

    .line 1297
    .line 1298
    goto/16 :goto_5

    .line 1299
    .line 1300
    :cond_e
    :goto_10
    add-int/lit8 v5, v5, 0x3

    .line 1301
    .line 1302
    const v4, 0xfffff

    .line 1303
    .line 1304
    .line 1305
    goto/16 :goto_0

    .line 1306
    .line 1307
    :cond_f
    const/16 v16, 0x0

    .line 1308
    .line 1309
    iget-object v2, v0, Ltp3;->l:Lnq3;

    .line 1310
    .line 1311
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    iget-object v2, v1, Leo3;->zzc:Lmq3;

    .line 1315
    .line 1316
    invoke-virtual {v2}, Lmq3;->c()I

    .line 1317
    .line 1318
    .line 1319
    move-result v2

    .line 1320
    add-int/2addr v2, v6

    .line 1321
    iget-boolean v3, v0, Ltp3;->f:Z

    .line 1322
    .line 1323
    if-eqz v3, :cond_14

    .line 1324
    .line 1325
    iget-object v0, v0, Ltp3;->m:Lqn3;

    .line 1326
    .line 1327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1328
    .line 1329
    .line 1330
    move-object v0, v1

    .line 1331
    check-cast v0, Lbo3;

    .line 1332
    .line 1333
    iget-object v0, v0, Lbo3;->zza:Lun3;

    .line 1334
    .line 1335
    iget-object v1, v0, Lun3;->a:Lhq3;

    .line 1336
    .line 1337
    iget-object v1, v1, Lhq3;->b:Ljava/util/List;

    .line 1338
    .line 1339
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1340
    .line 1341
    .line 1342
    move-result v1

    .line 1343
    iget-object v0, v0, Lun3;->a:Lhq3;

    .line 1344
    .line 1345
    const/4 v3, 0x0

    .line 1346
    if-gtz v1, :cond_12

    .line 1347
    .line 1348
    invoke-virtual {v0}, Lhq3;->b()Ljava/lang/Iterable;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1357
    .line 1358
    .line 1359
    move-result v1

    .line 1360
    if-nez v1, :cond_10

    .line 1361
    .line 1362
    goto :goto_11

    .line 1363
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    check-cast v0, Ljava/util/Map$Entry;

    .line 1368
    .line 1369
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v1

    .line 1373
    if-eqz v1, :cond_11

    .line 1374
    .line 1375
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 1376
    .line 1377
    .line 1378
    return v16

    .line 1379
    :cond_11
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    throw v3

    .line 1383
    :cond_12
    move/from16 v13, v16

    .line 1384
    .line 1385
    invoke-virtual {v0, v13}, Lhq3;->a(I)Ljava/util/Map$Entry;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v1

    .line 1393
    if-eqz v1, :cond_13

    .line 1394
    .line 1395
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 1396
    .line 1397
    .line 1398
    return v13

    .line 1399
    :cond_13
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    throw v3

    .line 1403
    :cond_14
    :goto_11
    return v2

    .line 1404
    nop

    .line 1405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public final z(Ljava/lang/Object;[BIIIIIIJIJLym3;)I
    .locals 10

    .line 1
    move v0, p5

    .line 2
    move/from16 v1, p7

    .line 3
    .line 4
    move/from16 v2, p8

    .line 5
    .line 6
    move-wide/from16 v3, p12

    .line 7
    .line 8
    sget-object v5, Ltp3;->o:Lsun/misc/Unsafe;

    .line 9
    .line 10
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    check-cast v6, Lro3;

    .line 15
    .line 16
    move-object v7, v6

    .line 17
    check-cast v7, Lvm3;

    .line 18
    .line 19
    iget-boolean v7, v7, Lvm3;->a:Z

    .line 20
    .line 21
    if-nez v7, :cond_1

    .line 22
    .line 23
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-nez v7, :cond_0

    .line 28
    .line 29
    const/16 v7, 0xa

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    add-int/2addr v7, v7

    .line 33
    :goto_0
    invoke-interface {v6, v7}, Lro3;->I(I)Lro3;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v5, p1, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    const/4 v3, 0x5

    .line 42
    const/4 v4, 0x1

    .line 43
    const/4 v5, 0x2

    .line 44
    packed-switch p11, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    if-ne v1, p1, :cond_2b

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    and-int/lit8 p1, v0, -0x8

    .line 55
    .line 56
    or-int/lit8 p1, p1, 0x4

    .line 57
    .line 58
    invoke-interface {p0}, Lbq3;->zza()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v2, p0

    .line 63
    check-cast v2, Ltp3;

    .line 64
    .line 65
    move/from16 p11, p1

    .line 66
    .line 67
    move-object/from16 p8, p2

    .line 68
    .line 69
    move/from16 p9, p3

    .line 70
    .line 71
    move/from16 p10, p4

    .line 72
    .line 73
    move-object/from16 p12, p14

    .line 74
    .line 75
    move-object/from16 p7, v1

    .line 76
    .line 77
    move-object/from16 p6, v2

    .line 78
    .line 79
    invoke-virtual/range {p6 .. p12}, Ltp3;->t(Ljava/lang/Object;[BIIILym3;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    move-object/from16 v5, p6

    .line 84
    .line 85
    move-object/from16 v4, p7

    .line 86
    .line 87
    move/from16 v3, p11

    .line 88
    .line 89
    move-object/from16 v2, p12

    .line 90
    .line 91
    iput-object v4, v2, Lym3;->c:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-interface {p0, v4}, Lbq3;->zzj(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v4, v2, Lym3;->c:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :goto_1
    if-ge p1, p4, :cond_3

    .line 102
    .line 103
    invoke-static {p2, p1, v2}, Lw11;->Z([BILym3;)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    iget v7, v2, Lym3;->a:I

    .line 108
    .line 109
    if-eq v0, v7, :cond_2

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-interface {p0}, Lbq3;->zza()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move-object/from16 p7, p1

    .line 117
    .line 118
    move-object/from16 p8, p2

    .line 119
    .line 120
    move/from16 p10, p4

    .line 121
    .line 122
    move-object/from16 p12, v2

    .line 123
    .line 124
    move/from16 p11, v3

    .line 125
    .line 126
    move/from16 p9, v4

    .line 127
    .line 128
    move-object/from16 p6, v5

    .line 129
    .line 130
    invoke-virtual/range {p6 .. p12}, Ltp3;->t(Ljava/lang/Object;[BIIILym3;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    move-object/from16 v1, p7

    .line 135
    .line 136
    move/from16 p3, p11

    .line 137
    .line 138
    move-object/from16 v7, p12

    .line 139
    .line 140
    iput-object v1, v7, Lym3;->c:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-interface {p0, v1}, Lbq3;->zzj(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object v1, v7, Lym3;->c:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move v3, p3

    .line 151
    move-object v2, v7

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    :goto_2
    return p1

    .line 154
    :pswitch_0
    if-eq v1, v5, :cond_5

    .line 155
    .line 156
    if-eqz v1, :cond_4

    .line 157
    .line 158
    goto/16 :goto_a

    .line 159
    .line 160
    :cond_4
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 161
    .line 162
    .line 163
    return p1

    .line 164
    :cond_5
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 165
    .line 166
    .line 167
    return p1

    .line 168
    :pswitch_1
    if-eq v1, v5, :cond_7

    .line 169
    .line 170
    if-eqz v1, :cond_6

    .line 171
    .line 172
    goto/16 :goto_a

    .line 173
    .line 174
    :cond_6
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 175
    .line 176
    .line 177
    return p1

    .line 178
    :cond_7
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 179
    .line 180
    .line 181
    return p1

    .line 182
    :pswitch_2
    if-eq v1, v5, :cond_9

    .line 183
    .line 184
    if-eqz v1, :cond_8

    .line 185
    .line 186
    goto/16 :goto_a

    .line 187
    .line 188
    :cond_8
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 189
    .line 190
    .line 191
    return p1

    .line 192
    :cond_9
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 193
    .line 194
    .line 195
    return p1

    .line 196
    :pswitch_3
    move-object/from16 v7, p14

    .line 197
    .line 198
    if-ne v1, v5, :cond_2b

    .line 199
    .line 200
    invoke-static {p2, p3, v7}, Lw11;->Z([BILym3;)I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    iget p1, v7, Lym3;->a:I

    .line 205
    .line 206
    if-ltz p1, :cond_11

    .line 207
    .line 208
    array-length p3, p2

    .line 209
    sub-int/2addr p3, p0

    .line 210
    if-gt p1, p3, :cond_10

    .line 211
    .line 212
    if-nez p1, :cond_a

    .line 213
    .line 214
    sget-object p1, Lcn3;->b:Lan3;

    .line 215
    .line 216
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_a
    invoke-static {p2, p0, p1}, Lcn3;->d([BII)Lan3;

    .line 221
    .line 222
    .line 223
    move-result-object p3

    .line 224
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    :goto_3
    add-int/2addr p0, p1

    .line 228
    :goto_4
    if-ge p0, p4, :cond_f

    .line 229
    .line 230
    invoke-static {p2, p0, v7}, Lw11;->Z([BILym3;)I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    iget p3, v7, Lym3;->a:I

    .line 235
    .line 236
    if-eq v0, p3, :cond_b

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    invoke-static {p2, p1, v7}, Lw11;->Z([BILym3;)I

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    iget p1, v7, Lym3;->a:I

    .line 244
    .line 245
    if-ltz p1, :cond_e

    .line 246
    .line 247
    array-length p3, p2

    .line 248
    sub-int/2addr p3, p0

    .line 249
    if-gt p1, p3, :cond_d

    .line 250
    .line 251
    if-nez p1, :cond_c

    .line 252
    .line 253
    sget-object p1, Lcn3;->b:Lan3;

    .line 254
    .line 255
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_c
    invoke-static {p2, p0, p1}, Lcn3;->d([BII)Lan3;

    .line 260
    .line 261
    .line 262
    move-result-object p3

    .line 263
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_d
    invoke-static {}, Luo3;->a()Luo3;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    throw p0

    .line 272
    :cond_e
    invoke-static {}, Luo3;->b()Luo3;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    throw p0

    .line 277
    :cond_f
    :goto_5
    return p0

    .line 278
    :cond_10
    invoke-static {}, Luo3;->a()Luo3;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    throw p0

    .line 283
    :cond_11
    invoke-static {}, Luo3;->b()Luo3;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    throw p0

    .line 288
    :pswitch_4
    move-object/from16 v7, p14

    .line 289
    .line 290
    if-ne v1, v5, :cond_2b

    .line 291
    .line 292
    invoke-virtual {p0, v2}, Ltp3;->C(I)Lbq3;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    move-object/from16 p6, p0

    .line 297
    .line 298
    move-object/from16 p8, p2

    .line 299
    .line 300
    move/from16 p9, p3

    .line 301
    .line 302
    move/from16 p10, p4

    .line 303
    .line 304
    move/from16 p7, v0

    .line 305
    .line 306
    move-object/from16 p11, v6

    .line 307
    .line 308
    move-object/from16 p12, v7

    .line 309
    .line 310
    invoke-static/range {p6 .. p12}, Lw11;->m0(Lbq3;I[BIILro3;Lym3;)I

    .line 311
    .line 312
    .line 313
    move-result p0

    .line 314
    return p0

    .line 315
    :pswitch_5
    move-object/from16 v2, p14

    .line 316
    .line 317
    if-ne v1, v5, :cond_2b

    .line 318
    .line 319
    const-wide/32 p0, 0x20000000

    .line 320
    .line 321
    .line 322
    and-long p0, p9, p0

    .line 323
    .line 324
    const-wide/16 v8, 0x0

    .line 325
    .line 326
    cmp-long p0, p0, v8

    .line 327
    .line 328
    const-string p1, ""

    .line 329
    .line 330
    if-nez p0, :cond_17

    .line 331
    .line 332
    invoke-static {p2, p3, v2}, Lw11;->Z([BILym3;)I

    .line 333
    .line 334
    .line 335
    move-result p0

    .line 336
    iget p3, v2, Lym3;->a:I

    .line 337
    .line 338
    if-ltz p3, :cond_16

    .line 339
    .line 340
    if-nez p3, :cond_12

    .line 341
    .line 342
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_12
    new-instance v1, Ljava/lang/String;

    .line 347
    .line 348
    sget-object v5, Lso3;->a:Ljava/nio/charset/Charset;

    .line 349
    .line 350
    invoke-direct {v1, p2, p0, p3, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    :goto_6
    add-int/2addr p0, p3

    .line 357
    :goto_7
    if-ge p0, p4, :cond_15

    .line 358
    .line 359
    invoke-static {p2, p0, v2}, Lw11;->Z([BILym3;)I

    .line 360
    .line 361
    .line 362
    move-result p3

    .line 363
    iget v1, v2, Lym3;->a:I

    .line 364
    .line 365
    if-ne v0, v1, :cond_15

    .line 366
    .line 367
    invoke-static {p2, p3, v2}, Lw11;->Z([BILym3;)I

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    iget p3, v2, Lym3;->a:I

    .line 372
    .line 373
    if-ltz p3, :cond_14

    .line 374
    .line 375
    if-nez p3, :cond_13

    .line 376
    .line 377
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_13
    new-instance v1, Ljava/lang/String;

    .line 382
    .line 383
    sget-object v5, Lso3;->a:Ljava/nio/charset/Charset;

    .line 384
    .line 385
    invoke-direct {v1, p2, p0, p3, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_14
    invoke-static {}, Luo3;->b()Luo3;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    throw p0

    .line 397
    :cond_15
    return p0

    .line 398
    :cond_16
    invoke-static {}, Luo3;->b()Luo3;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    throw p0

    .line 403
    :cond_17
    invoke-static {p2, p3, v2}, Lw11;->Z([BILym3;)I

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    iget p3, v2, Lym3;->a:I

    .line 408
    .line 409
    if-ltz p3, :cond_1e

    .line 410
    .line 411
    if-nez p3, :cond_18

    .line 412
    .line 413
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    goto :goto_9

    .line 417
    :cond_18
    add-int v1, p0, p3

    .line 418
    .line 419
    sget-object v5, Lzq3;->a:Lcg3;

    .line 420
    .line 421
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-static {p2, p0, v1}, Lcg3;->a([BII)Z

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    if-eqz v5, :cond_1d

    .line 429
    .line 430
    new-instance v5, Ljava/lang/String;

    .line 431
    .line 432
    sget-object v7, Lso3;->a:Ljava/nio/charset/Charset;

    .line 433
    .line 434
    invoke-direct {v5, p2, p0, p3, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    :goto_8
    move p0, v1

    .line 441
    :goto_9
    if-ge p0, p4, :cond_1c

    .line 442
    .line 443
    invoke-static {p2, p0, v2}, Lw11;->Z([BILym3;)I

    .line 444
    .line 445
    .line 446
    move-result p3

    .line 447
    iget v1, v2, Lym3;->a:I

    .line 448
    .line 449
    if-ne v0, v1, :cond_1c

    .line 450
    .line 451
    invoke-static {p2, p3, v2}, Lw11;->Z([BILym3;)I

    .line 452
    .line 453
    .line 454
    move-result p0

    .line 455
    iget p3, v2, Lym3;->a:I

    .line 456
    .line 457
    if-ltz p3, :cond_1b

    .line 458
    .line 459
    if-nez p3, :cond_19

    .line 460
    .line 461
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_19
    add-int v1, p0, p3

    .line 466
    .line 467
    sget-object v5, Lzq3;->a:Lcg3;

    .line 468
    .line 469
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    invoke-static {p2, p0, v1}, Lcg3;->a([BII)Z

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    if-eqz v5, :cond_1a

    .line 477
    .line 478
    new-instance v5, Ljava/lang/String;

    .line 479
    .line 480
    sget-object v7, Lso3;->a:Ljava/nio/charset/Charset;

    .line 481
    .line 482
    invoke-direct {v5, p2, p0, p3, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    goto :goto_8

    .line 489
    :cond_1a
    invoke-static {}, Luo3;->d()Luo3;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    throw p0

    .line 494
    :cond_1b
    invoke-static {}, Luo3;->b()Luo3;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    throw p0

    .line 499
    :cond_1c
    return p0

    .line 500
    :cond_1d
    invoke-static {}, Luo3;->d()Luo3;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    throw p0

    .line 505
    :cond_1e
    invoke-static {}, Luo3;->b()Luo3;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    throw p0

    .line 510
    :pswitch_6
    if-eq v1, v5, :cond_20

    .line 511
    .line 512
    if-eqz v1, :cond_1f

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_1f
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 516
    .line 517
    .line 518
    return p1

    .line 519
    :cond_20
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 520
    .line 521
    .line 522
    return p1

    .line 523
    :pswitch_7
    if-eq v1, v5, :cond_22

    .line 524
    .line 525
    if-eq v1, v3, :cond_21

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_21
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 529
    .line 530
    .line 531
    return p1

    .line 532
    :cond_22
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 533
    .line 534
    .line 535
    return p1

    .line 536
    :pswitch_8
    if-eq v1, v5, :cond_24

    .line 537
    .line 538
    if-eq v1, v4, :cond_23

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_23
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 542
    .line 543
    .line 544
    return p1

    .line 545
    :cond_24
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 546
    .line 547
    .line 548
    return p1

    .line 549
    :pswitch_9
    if-eq v1, v5, :cond_26

    .line 550
    .line 551
    if-eqz v1, :cond_25

    .line 552
    .line 553
    goto :goto_a

    .line 554
    :cond_25
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 555
    .line 556
    .line 557
    return p1

    .line 558
    :cond_26
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 559
    .line 560
    .line 561
    return p1

    .line 562
    :pswitch_a
    if-eq v1, v5, :cond_28

    .line 563
    .line 564
    if-eqz v1, :cond_27

    .line 565
    .line 566
    goto :goto_a

    .line 567
    :cond_27
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 568
    .line 569
    .line 570
    return p1

    .line 571
    :cond_28
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 572
    .line 573
    .line 574
    return p1

    .line 575
    :pswitch_b
    if-eq v1, v5, :cond_2a

    .line 576
    .line 577
    if-eq v1, v3, :cond_29

    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_29
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 581
    .line 582
    .line 583
    return p1

    .line 584
    :cond_2a
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 585
    .line 586
    .line 587
    return p1

    .line 588
    :pswitch_c
    if-eq v1, v5, :cond_2d

    .line 589
    .line 590
    if-eq v1, v4, :cond_2c

    .line 591
    .line 592
    :cond_2b
    :goto_a
    return p3

    .line 593
    :cond_2c
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 594
    .line 595
    .line 596
    return p1

    .line 597
    :cond_2d
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 598
    .line 599
    .line 600
    return p1

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Ltp3;->e:Ltm3;

    .line 2
    .line 3
    check-cast p0, Leo3;

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Leo3;->l(ILeo3;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Leo3;

    .line 12
    .line 13
    return-object p0
.end method

.method public final zzd(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    invoke-static {p1}, Ltp3;->j(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Ltp3;->a:[I

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ltp3;->g(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v3, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int v4, v2, v3

    .line 21
    .line 22
    aget v5, v1, v0

    .line 23
    .line 24
    invoke-static {v2}, Ltp3;->h(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-long v8, v4

    .line 29
    packed-switch v2, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_1
    move-object v7, p1

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, Ltp3;->x(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :pswitch_1
    invoke-virtual {p0, v5, p2, v0}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-static {p2, v8, v9}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {p1, v8, v9, v2}, Ltq3;->k(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v0, 0x2

    .line 53
    .line 54
    aget v1, v1, v2

    .line 55
    .line 56
    and-int/2addr v1, v3

    .line 57
    int-to-long v1, v1

    .line 58
    invoke-static {p1, v1, v2, v5}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, Ltp3;->x(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_3
    invoke-virtual {p0, v5, p2, v0}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-static {p2, v8, v9}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {p1, v8, v9, v2}, Ltq3;->k(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v0, 0x2

    .line 80
    .line 81
    aget v1, v1, v2

    .line 82
    .line 83
    and-int/2addr v1, v3

    .line 84
    int-to-long v1, v1

    .line 85
    invoke-static {p1, v1, v2, v5}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :pswitch_4
    sget-object v1, Lcq3;->a:Ljava/lang/Class;

    .line 90
    .line 91
    invoke-static {p1, v8, v9}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {p2, v8, v9}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v1, v2}, Lnp3;->b(Ljava/lang/Object;Ljava/lang/Object;)Llp3;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p1, v8, v9, v1}, Ltq3;->k(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_5
    iget-object v1, p0, Ltp3;->k:Lep3;

    .line 108
    .line 109
    invoke-virtual {v1, p1, p2, v8, v9}, Lep3;->b(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, Ltp3;->w(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_0

    .line 122
    .line 123
    invoke-static {p2, v8, v9}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v1

    .line 127
    invoke-static {p1, v8, v9, v1, v2}, Ltq3;->i(Ljava/lang/Object;JJ)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_8
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_0

    .line 139
    .line 140
    invoke-static {p2, v8, v9}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-static {p1, v8, v9, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :pswitch_9
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_0

    .line 156
    .line 157
    invoke-static {p2, v8, v9}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    invoke-static {p1, v8, v9, v1, v2}, Ltq3;->i(Ljava/lang/Object;JJ)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_1

    .line 168
    .line 169
    :pswitch_a
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_0

    .line 174
    .line 175
    invoke-static {p2, v8, v9}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-static {p1, v8, v9, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :pswitch_b
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_0

    .line 192
    .line 193
    invoke-static {p2, v8, v9}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-static {p1, v8, v9, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_c
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_0

    .line 210
    .line 211
    invoke-static {p2, v8, v9}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-static {p1, v8, v9, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :pswitch_d
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_0

    .line 228
    .line 229
    invoke-static {p2, v8, v9}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {p1, v8, v9, v1}, Ltq3;->k(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, Ltp3;->w(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :pswitch_f
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_0

    .line 251
    .line 252
    invoke-static {p2, v8, v9}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-static {p1, v8, v9, v1}, Ltq3;->k(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :pswitch_10
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_0

    .line 269
    .line 270
    sget-object v1, Ltq3;->c:Lsq3;

    .line 271
    .line 272
    invoke-virtual {v1, p2, v8, v9}, Lsq3;->q(Ljava/lang/Object;J)Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    invoke-virtual {v1, p1, v8, v9, v2}, Lsq3;->s(Ljava/lang/Object;JZ)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_1

    .line 283
    .line 284
    :pswitch_11
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_0

    .line 289
    .line 290
    invoke-static {p2, v8, v9}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    invoke-static {p1, v8, v9, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    :pswitch_12
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_0

    .line 307
    .line 308
    invoke-static {p2, v8, v9}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 309
    .line 310
    .line 311
    move-result-wide v1

    .line 312
    invoke-static {p1, v8, v9, v1, v2}, Ltq3;->i(Ljava/lang/Object;JJ)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_1

    .line 319
    .line 320
    :pswitch_13
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_0

    .line 325
    .line 326
    invoke-static {p2, v8, v9}, Ltq3;->f(Ljava/lang/Object;J)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-static {p1, v8, v9, v1}, Ltq3;->g(Ljava/lang/Object;JI)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :pswitch_14
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_0

    .line 343
    .line 344
    invoke-static {p2, v8, v9}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 345
    .line 346
    .line 347
    move-result-wide v1

    .line 348
    invoke-static {p1, v8, v9, v1, v2}, Ltq3;->i(Ljava/lang/Object;JJ)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :pswitch_15
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_0

    .line 361
    .line 362
    invoke-static {p2, v8, v9}, Ltq3;->h(Ljava/lang/Object;J)J

    .line 363
    .line 364
    .line 365
    move-result-wide v1

    .line 366
    invoke-static {p1, v8, v9, v1, v2}, Ltq3;->i(Ljava/lang/Object;JJ)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_1

    .line 373
    .line 374
    :pswitch_16
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_0

    .line 379
    .line 380
    sget-object v1, Ltq3;->c:Lsq3;

    .line 381
    .line 382
    invoke-virtual {v1, p2, v8, v9}, Lsq3;->u(Ljava/lang/Object;J)F

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    invoke-virtual {v1, p1, v8, v9, v2}, Lsq3;->w(Ljava/lang/Object;JF)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p0, v0, p1}, Ltp3;->o(ILjava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_1

    .line 393
    .line 394
    :pswitch_17
    invoke-virtual {p0, v0, p2}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_0

    .line 399
    .line 400
    sget-object v6, Ltq3;->c:Lsq3;

    .line 401
    .line 402
    invoke-virtual {v6, p2, v8, v9}, Lsq3;->x(Ljava/lang/Object;J)D

    .line 403
    .line 404
    .line 405
    move-result-wide v10

    .line 406
    move-object v7, p1

    .line 407
    invoke-virtual/range {v6 .. v11}, Lsq3;->z(Ljava/lang/Object;JD)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0, v0, v7}, Ltp3;->o(ILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 414
    .line 415
    move-object p1, v7

    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :cond_1
    move-object v7, p1

    .line 419
    iget-object p1, p0, Ltp3;->l:Lnq3;

    .line 420
    .line 421
    invoke-static {p1, v7, p2}, Lcq3;->n(Lnq3;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    iget-boolean p1, p0, Ltp3;->f:Z

    .line 425
    .line 426
    if-eqz p1, :cond_2

    .line 427
    .line 428
    iget-object p0, p0, Ltp3;->m:Lqn3;

    .line 429
    .line 430
    invoke-static {p0, v7, p2}, Lcq3;->m(Lqn3;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :cond_2
    return-void

    .line 434
    nop

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzj(Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-static {p1}, Ltp3;->i(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Leo3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Leo3;

    .line 16
    .line 17
    invoke-virtual {v0}, Leo3;->c()V

    .line 18
    .line 19
    .line 20
    iput v1, v0, Ltm3;->zzb:I

    .line 21
    .line 22
    invoke-virtual {v0}, Leo3;->n()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Ltp3;->a:[I

    .line 26
    .line 27
    array-length v2, v0

    .line 28
    move v3, v1

    .line 29
    :goto_0
    if-ge v3, v2, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Ltp3;->g(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const v5, 0xfffff

    .line 36
    .line 37
    .line 38
    and-int/2addr v5, v4

    .line 39
    invoke-static {v4}, Ltp3;->h(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    int-to-long v5, v5

    .line 44
    const/16 v7, 0x9

    .line 45
    .line 46
    if-eq v4, v7, :cond_3

    .line 47
    .line 48
    const/16 v7, 0x3c

    .line 49
    .line 50
    if-eq v4, v7, :cond_2

    .line 51
    .line 52
    const/16 v7, 0x44

    .line 53
    .line 54
    if-eq v4, v7, :cond_2

    .line 55
    .line 56
    packed-switch v4, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_0
    sget-object v4, Ltp3;->o:Lsun/misc/Unsafe;

    .line 61
    .line 62
    invoke-virtual {v4, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    move-object v8, v7

    .line 69
    check-cast v8, Llp3;

    .line 70
    .line 71
    iput-boolean v1, v8, Llp3;->a:Z

    .line 72
    .line 73
    invoke-virtual {v4, p1, v5, v6, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_1
    iget-object v4, p0, Ltp3;->k:Lep3;

    .line 78
    .line 79
    invoke-virtual {v4, p1, v5, v6}, Lep3;->a(Ljava/lang/Object;J)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    aget v4, v0, v3

    .line 84
    .line 85
    invoke-virtual {p0, v4, p1, v3}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    invoke-virtual {p0, v3}, Ltp3;->C(I)Lbq3;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    sget-object v7, Ltp3;->o:Lsun/misc/Unsafe;

    .line 96
    .line 97
    invoke-virtual {v7, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-interface {v4, v5}, Lbq3;->zzj(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    :pswitch_2
    invoke-virtual {p0, v3, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-virtual {p0, v3}, Ltp3;->C(I)Lbq3;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    sget-object v7, Ltp3;->o:Lsun/misc/Unsafe;

    .line 116
    .line 117
    invoke-virtual {v7, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-interface {v4, v5}, Lbq3;->zzj(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x3

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    iget-object v0, p0, Ltp3;->l:Lnq3;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-object v0, p1

    .line 133
    check-cast v0, Leo3;

    .line 134
    .line 135
    iget-object v0, v0, Leo3;->zzc:Lmq3;

    .line 136
    .line 137
    iget-boolean v2, v0, Lmq3;->e:Z

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    iput-boolean v1, v0, Lmq3;->e:Z

    .line 142
    .line 143
    :cond_6
    iget-boolean v0, p0, Ltp3;->f:Z

    .line 144
    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    iget-object p0, p0, Ltp3;->m:Lqn3;

    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    check-cast p1, Lbo3;

    .line 153
    .line 154
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 155
    .line 156
    invoke-virtual {p0}, Lun3;->a()V

    .line 157
    .line 158
    .line 159
    :cond_7
    :goto_2
    return-void

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzk(Ljava/lang/Object;)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0xfffff

    .line 3
    .line 4
    .line 5
    move v2, v0

    .line 6
    move v4, v2

    .line 7
    move v3, v1

    .line 8
    :goto_0
    iget v5, p0, Ltp3;->i:I

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v2, v5, :cond_f

    .line 12
    .line 13
    iget-object v5, p0, Ltp3;->h:[I

    .line 14
    .line 15
    aget v5, v5, v2

    .line 16
    .line 17
    iget-object v7, p0, Ltp3;->a:[I

    .line 18
    .line 19
    aget v8, v7, v5

    .line 20
    .line 21
    invoke-virtual {p0, v5}, Ltp3;->g(I)I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    add-int/lit8 v10, v5, 0x2

    .line 26
    .line 27
    aget v7, v7, v10

    .line 28
    .line 29
    and-int v10, v7, v1

    .line 30
    .line 31
    ushr-int/lit8 v7, v7, 0x14

    .line 32
    .line 33
    shl-int v7, v6, v7

    .line 34
    .line 35
    if-eq v10, v3, :cond_1

    .line 36
    .line 37
    if-eq v10, v1, :cond_0

    .line 38
    .line 39
    int-to-long v3, v10

    .line 40
    sget-object v11, Ltp3;->o:Lsun/misc/Unsafe;

    .line 41
    .line 42
    invoke-virtual {v11, p1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    :cond_0
    move v3, v10

    .line 47
    :cond_1
    const/high16 v10, 0x10000000

    .line 48
    .line 49
    and-int/2addr v10, v9

    .line 50
    if-eqz v10, :cond_4

    .line 51
    .line 52
    if-ne v3, v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v5, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    and-int v10, v4, v7

    .line 60
    .line 61
    if-eqz v10, :cond_3

    .line 62
    .line 63
    move v10, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move v10, v0

    .line 66
    :goto_1
    if-eqz v10, :cond_d

    .line 67
    .line 68
    :cond_4
    invoke-static {v9}, Ltp3;->h(I)I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    const/16 v11, 0x9

    .line 73
    .line 74
    if-eq v10, v11, :cond_a

    .line 75
    .line 76
    const/16 v11, 0x11

    .line 77
    .line 78
    if-eq v10, v11, :cond_a

    .line 79
    .line 80
    const/16 v6, 0x1b

    .line 81
    .line 82
    if-eq v10, v6, :cond_8

    .line 83
    .line 84
    const/16 v6, 0x3c

    .line 85
    .line 86
    if-eq v10, v6, :cond_7

    .line 87
    .line 88
    const/16 v6, 0x44

    .line 89
    .line 90
    if-eq v10, v6, :cond_7

    .line 91
    .line 92
    const/16 v6, 0x31

    .line 93
    .line 94
    if-eq v10, v6, :cond_8

    .line 95
    .line 96
    const/16 v6, 0x32

    .line 97
    .line 98
    if-eq v10, v6, :cond_5

    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_5
    and-int v6, v9, v1

    .line 103
    .line 104
    int-to-long v6, v6

    .line 105
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Llp3;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_6

    .line 116
    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :cond_6
    invoke-virtual {p0, v5}, Ltp3;->D(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 127
    .line 128
    .line 129
    return v0

    .line 130
    :cond_7
    invoke-virtual {p0, v8, p1, v5}, Ltp3;->p(ILjava/lang/Object;I)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_e

    .line 135
    .line 136
    invoke-virtual {p0, v5}, Ltp3;->C(I)Lbq3;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    and-int v6, v9, v1

    .line 141
    .line 142
    int-to-long v6, v6

    .line 143
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-interface {v5, v6}, Lbq3;->zzk(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_e

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    and-int v6, v9, v1

    .line 155
    .line 156
    int-to-long v6, v6

    .line 157
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    check-cast v6, Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-nez v7, :cond_e

    .line 168
    .line 169
    invoke-virtual {p0, v5}, Ltp3;->C(I)Lbq3;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    move v7, v0

    .line 174
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-ge v7, v8, :cond_e

    .line 179
    .line 180
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    invoke-interface {v5, v8}, Lbq3;->zzk(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-nez v8, :cond_9

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_a
    if-ne v3, v1, :cond_b

    .line 195
    .line 196
    invoke-virtual {p0, v5, p1}, Ltp3;->n(ILjava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    goto :goto_3

    .line 201
    :cond_b
    and-int/2addr v7, v4

    .line 202
    if-eqz v7, :cond_c

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_c
    move v6, v0

    .line 206
    :goto_3
    if-eqz v6, :cond_e

    .line 207
    .line 208
    invoke-virtual {p0, v5}, Ltp3;->C(I)Lbq3;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    and-int v6, v9, v1

    .line 213
    .line 214
    int-to-long v6, v6

    .line 215
    invoke-static {p1, v6, v7}, Ltq3;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-interface {v5, v6}, Lbq3;->zzk(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-nez v5, :cond_e

    .line 224
    .line 225
    :cond_d
    :goto_4
    return v0

    .line 226
    :cond_e
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_f
    iget-boolean v0, p0, Ltp3;->f:Z

    .line 231
    .line 232
    if-eqz v0, :cond_10

    .line 233
    .line 234
    iget-object p0, p0, Ltp3;->m:Lqn3;

    .line 235
    .line 236
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    check-cast p1, Lbo3;

    .line 240
    .line 241
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 242
    .line 243
    invoke-virtual {p0}, Lun3;->d()V

    .line 244
    .line 245
    .line 246
    :cond_10
    return v6
.end method
