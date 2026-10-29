.class public final Lfb0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final b:Leb0;

.field public static final c:J

.field public static final d:J


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Leb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Leb0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfb0;->b:Leb0;

    .line 8
    .line 9
    sget v0, Lgb0;->a:I

    .line 10
    .line 11
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lmn0;->i(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sput-wide v0, Lfb0;->c:J

    .line 21
    .line 22
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lmn0;->i(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    sput-wide v0, Lfb0;->d:J

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lfb0;->a:J

    .line 5
    .line 6
    return-void
.end method

.method public static final a(JJ)J
    .locals 6

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long v2, p2, v0

    .line 5
    .line 6
    add-long/2addr p0, v2

    .line 7
    const-wide v4, -0x431bde82d7aL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v4, v4, p0

    .line 13
    .line 14
    if-gtz v4, :cond_0

    .line 15
    .line 16
    const-wide v4, 0x431bde82d7bL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v4, p0, v4

    .line 22
    .line 23
    if-gez v4, :cond_0

    .line 24
    .line 25
    mul-long/2addr v2, v0

    .line 26
    sub-long/2addr p2, v2

    .line 27
    mul-long/2addr p0, v0

    .line 28
    add-long/2addr p0, p2

    .line 29
    invoke-static {p0, p1}, Lmn0;->k(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    return-wide p0

    .line 34
    :cond_0
    invoke-static {p0, p1}, Lr02;->b(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    invoke-static {p0, p1}, Lmn0;->i(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    return-wide p0
.end method

.method public static final b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    const/16 p1, 0x2e

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p3, p1}, Lkotlin/text/StringsKt;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const/4 p3, -0x1

    .line 24
    add-int/2addr p2, p3

    .line 25
    if-ltz p2, :cond_2

    .line 26
    .line 27
    :goto_0
    add-int/lit8 v0, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x30

    .line 34
    .line 35
    if-eq v1, v2, :cond_0

    .line 36
    .line 37
    move p3, p2

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    if-gez v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move p2, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    add-int/lit8 p2, p3, 0x1

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x3

    .line 48
    if-nez p5, :cond_3

    .line 49
    .line 50
    if-ge p2, v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/2addr p3, v1

    .line 57
    div-int/2addr p3, v1

    .line 58
    mul-int/2addr p3, v1

    .line 59
    invoke-virtual {p0, p1, v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_2
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static c(JJ)I
    .locals 6

    .line 1
    xor-long v0, p0, p2

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    if-ltz v4, :cond_2

    .line 9
    .line 10
    long-to-int v0, v0

    .line 11
    and-int/2addr v0, v5

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    long-to-int v0, p0

    .line 16
    and-int/2addr v0, v5

    .line 17
    long-to-int p2, p2

    .line 18
    and-int/2addr p2, v5

    .line 19
    sub-int/2addr v0, p2

    .line 20
    cmp-long p0, p0, v2

    .line 21
    .line 22
    if-gez p0, :cond_1

    .line 23
    .line 24
    neg-int p0, v0

    .line 25
    return p0

    .line 26
    :cond_1
    return v0

    .line 27
    :cond_2
    :goto_0
    cmp-long p0, p0, p2

    .line 28
    .line 29
    if-gez p0, :cond_3

    .line 30
    .line 31
    const/4 p0, -0x1

    .line 32
    return p0

    .line 33
    :cond_3
    if-nez p0, :cond_4

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_4
    return v5
.end method

.method public static final d(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lfb0;->f(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    long-to-int v0, p0

    .line 10
    const/4 v1, 0x1

    .line 11
    and-int/2addr v0, v1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    shr-long/2addr p0, v1

    .line 15
    const-wide/16 v0, 0x3e8

    .line 16
    .line 17
    rem-long/2addr p0, v0

    .line 18
    const-wide/32 v0, 0xf4240

    .line 19
    .line 20
    .line 21
    mul-long/2addr p0, v0

    .line 22
    :goto_0
    long-to-int p0, p0

    .line 23
    return p0

    .line 24
    :cond_1
    shr-long/2addr p0, v1

    .line 25
    const-wide/32 v0, 0x3b9aca00

    .line 26
    .line 27
    .line 28
    rem-long/2addr p0, v0

    .line 29
    goto :goto_0
.end method

.method public static final e(J)Lib0;
    .locals 0

    .line 1
    long-to-int p0, p0

    .line 2
    and-int/lit8 p0, p0, 0x1

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lib0;->b:Lib0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object p0, Lib0;->c:Lib0;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final f(J)Z
    .locals 2

    .line 1
    sget-wide v0, Lfb0;->c:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-wide v0, Lfb0;->d:J

    .line 8
    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static final g(JJ)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lfb0;->f(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {p2, p3}, Lfb0;->f(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    xor-long/2addr p2, p0

    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long p2, p2, v0

    .line 17
    .line 18
    if-ltz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "Summing infinite durations of different signs yields an undefined result."

    .line 22
    .line 23
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 p0, 0x0

    .line 27
    .line 28
    :cond_1
    :goto_0
    return-wide p0

    .line 29
    :cond_2
    invoke-static {p2, p3}, Lfb0;->f(J)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return-wide p2

    .line 36
    :cond_3
    long-to-int v0, p0

    .line 37
    const/4 v1, 0x1

    .line 38
    and-int/2addr v0, v1

    .line 39
    long-to-int v2, p2

    .line 40
    and-int/2addr v2, v1

    .line 41
    if-ne v0, v2, :cond_6

    .line 42
    .line 43
    shr-long/2addr p0, v1

    .line 44
    shr-long/2addr p2, v1

    .line 45
    add-long/2addr p0, p2

    .line 46
    if-nez v0, :cond_5

    .line 47
    .line 48
    const-wide p2, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long p2, p2, p0

    .line 54
    .line 55
    if-gtz p2, :cond_4

    .line 56
    .line 57
    const-wide p2, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long p2, p0, p2

    .line 63
    .line 64
    if-gez p2, :cond_4

    .line 65
    .line 66
    invoke-static {p0, p1}, Lmn0;->k(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    return-wide p0

    .line 71
    :cond_4
    const-wide/32 p2, 0xf4240

    .line 72
    .line 73
    .line 74
    div-long/2addr p0, p2

    .line 75
    invoke-static {p0, p1}, Lmn0;->i(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    return-wide p0

    .line 80
    :cond_5
    invoke-static {p0, p1}, Lmn0;->j(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    return-wide p0

    .line 85
    :cond_6
    if-ne v0, v1, :cond_7

    .line 86
    .line 87
    shr-long/2addr p0, v1

    .line 88
    shr-long/2addr p2, v1

    .line 89
    invoke-static {p0, p1, p2, p3}, Lfb0;->a(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide p0

    .line 93
    return-wide p0

    .line 94
    :cond_7
    shr-long/2addr p2, v1

    .line 95
    shr-long/2addr p0, v1

    .line 96
    invoke-static {p2, p3, p0, p1}, Lfb0;->a(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide p0

    .line 100
    return-wide p0
.end method

.method public static final h(IJ)J
    .locals 21

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v2}, Lfb0;->f(J)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x1

    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    return-wide v1

    .line 19
    :cond_0
    shr-long v5, v1, v4

    .line 20
    .line 21
    neg-long v5, v5

    .line 22
    long-to-int v0, v1

    .line 23
    and-int/2addr v0, v4

    .line 24
    shl-long v1, v5, v4

    .line 25
    .line 26
    int-to-long v3, v0

    .line 27
    add-long/2addr v1, v3

    .line 28
    sget v0, Lgb0;->a:I

    .line 29
    .line 30
    return-wide v1

    .line 31
    :cond_1
    const-string v0, "Multiplying infinite duration by zero yields an undefined result."

    .line 32
    .line 33
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-wide v5

    .line 37
    :cond_2
    if-nez v0, :cond_3

    .line 38
    .line 39
    return-wide v5

    .line 40
    :cond_3
    shr-long v7, v1, v4

    .line 41
    .line 42
    int-to-long v9, v0

    .line 43
    mul-long v11, v7, v9

    .line 44
    .line 45
    long-to-int v1, v1

    .line 46
    and-int/2addr v1, v4

    .line 47
    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    const-wide v13, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    if-nez v1, :cond_8

    .line 58
    .line 59
    const-wide/32 v15, -0x7fffffff

    .line 60
    .line 61
    .line 62
    cmp-long v1, v15, v7

    .line 63
    .line 64
    if-gtz v1, :cond_4

    .line 65
    .line 66
    const-wide v15, 0x80000000L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    cmp-long v1, v7, v15

    .line 72
    .line 73
    if-gez v1, :cond_4

    .line 74
    .line 75
    invoke-static {v11, v12}, Lmn0;->k(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    return-wide v0

    .line 80
    :cond_4
    div-long v15, v11, v9

    .line 81
    .line 82
    cmp-long v1, v15, v7

    .line 83
    .line 84
    const-wide/32 v15, 0xf4240

    .line 85
    .line 86
    .line 87
    if-nez v1, :cond_6

    .line 88
    .line 89
    const-wide v0, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    cmp-long v0, v0, v11

    .line 95
    .line 96
    if-gtz v0, :cond_5

    .line 97
    .line 98
    const-wide v0, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    cmp-long v0, v11, v0

    .line 104
    .line 105
    if-gez v0, :cond_5

    .line 106
    .line 107
    invoke-static {v11, v12}, Lmn0;->k(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    return-wide v0

    .line 112
    :cond_5
    div-long/2addr v11, v15

    .line 113
    invoke-static {v11, v12}, Lmn0;->i(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    return-wide v0

    .line 118
    :cond_6
    div-long v11, v7, v15

    .line 119
    .line 120
    mul-long v17, v11, v15

    .line 121
    .line 122
    sub-long v17, v7, v17

    .line 123
    .line 124
    mul-long v19, v11, v9

    .line 125
    .line 126
    mul-long v17, v17, v9

    .line 127
    .line 128
    div-long v17, v17, v15

    .line 129
    .line 130
    move-wide v15, v5

    .line 131
    add-long v5, v17, v19

    .line 132
    .line 133
    div-long v9, v19, v9

    .line 134
    .line 135
    cmp-long v1, v9, v11

    .line 136
    .line 137
    if-nez v1, :cond_7

    .line 138
    .line 139
    xor-long v9, v5, v19

    .line 140
    .line 141
    cmp-long v1, v9, v15

    .line 142
    .line 143
    if-ltz v1, :cond_7

    .line 144
    .line 145
    new-instance v0, Lra1;

    .line 146
    .line 147
    invoke-direct {v0, v13, v14, v2, v3}, Lra1;-><init>(JJ)V

    .line 148
    .line 149
    .line 150
    invoke-static {v5, v6, v0}, Lr02;->c(JLra1;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v0

    .line 154
    invoke-static {v0, v1}, Lmn0;->i(J)J

    .line 155
    .line 156
    .line 157
    move-result-wide v0

    .line 158
    return-wide v0

    .line 159
    :cond_7
    invoke-static {v7, v8}, Ljava/lang/Long;->signum(J)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->signum(I)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    mul-int/2addr v0, v1

    .line 168
    if-lez v0, :cond_a

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_8
    div-long v4, v11, v9

    .line 172
    .line 173
    cmp-long v1, v4, v7

    .line 174
    .line 175
    if-nez v1, :cond_9

    .line 176
    .line 177
    new-instance v0, Lra1;

    .line 178
    .line 179
    invoke-direct {v0, v13, v14, v2, v3}, Lra1;-><init>(JJ)V

    .line 180
    .line 181
    .line 182
    invoke-static {v11, v12, v0}, Lr02;->c(JLra1;)J

    .line 183
    .line 184
    .line 185
    move-result-wide v0

    .line 186
    invoke-static {v0, v1}, Lmn0;->i(J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    return-wide v0

    .line 191
    :cond_9
    invoke-static {v7, v8}, Ljava/lang/Long;->signum(J)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-static {v0}, Ljava/lang/Integer;->signum(I)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    mul-int/2addr v0, v1

    .line 200
    if-lez v0, :cond_a

    .line 201
    .line 202
    :goto_0
    sget-wide v0, Lfb0;->c:J

    .line 203
    .line 204
    return-wide v0

    .line 205
    :cond_a
    sget-wide v0, Lfb0;->d:J

    .line 206
    .line 207
    return-wide v0
.end method

.method public static final i(JLib0;)D
    .locals 2

    .line 1
    sget-wide v0, Lfb0;->c:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/high16 p0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    sget-wide v0, Lfb0;->d:J

    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-wide/high16 p0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 17
    .line 18
    return-wide p0

    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    shr-long v0, p0, v0

    .line 21
    .line 22
    long-to-double v0, v0

    .line 23
    invoke-static {p0, p1}, Lfb0;->e(J)Lib0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v0, v1, p0, p2}, Ljb0;->a(DLib0;Lib0;)D

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0
.end method

.method public static final j(JLib0;)J
    .locals 2

    .line 1
    sget-wide v0, Lfb0;->c:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide p0, 0x7fffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide p0

    .line 13
    :cond_0
    sget-wide v0, Lfb0;->d:J

    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-wide/high16 p0, -0x8000000000000000L

    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    shr-long v0, p0, v0

    .line 24
    .line 25
    invoke-static {p0, p1}, Lfb0;->e(J)Lib0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p1, p2, Lib0;->a:Ljava/util/concurrent/TimeUnit;

    .line 30
    .line 31
    iget-object p0, p0, Lib0;->a:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1, p0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    return-wide p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lfb0;

    .line 2
    .line 3
    iget-wide v0, p1, Lfb0;->a:J

    .line 4
    .line 5
    iget-wide p0, p0, Lfb0;->a:J

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1}, Lfb0;->c(JJ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lfb0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lfb0;

    .line 7
    .line 8
    iget-wide v0, p1, Lfb0;->a:J

    .line 9
    .line 10
    iget-wide p0, p0, Lfb0;->a:J

    .line 11
    .line 12
    cmp-long p0, p0, v0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lfb0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-wide v0, p0, Lfb0;->a:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, "0s"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-wide v4, Lfb0;->c:J

    .line 13
    .line 14
    cmp-long v4, v0, v4

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    const-string p0, "Infinity"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-wide v4, Lfb0;->d:J

    .line 22
    .line 23
    cmp-long v4, v0, v4

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    const-string p0, "-Infinity"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    if-gez p0, :cond_3

    .line 33
    .line 34
    move v6, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    move v6, v4

    .line 37
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    if-eqz v6, :cond_4

    .line 43
    .line 44
    const/16 v8, 0x2d

    .line 45
    .line 46
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_4
    if-gez p0, :cond_5

    .line 50
    .line 51
    shr-long v8, v0, v5

    .line 52
    .line 53
    neg-long v8, v8

    .line 54
    long-to-int p0, v0

    .line 55
    and-int/2addr p0, v5

    .line 56
    shl-long v0, v8, v5

    .line 57
    .line 58
    int-to-long v8, p0

    .line 59
    add-long/2addr v0, v8

    .line 60
    sget p0, Lgb0;->a:I

    .line 61
    .line 62
    :cond_5
    sget-object p0, Lib0;->i:Lib0;

    .line 63
    .line 64
    invoke-static {v0, v1, p0}, Lfb0;->j(JLib0;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v8

    .line 68
    invoke-static {v0, v1}, Lfb0;->f(J)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_6

    .line 73
    .line 74
    move p0, v4

    .line 75
    goto :goto_1

    .line 76
    :cond_6
    sget-object p0, Lib0;->f:Lib0;

    .line 77
    .line 78
    invoke-static {v0, v1, p0}, Lfb0;->j(JLib0;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v10

    .line 82
    const-wide/16 v12, 0x18

    .line 83
    .line 84
    rem-long/2addr v10, v12

    .line 85
    long-to-int p0, v10

    .line 86
    :goto_1
    invoke-static {v0, v1}, Lfb0;->f(J)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    const-wide/16 v11, 0x3c

    .line 91
    .line 92
    if-eqz v10, :cond_7

    .line 93
    .line 94
    move v10, v4

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    sget-object v10, Lib0;->e:Lib0;

    .line 97
    .line 98
    invoke-static {v0, v1, v10}, Lfb0;->j(JLib0;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v13

    .line 102
    rem-long/2addr v13, v11

    .line 103
    long-to-int v10, v13

    .line 104
    :goto_2
    invoke-static {v0, v1}, Lfb0;->f(J)Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_8

    .line 109
    .line 110
    move v11, v4

    .line 111
    goto :goto_3

    .line 112
    :cond_8
    sget-object v13, Lib0;->d:Lib0;

    .line 113
    .line 114
    invoke-static {v0, v1, v13}, Lfb0;->j(JLib0;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v13

    .line 118
    rem-long/2addr v13, v11

    .line 119
    long-to-int v11, v13

    .line 120
    :goto_3
    invoke-static {v0, v1}, Lfb0;->d(J)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    cmp-long v1, v8, v2

    .line 125
    .line 126
    if-eqz v1, :cond_9

    .line 127
    .line 128
    move v1, v5

    .line 129
    goto :goto_4

    .line 130
    :cond_9
    move v1, v4

    .line 131
    :goto_4
    if-eqz p0, :cond_a

    .line 132
    .line 133
    move v2, v5

    .line 134
    goto :goto_5

    .line 135
    :cond_a
    move v2, v4

    .line 136
    :goto_5
    if-eqz v10, :cond_b

    .line 137
    .line 138
    move v3, v5

    .line 139
    goto :goto_6

    .line 140
    :cond_b
    move v3, v4

    .line 141
    :goto_6
    if-nez v11, :cond_d

    .line 142
    .line 143
    if-eqz v0, :cond_c

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_c
    move v12, v4

    .line 147
    goto :goto_8

    .line 148
    :cond_d
    :goto_7
    move v12, v5

    .line 149
    :goto_8
    if-eqz v1, :cond_e

    .line 150
    .line 151
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const/16 v4, 0x64

    .line 155
    .line 156
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    move v4, v5

    .line 160
    :cond_e
    const/16 v8, 0x20

    .line 161
    .line 162
    if-nez v2, :cond_f

    .line 163
    .line 164
    if-eqz v1, :cond_11

    .line 165
    .line 166
    if-nez v3, :cond_f

    .line 167
    .line 168
    if-eqz v12, :cond_11

    .line 169
    .line 170
    :cond_f
    add-int/lit8 v9, v4, 0x1

    .line 171
    .line 172
    if-lez v4, :cond_10

    .line 173
    .line 174
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    :cond_10
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const/16 p0, 0x68

    .line 181
    .line 182
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    move v4, v9

    .line 186
    :cond_11
    if-nez v3, :cond_12

    .line 187
    .line 188
    if-eqz v12, :cond_14

    .line 189
    .line 190
    if-nez v2, :cond_12

    .line 191
    .line 192
    if-eqz v1, :cond_14

    .line 193
    .line 194
    :cond_12
    add-int/lit8 p0, v4, 0x1

    .line 195
    .line 196
    if-lez v4, :cond_13

    .line 197
    .line 198
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    :cond_13
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const/16 v4, 0x6d

    .line 205
    .line 206
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    move v4, p0

    .line 210
    :cond_14
    if-eqz v12, :cond_1a

    .line 211
    .line 212
    add-int/lit8 p0, v4, 0x1

    .line 213
    .line 214
    if-lez v4, :cond_15

    .line 215
    .line 216
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    :cond_15
    if-nez v11, :cond_16

    .line 220
    .line 221
    if-nez v1, :cond_16

    .line 222
    .line 223
    if-nez v2, :cond_16

    .line 224
    .line 225
    if-eqz v3, :cond_17

    .line 226
    .line 227
    :cond_16
    move v8, v11

    .line 228
    goto :goto_9

    .line 229
    :cond_17
    const v1, 0xf4240

    .line 230
    .line 231
    .line 232
    if-lt v0, v1, :cond_18

    .line 233
    .line 234
    div-int v8, v0, v1

    .line 235
    .line 236
    rem-int v9, v0, v1

    .line 237
    .line 238
    const-string v11, "ms"

    .line 239
    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v10, 0x6

    .line 242
    invoke-static/range {v7 .. v12}, Lfb0;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 243
    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_18
    const/16 v1, 0x3e8

    .line 247
    .line 248
    if-lt v0, v1, :cond_19

    .line 249
    .line 250
    div-int/lit16 v8, v0, 0x3e8

    .line 251
    .line 252
    rem-int/lit16 v9, v0, 0x3e8

    .line 253
    .line 254
    const-string v11, "us"

    .line 255
    .line 256
    const/4 v12, 0x0

    .line 257
    const/4 v10, 0x3

    .line 258
    invoke-static/range {v7 .. v12}, Lfb0;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_19
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v0, "ns"

    .line 266
    .line 267
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    goto :goto_a

    .line 271
    :goto_9
    const-string v11, "s"

    .line 272
    .line 273
    const/4 v12, 0x0

    .line 274
    const/16 v10, 0x9

    .line 275
    .line 276
    move v9, v0

    .line 277
    invoke-static/range {v7 .. v12}, Lfb0;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 278
    .line 279
    .line 280
    :goto_a
    move v4, p0

    .line 281
    :cond_1a
    if-eqz v6, :cond_1b

    .line 282
    .line 283
    if-le v4, v5, :cond_1b

    .line 284
    .line 285
    const/16 p0, 0x28

    .line 286
    .line 287
    invoke-virtual {v7, v5, p0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    const/16 v0, 0x29

    .line 292
    .line 293
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    :cond_1b
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    return-object p0
.end method
