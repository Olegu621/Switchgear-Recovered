.class public final Lhb0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final a:Lhb0;

.field public static final b:Lkx1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhb0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhb0;->a:Lhb0;

    .line 7
    .line 8
    new-instance v0, Lkx1;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Duration"

    .line 11
    .line 12
    sget-object v2, Lgx1;->s:Lgx1;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lkx1;-><init>(Ljava/lang/String;Lgx1;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lhb0;->b:Lkx1;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object p0, Lfb0;->b:Leb0;

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlinx/serialization/encoding/Decoder;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lmn0;->b(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    new-instance v0, Lfb0;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1}, Lfb0;-><init>(J)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string v1, "Invalid ISO duration string format: \'"

    .line 27
    .line 28
    const-string v2, "\'."

    .line 29
    .line 30
    invoke-static {v1, p1, v2}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lhb0;->b:Lkx1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    check-cast v0, Lfb0;

    .line 4
    .line 5
    iget-wide v0, v0, Lfb0;->a:J

    .line 6
    .line 7
    sget-object v2, Lfb0;->b:Leb0;

    .line 8
    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    cmp-long v2, v0, v4

    .line 17
    .line 18
    if-gez v2, :cond_0

    .line 19
    .line 20
    const/16 v6, 0x2d

    .line 21
    .line 22
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v6, "PT"

    .line 26
    .line 27
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    if-gez v2, :cond_1

    .line 32
    .line 33
    shr-long v7, v0, v6

    .line 34
    .line 35
    neg-long v7, v7

    .line 36
    long-to-int v2, v0

    .line 37
    and-int/2addr v2, v6

    .line 38
    shl-long/2addr v7, v6

    .line 39
    int-to-long v9, v2

    .line 40
    add-long/2addr v7, v9

    .line 41
    sget v2, Lgb0;->a:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-wide v7, v0

    .line 45
    :goto_0
    sget-object v2, Lib0;->f:Lib0;

    .line 46
    .line 47
    invoke-static {v7, v8, v2}, Lfb0;->j(JLib0;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    invoke-static {v7, v8}, Lfb0;->f(J)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const-wide/16 v11, 0x3c

    .line 56
    .line 57
    const/4 v13, 0x0

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    move v2, v13

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    sget-object v2, Lib0;->e:Lib0;

    .line 63
    .line 64
    invoke-static {v7, v8, v2}, Lfb0;->j(JLib0;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v14

    .line 68
    rem-long/2addr v14, v11

    .line 69
    long-to-int v2, v14

    .line 70
    :goto_1
    invoke-static {v7, v8}, Lfb0;->f(J)Z

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    if-eqz v14, :cond_3

    .line 75
    .line 76
    move v11, v13

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    sget-object v14, Lib0;->d:Lib0;

    .line 79
    .line 80
    invoke-static {v7, v8, v14}, Lfb0;->j(JLib0;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v14

    .line 84
    rem-long/2addr v14, v11

    .line 85
    long-to-int v11, v14

    .line 86
    :goto_2
    invoke-static {v7, v8}, Lfb0;->d(J)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-static {v0, v1}, Lfb0;->f(J)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    const-wide v9, 0x9184e729fffL

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :cond_4
    cmp-long v0, v9, v4

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    move v0, v6

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    move v0, v13

    .line 108
    :goto_3
    if-nez v11, :cond_7

    .line 109
    .line 110
    if-eqz v7, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    move v1, v13

    .line 114
    goto :goto_5

    .line 115
    :cond_7
    :goto_4
    move v1, v6

    .line 116
    :goto_5
    if-nez v2, :cond_9

    .line 117
    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_8
    move v6, v13

    .line 124
    :cond_9
    :goto_6
    if-eqz v0, :cond_a

    .line 125
    .line 126
    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const/16 v4, 0x48

    .line 130
    .line 131
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    :cond_a
    if-eqz v6, :cond_b

    .line 135
    .line 136
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const/16 v2, 0x4d

    .line 140
    .line 141
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    :cond_b
    if-nez v1, :cond_c

    .line 145
    .line 146
    if-nez v0, :cond_d

    .line 147
    .line 148
    if-nez v6, :cond_d

    .line 149
    .line 150
    :cond_c
    move v5, v7

    .line 151
    const-string v7, "S"

    .line 152
    .line 153
    const/4 v8, 0x1

    .line 154
    const/16 v6, 0x9

    .line 155
    .line 156
    move v4, v11

    .line 157
    invoke-static/range {v3 .. v8}, Lfb0;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 158
    .line 159
    .line 160
    :cond_d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    move-object/from16 v1, p1

    .line 165
    .line 166
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/Encoder;->F(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method
