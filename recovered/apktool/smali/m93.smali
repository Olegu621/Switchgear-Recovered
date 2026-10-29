.class public final Lm93;
.super Le4;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static J(Lr4;Lfs0;Ljava/lang/Integer;)Lm93;
    .locals 4

    .line 1
    iget-object p1, p1, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lwl;

    .line 4
    .line 5
    sget-object v0, Lr4;->t:Lr4;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p1, "For given Variant "

    .line 14
    .line 15
    const-string p2, " the value of idRequirement must be non-null"

    .line 16
    .line 17
    invoke-static {p0, p1, p2}, Lds0;->v(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    :goto_0
    if-ne p0, v0, :cond_3

    .line 22
    .line 23
    if-nez p2, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const-string p0, "For given Variant NO_PREFIX the value of idRequirement must be null"

    .line 27
    .line 28
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_3
    :goto_1
    iget-object v2, p1, Lwl;->a:[B

    .line 33
    .line 34
    array-length v2, v2

    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    if-ne v2, v3, :cond_7

    .line 38
    .line 39
    new-instance p1, Lm93;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    if-ne p0, v0, :cond_4

    .line 43
    .line 44
    new-array p0, v2, [B

    .line 45
    .line 46
    invoke-static {p0}, Lwl;->a([B)Lwl;

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    sget-object v0, Lr4;->s:Lr4;

    .line 51
    .line 52
    const/4 v3, 0x5

    .line 53
    if-ne p0, v0, :cond_5

    .line 54
    .line 55
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lwl;->a([B)Lwl;

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    sget-object v0, Lr4;->r:Lr4;

    .line 80
    .line 81
    if-ne p0, v0, :cond_6

    .line 82
    .line 83
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lwl;->a([B)Lwl;

    .line 105
    .line 106
    .line 107
    :goto_2
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_6
    const-string p1, "Unknown Variant: "

    .line 112
    .line 113
    invoke-static {p0, p1}, Lds0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 118
    .line 119
    iget-object p1, p1, Lwl;->a:[B

    .line 120
    .line 121
    array-length p1, p1

    .line 122
    new-instance p2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v0, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "

    .line 125
    .line 126
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0
.end method
