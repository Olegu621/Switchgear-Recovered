.class public final synthetic Ln4;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfx1;
.implements Lq31;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Luw1;
.implements Lnw0;
.implements Lfy;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Ln4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcb;)V
    .locals 0

    .line 1
    const/16 p1, 0x15

    .line 2
    .line 3
    iput p1, p0, Ln4;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b()V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/EOFException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static e(I)V
    .locals 2

    .line 1
    new-instance v0, Lq11;

    .line 2
    .line 3
    const-string v1, "An unknown field for index "

    .line 4
    .line 5
    invoke-static {p0, v1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public static synthetic g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic h(Ljava/lang/Object;J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\\n not found: limit="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, " content="

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x2026

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Ljava/io/EOFException;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public static synthetic i(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public static synthetic j(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic k(Ljava/lang/String;FLjava/lang/Object;F)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, ")"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public static synthetic l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    invoke-direct {p1, p0, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public static synthetic m(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 9
    .line 10
    invoke-direct {p1, p0, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public static synthetic n(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic o()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic p(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public static synthetic q(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic r(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public static synthetic s(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic t(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method


# virtual methods
.method public a(Lde3;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Llu;

    .line 2
    .line 3
    check-cast p1, Lk4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-static {p1}, Lpm2;->a(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Can not use AES-CMAC in FIPS-mode."

    .line 17
    .line 18
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public c(Lxy1;)Lde3;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ln4;->a:I

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const-string v3, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 10
    .line 11
    const/16 v4, 0x18

    .line 12
    .line 13
    const/16 v5, 0x10

    .line 14
    .line 15
    const/16 v6, 0x20

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    const-string v8, "Unable to parse OutputPrefixType: "

    .line 19
    .line 20
    const/4 v9, 0x4

    .line 21
    const/4 v10, 0x3

    .line 22
    const/4 v11, 0x2

    .line 23
    const-string v12, "Only version 0 keys are accepted"

    .line 24
    .line 25
    const/16 v13, 0xc

    .line 26
    .line 27
    const/4 v14, 0x0

    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    const-string v2, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    :try_start_0
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lvl;

    .line 46
    .line 47
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, v2}, Lcs;->B(Lvl;Ldg0;)Lcs;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcs;->z()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    iget-object v2, v1, Lxy1;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lwq1;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eq v3, v7, :cond_3

    .line 70
    .line 71
    if-eq v3, v11, :cond_2

    .line 72
    .line 73
    if-eq v3, v10, :cond_1

    .line 74
    .line 75
    if-ne v3, v9, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 79
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lwq1;->b()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_1
    sget-object v2, Lc5;->m:Lc5;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    :goto_0
    sget-object v2, Lc5;->l:Lc5;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v2, Lc5;->k:Lc5;

    .line 107
    .line 108
    :goto_1
    invoke-virtual {v0}, Lcs;->y()Lvl;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lvl;->e()[B

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v3, Lfs0;

    .line 117
    .line 118
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {v3, v0, v13}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-static {v2, v3, v0}, Lds;->J(Lc5;Lfs0;Ljava/lang/Integer;)Lds;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 135
    .line 136
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v0
    :try_end_0
    .catch Lpz0; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :catch_0
    const-string v0, "Parsing ChaCha20Poly1305Key failed"

    .line 141
    .line 142
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    const-string v0, "Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters"

    .line 147
    .line 148
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :goto_2
    return-object v14

    .line 152
    :pswitch_0
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Ljava/lang/String;

    .line 155
    .line 156
    const-string v2, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_b

    .line 163
    .line 164
    :try_start_1
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Lvl;

    .line 167
    .line 168
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v0, v2}, Lq6;->B(Lvl;Ldg0;)Lq6;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Lq6;->z()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_a

    .line 181
    .line 182
    invoke-virtual {v0}, Lq6;->y()Lvl;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v2}, Lvl;->size()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eq v2, v6, :cond_7

    .line 191
    .line 192
    const/16 v3, 0x30

    .line 193
    .line 194
    if-eq v2, v3, :cond_7

    .line 195
    .line 196
    const/16 v3, 0x40

    .line 197
    .line 198
    if-ne v2, v3, :cond_6

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 202
    .line 203
    const-string v1, "Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported"

    .line 204
    .line 205
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v0

    .line 221
    :cond_7
    :goto_3
    iget-object v3, v1, Lxy1;->f:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v3, Lwq1;

    .line 224
    .line 225
    sget-object v4, Lw6;->e:Ljava/util/Map;

    .line 226
    .line 227
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_9

    .line 232
    .line 233
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, Lu6;

    .line 238
    .line 239
    if-eqz v3, :cond_8

    .line 240
    .line 241
    new-instance v4, Lv6;

    .line 242
    .line 243
    invoke-direct {v4, v2, v3}, Lv6;-><init>(ILu6;)V

    .line 244
    .line 245
    .line 246
    new-instance v2, Lec;

    .line 247
    .line 248
    const/4 v3, 0x7

    .line 249
    invoke-direct {v2, v3}, Lec;-><init>(I)V

    .line 250
    .line 251
    .line 252
    iput-object v14, v2, Lec;->c:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v14, v2, Lec;->d:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v4, v2, Lec;->b:Ljava/lang/Object;

    .line 257
    .line 258
    invoke-virtual {v0}, Lq6;->y()Lvl;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Lvl;->e()[B

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v3, Lfs0;

    .line 267
    .line 268
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v3, v0, v13}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 273
    .line 274
    .line 275
    iput-object v3, v2, Lec;->c:Ljava/lang/Object;

    .line 276
    .line 277
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Ljava/lang/Integer;

    .line 280
    .line 281
    iput-object v0, v2, Lec;->d:Ljava/lang/Object;

    .line 282
    .line 283
    invoke-virtual {v2}, Lec;->l()Lr6;

    .line 284
    .line 285
    .line 286
    move-result-object v14

    .line 287
    goto :goto_4

    .line 288
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 289
    .line 290
    const-string v1, "Variant is not set"

    .line 291
    .line 292
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 297
    .line 298
    new-instance v1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3}, Lwq1;->b()I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 319
    .line 320
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v0
    :try_end_1
    .catch Lpz0; {:try_start_1 .. :try_end_1} :catch_1

    .line 324
    :catch_1
    const-string v0, "Parsing AesSivKey failed"

    .line 325
    .line 326
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_b
    const-string v0, "Wrong type URL in call to AesSivParameters.parseParameters"

    .line 331
    .line 332
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :goto_4
    return-object v14

    .line 336
    :pswitch_1
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Ljava/lang/String;

    .line 339
    .line 340
    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 341
    .line 342
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_13

    .line 347
    .line 348
    :try_start_2
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, Lvl;

    .line 351
    .line 352
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-static {v0, v2}, Li6;->B(Lvl;Ldg0;)Li6;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v0}, Li6;->z()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-nez v2, :cond_12

    .line 365
    .line 366
    sget-object v2, Ld5;->v:Ld5;

    .line 367
    .line 368
    invoke-virtual {v0}, Li6;->y()Lvl;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-virtual {v3}, Lvl;->size()I

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    if-eq v3, v5, :cond_d

    .line 377
    .line 378
    if-ne v3, v6, :cond_c

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :cond_c
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 382
    .line 383
    const-string v1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    .line 384
    .line 385
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :cond_d
    :goto_5
    iget-object v4, v1, Lxy1;->f:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v4, Lwq1;

    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    if-eq v5, v7, :cond_10

    .line 410
    .line 411
    if-eq v5, v11, :cond_f

    .line 412
    .line 413
    if-eq v5, v10, :cond_11

    .line 414
    .line 415
    if-ne v5, v9, :cond_e

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 419
    .line 420
    new-instance v1, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4}, Lwq1;->b()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_f
    :goto_6
    sget-object v2, Ld5;->i:Ld5;

    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_10
    sget-object v2, Ld5;->f:Ld5;

    .line 444
    .line 445
    :cond_11
    :goto_7
    new-instance v4, Lm6;

    .line 446
    .line 447
    invoke-direct {v4, v3, v2}, Lm6;-><init>(ILd5;)V

    .line 448
    .line 449
    .line 450
    new-instance v2, Lec;

    .line 451
    .line 452
    const/4 v3, 0x6

    .line 453
    invoke-direct {v2, v3}, Lec;-><init>(I)V

    .line 454
    .line 455
    .line 456
    iput-object v14, v2, Lec;->c:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v14, v2, Lec;->d:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v4, v2, Lec;->b:Ljava/lang/Object;

    .line 461
    .line 462
    invoke-virtual {v0}, Li6;->y()Lvl;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Lvl;->e()[B

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    new-instance v3, Lfs0;

    .line 471
    .line 472
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-direct {v3, v0, v13}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 477
    .line 478
    .line 479
    iput-object v3, v2, Lec;->c:Ljava/lang/Object;

    .line 480
    .line 481
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Ljava/lang/Integer;

    .line 484
    .line 485
    iput-object v0, v2, Lec;->d:Ljava/lang/Object;

    .line 486
    .line 487
    invoke-virtual {v2}, Lec;->k()Lj6;

    .line 488
    .line 489
    .line 490
    move-result-object v14

    .line 491
    goto :goto_8

    .line 492
    :cond_12
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 493
    .line 494
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    throw v0
    :try_end_2
    .catch Lpz0; {:try_start_2 .. :try_end_2} :catch_2

    .line 498
    :catch_2
    const-string v0, "Parsing AesGcmSivKey failed"

    .line 499
    .line 500
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    goto :goto_8

    .line 504
    :cond_13
    const-string v0, "Wrong type URL in call to AesGcmSivParameters.parseParameters"

    .line 505
    .line 506
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    :goto_8
    return-object v14

    .line 510
    :pswitch_2
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v0, Ljava/lang/String;

    .line 513
    .line 514
    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 515
    .line 516
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_1b

    .line 521
    .line 522
    :try_start_3
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Lvl;

    .line 525
    .line 526
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-static {v0, v2}, La6;->B(Lvl;Ldg0;)La6;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, La6;->z()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-nez v2, :cond_1a

    .line 539
    .line 540
    sget-object v2, Lc5;->j:Lc5;

    .line 541
    .line 542
    invoke-virtual {v0}, La6;->y()Lvl;

    .line 543
    .line 544
    .line 545
    move-result-object v12

    .line 546
    invoke-virtual {v12}, Lvl;->size()I

    .line 547
    .line 548
    .line 549
    move-result v12

    .line 550
    if-eq v12, v5, :cond_15

    .line 551
    .line 552
    if-eq v12, v4, :cond_15

    .line 553
    .line 554
    if-ne v12, v6, :cond_14

    .line 555
    .line 556
    goto :goto_9

    .line 557
    :cond_14
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 558
    .line 559
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v0

    .line 575
    :cond_15
    :goto_9
    iget-object v3, v1, Lxy1;->f:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v3, Lwq1;

    .line 578
    .line 579
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eq v4, v7, :cond_18

    .line 584
    .line 585
    if-eq v4, v11, :cond_17

    .line 586
    .line 587
    if-eq v4, v10, :cond_19

    .line 588
    .line 589
    if-ne v4, v9, :cond_16

    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_16
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 593
    .line 594
    new-instance v1, Ljava/lang/StringBuilder;

    .line 595
    .line 596
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v3}, Lwq1;->b()I

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    throw v0

    .line 614
    :cond_17
    :goto_a
    sget-object v2, Lc5;->i:Lc5;

    .line 615
    .line 616
    goto :goto_b

    .line 617
    :cond_18
    sget-object v2, Lc5;->h:Lc5;

    .line 618
    .line 619
    :cond_19
    :goto_b
    new-instance v3, Le6;

    .line 620
    .line 621
    invoke-direct {v3, v12, v13, v5, v2}, Le6;-><init>(IIILc5;)V

    .line 622
    .line 623
    .line 624
    new-instance v2, Lec;

    .line 625
    .line 626
    const/4 v4, 0x5

    .line 627
    invoke-direct {v2, v4}, Lec;-><init>(I)V

    .line 628
    .line 629
    .line 630
    iput-object v14, v2, Lec;->c:Ljava/lang/Object;

    .line 631
    .line 632
    iput-object v14, v2, Lec;->d:Ljava/lang/Object;

    .line 633
    .line 634
    iput-object v3, v2, Lec;->b:Ljava/lang/Object;

    .line 635
    .line 636
    invoke-virtual {v0}, La6;->y()Lvl;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v0}, Lvl;->e()[B

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    new-instance v3, Lfs0;

    .line 645
    .line 646
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-direct {v3, v0, v13}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 651
    .line 652
    .line 653
    iput-object v3, v2, Lec;->c:Ljava/lang/Object;

    .line 654
    .line 655
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Ljava/lang/Integer;

    .line 658
    .line 659
    iput-object v0, v2, Lec;->d:Ljava/lang/Object;

    .line 660
    .line 661
    invoke-virtual {v2}, Lec;->j()Lb6;

    .line 662
    .line 663
    .line 664
    move-result-object v14

    .line 665
    goto :goto_c

    .line 666
    :cond_1a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 667
    .line 668
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    throw v0
    :try_end_3
    .catch Lpz0; {:try_start_3 .. :try_end_3} :catch_3

    .line 672
    :catch_3
    const-string v0, "Parsing AesGcmKey failed"

    .line 673
    .line 674
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    goto :goto_c

    .line 678
    :cond_1b
    const-string v0, "Wrong type URL in call to AesGcmParameters.parseParameters"

    .line 679
    .line 680
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    :goto_c
    return-object v14

    .line 684
    :pswitch_3
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Ljava/lang/String;

    .line 687
    .line 688
    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 689
    .line 690
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    if-eqz v0, :cond_25

    .line 695
    .line 696
    :try_start_4
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v0, Lvl;

    .line 699
    .line 700
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    invoke-static {v0, v2}, Lq5;->D(Lvl;Ldg0;)Lq5;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-virtual {v0}, Lq5;->B()I

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    if-nez v2, :cond_24

    .line 713
    .line 714
    sget-object v2, Lr4;->i:Lr4;

    .line 715
    .line 716
    invoke-virtual {v0}, Lq5;->z()Lvl;

    .line 717
    .line 718
    .line 719
    move-result-object v12

    .line 720
    invoke-virtual {v12}, Lvl;->size()I

    .line 721
    .line 722
    .line 723
    move-result v12

    .line 724
    if-eq v12, v5, :cond_1d

    .line 725
    .line 726
    if-eq v12, v4, :cond_1d

    .line 727
    .line 728
    if-ne v12, v6, :cond_1c

    .line 729
    .line 730
    goto :goto_d

    .line 731
    :cond_1c
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 732
    .line 733
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    throw v0

    .line 749
    :cond_1d
    :goto_d
    invoke-virtual {v0}, Lq5;->A()Lw5;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    invoke-virtual {v3}, Lw5;->y()I

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-eq v3, v13, :cond_1f

    .line 758
    .line 759
    if-ne v3, v5, :cond_1e

    .line 760
    .line 761
    goto :goto_e

    .line 762
    :cond_1e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 763
    .line 764
    const-string v1, "Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes"

    .line 765
    .line 766
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    throw v0

    .line 782
    :cond_1f
    :goto_e
    iget-object v4, v1, Lxy1;->f:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v4, Lwq1;

    .line 785
    .line 786
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 787
    .line 788
    .line 789
    move-result v6

    .line 790
    if-eq v6, v7, :cond_22

    .line 791
    .line 792
    if-eq v6, v11, :cond_21

    .line 793
    .line 794
    if-eq v6, v10, :cond_23

    .line 795
    .line 796
    if-ne v6, v9, :cond_20

    .line 797
    .line 798
    goto :goto_f

    .line 799
    :cond_20
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 800
    .line 801
    new-instance v1, Ljava/lang/StringBuilder;

    .line 802
    .line 803
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v4}, Lwq1;->b()I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    throw v0

    .line 821
    :cond_21
    :goto_f
    sget-object v2, Lr4;->h:Lr4;

    .line 822
    .line 823
    goto :goto_10

    .line 824
    :cond_22
    sget-object v2, Lr4;->g:Lr4;

    .line 825
    .line 826
    :cond_23
    :goto_10
    new-instance v4, Lu5;

    .line 827
    .line 828
    invoke-direct {v4, v12, v3, v5, v2}, Lu5;-><init>(IIILr4;)V

    .line 829
    .line 830
    .line 831
    new-instance v2, Lec;

    .line 832
    .line 833
    invoke-direct {v2, v9}, Lec;-><init>(I)V

    .line 834
    .line 835
    .line 836
    iput-object v14, v2, Lec;->c:Ljava/lang/Object;

    .line 837
    .line 838
    iput-object v14, v2, Lec;->d:Ljava/lang/Object;

    .line 839
    .line 840
    iput-object v4, v2, Lec;->b:Ljava/lang/Object;

    .line 841
    .line 842
    invoke-virtual {v0}, Lq5;->z()Lvl;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    invoke-virtual {v0}, Lvl;->e()[B

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    new-instance v3, Lfs0;

    .line 851
    .line 852
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-direct {v3, v0, v13}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 857
    .line 858
    .line 859
    iput-object v3, v2, Lec;->c:Ljava/lang/Object;

    .line 860
    .line 861
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, Ljava/lang/Integer;

    .line 864
    .line 865
    iput-object v0, v2, Lec;->d:Ljava/lang/Object;

    .line 866
    .line 867
    invoke-virtual {v2}, Lec;->i()Lr5;

    .line 868
    .line 869
    .line 870
    move-result-object v14

    .line 871
    goto :goto_11

    .line 872
    :cond_24
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 873
    .line 874
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    throw v0
    :try_end_4
    .catch Lpz0; {:try_start_4 .. :try_end_4} :catch_4

    .line 878
    :catch_4
    const-string v0, "Parsing AesEaxcKey failed"

    .line 879
    .line 880
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    goto :goto_11

    .line 884
    :cond_25
    const-string v0, "Wrong type URL in call to AesEaxParameters.parseParameters"

    .line 885
    .line 886
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    :goto_11
    return-object v14

    .line 890
    :pswitch_4
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v0, Ljava/lang/String;

    .line 893
    .line 894
    const-string v15, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 895
    .line 896
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-eqz v0, :cond_2f

    .line 901
    .line 902
    :try_start_5
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v0, Lvl;

    .line 905
    .line 906
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 907
    .line 908
    .line 909
    move-result-object v15

    .line 910
    invoke-static {v0, v15}, Lx4;->D(Lvl;Ldg0;)Lx4;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-virtual {v0}, Lx4;->B()I

    .line 915
    .line 916
    .line 917
    move-result v15

    .line 918
    if-nez v15, :cond_2e

    .line 919
    .line 920
    new-instance v12, Lb5;

    .line 921
    .line 922
    const/4 v15, 0x0

    .line 923
    invoke-direct {v12, v15}, Lb5;-><init>(I)V

    .line 924
    .line 925
    .line 926
    iput-object v14, v12, Lb5;->b:Ljava/lang/Object;

    .line 927
    .line 928
    iput-object v14, v12, Lb5;->c:Ljava/lang/Object;

    .line 929
    .line 930
    iput-object v14, v12, Lb5;->d:Ljava/lang/Object;

    .line 931
    .line 932
    iput-object v14, v12, Lb5;->e:Ljava/lang/Object;

    .line 933
    .line 934
    sget-object v15, Ld5;->e:Ld5;

    .line 935
    .line 936
    iput-object v15, v12, Lb5;->f:Ljava/lang/Object;

    .line 937
    .line 938
    invoke-virtual {v0}, Lx4;->z()Lj5;

    .line 939
    .line 940
    .line 941
    move-result-object v16

    .line 942
    invoke-virtual/range {v16 .. v16}, Lj5;->A()Lvl;

    .line 943
    .line 944
    .line 945
    move-result-object v16

    .line 946
    invoke-virtual/range {v16 .. v16}, Lvl;->size()I

    .line 947
    .line 948
    .line 949
    move-result v13

    .line 950
    if-eq v13, v5, :cond_27

    .line 951
    .line 952
    if-eq v13, v4, :cond_27

    .line 953
    .line 954
    if-ne v13, v6, :cond_26

    .line 955
    .line 956
    goto :goto_12

    .line 957
    :cond_26
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 958
    .line 959
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    throw v0

    .line 975
    :cond_27
    :goto_12
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    iput-object v3, v12, Lb5;->b:Ljava/lang/Object;

    .line 980
    .line 981
    invoke-virtual {v0}, Lx4;->A()Lmu0;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    invoke-virtual {v3}, Lmu0;->A()Lvl;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    invoke-virtual {v3}, Lvl;->size()I

    .line 990
    .line 991
    .line 992
    move-result v3

    .line 993
    if-lt v3, v5, :cond_2d

    .line 994
    .line 995
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    iput-object v3, v12, Lb5;->c:Ljava/lang/Object;

    .line 1000
    .line 1001
    invoke-virtual {v0}, Lx4;->A()Lmu0;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v3

    .line 1005
    invoke-virtual {v3}, Lmu0;->B()Lsu0;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    invoke-virtual {v3}, Lsu0;->A()I

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    if-lt v3, v2, :cond_2c

    .line 1014
    .line 1015
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    iput-object v2, v12, Lb5;->d:Ljava/lang/Object;

    .line 1020
    .line 1021
    invoke-virtual {v0}, Lx4;->A()Lmu0;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    invoke-virtual {v2}, Lmu0;->B()Lsu0;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-virtual {v2}, Lsu0;->z()Lst0;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    invoke-static {v2}, Lf5;->a(Lst0;)Lc5;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v2

    .line 1037
    iput-object v2, v12, Lb5;->e:Ljava/lang/Object;

    .line 1038
    .line 1039
    iget-object v2, v1, Lxy1;->f:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v2, Lwq1;

    .line 1042
    .line 1043
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1044
    .line 1045
    .line 1046
    move-result v3

    .line 1047
    if-eq v3, v7, :cond_2a

    .line 1048
    .line 1049
    if-eq v3, v11, :cond_29

    .line 1050
    .line 1051
    if-eq v3, v10, :cond_2b

    .line 1052
    .line 1053
    if-ne v3, v9, :cond_28

    .line 1054
    .line 1055
    goto :goto_13

    .line 1056
    :cond_28
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1057
    .line 1058
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2}, Lwq1;->b()I

    .line 1064
    .line 1065
    .line 1066
    move-result v2

    .line 1067
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    throw v0

    .line 1078
    :cond_29
    :goto_13
    sget-object v15, Ld5;->d:Ld5;

    .line 1079
    .line 1080
    goto :goto_14

    .line 1081
    :cond_2a
    sget-object v15, Ld5;->c:Ld5;

    .line 1082
    .line 1083
    :cond_2b
    :goto_14
    iput-object v15, v12, Lb5;->f:Ljava/lang/Object;

    .line 1084
    .line 1085
    invoke-virtual {v12}, Lb5;->i()Le5;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    new-instance v3, Lra2;

    .line 1090
    .line 1091
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1092
    .line 1093
    .line 1094
    iput-object v14, v3, Lra2;->b:Ljava/lang/Object;

    .line 1095
    .line 1096
    iput-object v14, v3, Lra2;->c:Ljava/lang/Object;

    .line 1097
    .line 1098
    iput-object v14, v3, Lra2;->d:Ljava/lang/Object;

    .line 1099
    .line 1100
    iput-object v2, v3, Lra2;->a:Ljava/lang/Object;

    .line 1101
    .line 1102
    invoke-virtual {v0}, Lx4;->z()Lj5;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    invoke-virtual {v2}, Lj5;->A()Lvl;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    invoke-virtual {v2}, Lvl;->e()[B

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    new-instance v4, Lfs0;

    .line 1115
    .line 1116
    invoke-static {v2}, Lwl;->a([B)Lwl;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v2

    .line 1120
    const/16 v5, 0xc

    .line 1121
    .line 1122
    invoke-direct {v4, v2, v5}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 1123
    .line 1124
    .line 1125
    iput-object v4, v3, Lra2;->b:Ljava/lang/Object;

    .line 1126
    .line 1127
    invoke-virtual {v0}, Lx4;->A()Lmu0;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-virtual {v0}, Lmu0;->A()Lvl;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-virtual {v0}, Lvl;->e()[B

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    new-instance v2, Lfs0;

    .line 1140
    .line 1141
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    const/16 v5, 0xc

    .line 1146
    .line 1147
    invoke-direct {v2, v0, v5}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 1148
    .line 1149
    .line 1150
    iput-object v2, v3, Lra2;->c:Ljava/lang/Object;

    .line 1151
    .line 1152
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, Ljava/lang/Integer;

    .line 1155
    .line 1156
    iput-object v0, v3, Lra2;->d:Ljava/lang/Object;

    .line 1157
    .line 1158
    invoke-virtual {v3}, Lra2;->a()Ly4;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v14

    .line 1162
    goto :goto_15

    .line 1163
    :cond_2c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1164
    .line 1165
    const-string v1, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 1166
    .line 1167
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v2

    .line 1175
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1180
    .line 1181
    .line 1182
    throw v0

    .line 1183
    :cond_2d
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 1184
    .line 1185
    const-string v1, "Invalid key size in bytes %d; HMAC key must be at least 16 bytes"

    .line 1186
    .line 1187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    throw v0

    .line 1203
    :cond_2e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1204
    .line 1205
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    throw v0
    :try_end_5
    .catch Lpz0; {:try_start_5 .. :try_end_5} :catch_5

    .line 1209
    :catch_5
    const-string v0, "Parsing AesCtrHmacAeadKey failed"

    .line 1210
    .line 1211
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_15

    .line 1215
    :cond_2f
    const-string v0, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    .line 1216
    .line 1217
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    :goto_15
    return-object v14

    .line 1221
    :pswitch_5
    iget-object v0, v1, Lxy1;->a:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast v0, Ljava/lang/String;

    .line 1224
    .line 1225
    const-string v3, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 1226
    .line 1227
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    if-eqz v0, :cond_32

    .line 1232
    .line 1233
    :try_start_6
    iget-object v0, v1, Lxy1;->d:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v0, Lvl;

    .line 1236
    .line 1237
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v3

    .line 1241
    invoke-static {v0, v3}, Lj4;->D(Lvl;Ldg0;)Lj4;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    invoke-virtual {v0}, Lj4;->B()I

    .line 1246
    .line 1247
    .line 1248
    move-result v3

    .line 1249
    if-nez v3, :cond_31

    .line 1250
    .line 1251
    new-instance v3, Lec;

    .line 1252
    .line 1253
    invoke-direct {v3, v10}, Lec;-><init>(I)V

    .line 1254
    .line 1255
    .line 1256
    iput-object v14, v3, Lec;->b:Ljava/lang/Object;

    .line 1257
    .line 1258
    iput-object v14, v3, Lec;->c:Ljava/lang/Object;

    .line 1259
    .line 1260
    sget-object v4, Lr4;->f:Lr4;

    .line 1261
    .line 1262
    iput-object v4, v3, Lec;->d:Ljava/lang/Object;

    .line 1263
    .line 1264
    invoke-virtual {v0}, Lj4;->z()Lvl;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v4

    .line 1268
    invoke-virtual {v4}, Lvl;->size()I

    .line 1269
    .line 1270
    .line 1271
    move-result v4

    .line 1272
    invoke-virtual {v3, v4}, Lec;->M(I)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v0}, Lj4;->A()Lu4;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v4

    .line 1279
    invoke-virtual {v4}, Lu4;->y()I

    .line 1280
    .line 1281
    .line 1282
    move-result v4

    .line 1283
    if-lt v4, v2, :cond_30

    .line 1284
    .line 1285
    if-lt v5, v4, :cond_30

    .line 1286
    .line 1287
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v2

    .line 1291
    iput-object v2, v3, Lec;->c:Ljava/lang/Object;

    .line 1292
    .line 1293
    iget-object v2, v1, Lxy1;->f:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v2, Lwq1;

    .line 1296
    .line 1297
    invoke-static {v2}, Lv4;->a(Lwq1;)Lr4;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    iput-object v2, v3, Lec;->d:Ljava/lang/Object;

    .line 1302
    .line 1303
    invoke-virtual {v3}, Lec;->h()Ls4;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    new-instance v3, Lec;

    .line 1308
    .line 1309
    invoke-direct {v3, v11}, Lec;-><init>(I)V

    .line 1310
    .line 1311
    .line 1312
    iput-object v14, v3, Lec;->c:Ljava/lang/Object;

    .line 1313
    .line 1314
    iput-object v14, v3, Lec;->d:Ljava/lang/Object;

    .line 1315
    .line 1316
    iput-object v2, v3, Lec;->b:Ljava/lang/Object;

    .line 1317
    .line 1318
    invoke-virtual {v0}, Lj4;->z()Lvl;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    invoke-virtual {v0}, Lvl;->e()[B

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    new-instance v2, Lfs0;

    .line 1327
    .line 1328
    invoke-static {v0}, Lwl;->a([B)Lwl;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    const/16 v5, 0xc

    .line 1333
    .line 1334
    invoke-direct {v2, v0, v5}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 1335
    .line 1336
    .line 1337
    iput-object v2, v3, Lec;->c:Ljava/lang/Object;

    .line 1338
    .line 1339
    iget-object v0, v1, Lxy1;->b:Ljava/lang/Object;

    .line 1340
    .line 1341
    check-cast v0, Ljava/lang/Integer;

    .line 1342
    .line 1343
    iput-object v0, v3, Lec;->d:Ljava/lang/Object;

    .line 1344
    .line 1345
    invoke-virtual {v3}, Lec;->g()Lk4;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v14

    .line 1349
    goto :goto_16

    .line 1350
    :cond_30
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1351
    .line 1352
    const-string v1, "Invalid tag size for AesCmacParameters: "

    .line 1353
    .line 1354
    invoke-static {v4, v1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    throw v0

    .line 1362
    :cond_31
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 1363
    .line 1364
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1365
    .line 1366
    .line 1367
    throw v0
    :try_end_6
    .catch Lpz0; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1368
    :catch_6
    const-string v0, "Parsing AesCmacKey failed"

    .line 1369
    .line 1370
    invoke-static {v0}, Lds0;->t(Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    goto :goto_16

    .line 1374
    :cond_32
    const-string v0, "Wrong type URL in call to AesCmacParameters.parseParameters"

    .line 1375
    .line 1376
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 1377
    .line 1378
    .line 1379
    :goto_16
    return-object v14

    .line 1380
    nop

    .line 1381
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public create(Lcy;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance p0, La70;

    .line 2
    .line 3
    const-class v0, Lzf;

    .line 4
    .line 5
    invoke-static {v0}, Lf02;->a(Ljava/lang/Class;)Lf02;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Lb5;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lb5;->a(Lf02;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lgr0;->b:Lgr0;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-class v1, Lgr0;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    sget-object v0, Lgr0;->b:Lgr0;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    new-instance v0, Lgr0;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, v2}, Lgr0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lgr0;->b:Lgr0;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v1

    .line 38
    goto :goto_2

    .line 39
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0

    .line 41
    :cond_1
    :goto_2
    invoke-direct {p0, p1, v0}, La70;-><init>(Ljava/util/Set;Lgr0;)V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public d(Lrj2;)V
    .locals 4

    .line 1
    new-instance p0, Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p1, Lrj2;->b:Landroid/util/Size;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p1, Lrj2;->b:Landroid/util/Size;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Landroid/view/Surface;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lpg3;->g()Lo80;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lnq;

    .line 35
    .line 36
    invoke-direct {v3, v0, v1, p0}, Lnq;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1, v2, v3}, Lrj2;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lc00;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public f(Low0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1}, Low0;->acquireLatestImage()Lmw0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lpg3;->a()V

    .line 8
    .line 9
    .line 10
    const-string p1, "CaptureNode"

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Discarding ImageProxy which was inadvertently acquired: "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p1, v0}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    :cond_0
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string p0, "AppUpdater"

    .line 2
    .line 3
    const-string v0, "Failure when retrieving AppUpdateInfo"

    .line 4
    .line 5
    invoke-static {p0, v0, p1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method
