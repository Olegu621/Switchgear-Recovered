.class public final Lhy0;
.super Lhw;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic c:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    .line 1
    iput p3, p0, Lhy0;->c:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length p3, p1

    .line 7
    const/16 v0, 0x20

    .line 8
    .line 9
    if-ne p3, v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lis;->c([B)[I

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lhw;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput p2, p0, Lhw;->a:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    .line 21
    .line 22
    const-string p1, "The key length in bytes must be 32."

    .line 23
    .line 24
    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method


# virtual methods
.method public final c([II)[I
    .locals 12

    .line 1
    iget v0, p0, Lhy0;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/16 v3, 0x10

    .line 6
    .line 7
    const/16 v4, 0xc

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/16 v6, 0xd

    .line 11
    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    array-length v0, p1

    .line 18
    const/4 v8, 0x6

    .line 19
    if-ne v0, v8, :cond_0

    .line 20
    .line 21
    new-array v1, v3, [I

    .line 22
    .line 23
    iget-object p0, p0, Lhw;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, [I

    .line 26
    .line 27
    new-array v0, v3, [I

    .line 28
    .line 29
    sget-object v3, Lis;->a:[I

    .line 30
    .line 31
    array-length v9, v3

    .line 32
    invoke-static {v3, v5, v0, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    array-length v9, v3

    .line 36
    invoke-static {p0, v5, v0, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    aget p0, p1, v5

    .line 40
    .line 41
    aput p0, v0, v4

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    aget p0, p1, p0

    .line 45
    .line 46
    aput p0, v0, v6

    .line 47
    .line 48
    const/4 p0, 0x2

    .line 49
    aget p0, p1, p0

    .line 50
    .line 51
    const/16 v9, 0xe

    .line 52
    .line 53
    aput p0, v0, v9

    .line 54
    .line 55
    aget p0, p1, v2

    .line 56
    .line 57
    const/16 v2, 0xf

    .line 58
    .line 59
    aput p0, v0, v2

    .line 60
    .line 61
    invoke-static {v0}, Lis;->b([I)V

    .line 62
    .line 63
    .line 64
    aget p0, v0, v4

    .line 65
    .line 66
    const/4 v10, 0x4

    .line 67
    aput p0, v0, v10

    .line 68
    .line 69
    aget p0, v0, v6

    .line 70
    .line 71
    const/4 v11, 0x5

    .line 72
    aput p0, v0, v11

    .line 73
    .line 74
    aget p0, v0, v9

    .line 75
    .line 76
    aput p0, v0, v8

    .line 77
    .line 78
    const/4 p0, 0x7

    .line 79
    aget v8, v0, v2

    .line 80
    .line 81
    aput v8, v0, p0

    .line 82
    .line 83
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    array-length v0, v3

    .line 88
    invoke-static {v3, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    array-length v0, v3

    .line 92
    invoke-static {p0, v5, v1, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    .line 94
    .line 95
    aput p2, v1, v4

    .line 96
    .line 97
    aput v5, v1, v6

    .line 98
    .line 99
    aget p0, p1, v10

    .line 100
    .line 101
    aput p0, v1, v9

    .line 102
    .line 103
    aget p0, p1, v11

    .line 104
    .line 105
    aput p0, v1, v2

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    array-length p0, p1

    .line 109
    mul-int/lit8 p0, p0, 0x20

    .line 110
    .line 111
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string p1, "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"

    .line 120
    .line 121
    invoke-static {p1, p0}, Lio/sentry/u2;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :goto_0
    return-object v1

    .line 125
    :pswitch_0
    array-length v0, p1

    .line 126
    if-ne v0, v2, :cond_1

    .line 127
    .line 128
    new-array v1, v3, [I

    .line 129
    .line 130
    iget-object p0, p0, Lhw;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, [I

    .line 133
    .line 134
    sget-object v0, Lis;->a:[I

    .line 135
    .line 136
    array-length v2, v0

    .line 137
    invoke-static {v0, v5, v1, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 138
    .line 139
    .line 140
    array-length v0, v0

    .line 141
    invoke-static {p0, v5, v1, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    .line 143
    .line 144
    aput p2, v1, v4

    .line 145
    .line 146
    array-length p0, p1

    .line 147
    invoke-static {p1, v5, v1, v6, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    array-length p0, p1

    .line 152
    mul-int/lit8 p0, p0, 0x20

    .line 153
    .line 154
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const-string p1, "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"

    .line 163
    .line 164
    invoke-static {p1, p0}, Lio/sentry/u2;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    return-object v1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 0

    .line 1
    iget p0, p0, Lhy0;->c:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x18

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0xc

    .line 10
    .line 11
    return p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
