.class public abstract Lcom/quago/mobile/sdk/g;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(I)I
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_0

    .line 8
    .line 9
    sparse-switch p0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :sswitch_0
    const/16 p0, 0xb

    .line 15
    .line 16
    return p0

    .line 17
    :sswitch_1
    const/16 p0, 0xa

    .line 18
    .line 19
    return p0

    .line 20
    :sswitch_2
    const/4 p0, 0x6

    .line 21
    return p0

    .line 22
    :sswitch_3
    const/4 p0, 0x4

    .line 23
    return p0

    .line 24
    :sswitch_4
    const/4 p0, 0x3

    .line 25
    return p0

    .line 26
    :sswitch_5
    const/4 p0, 0x7

    .line 27
    return p0

    .line 28
    :sswitch_6
    return v0

    .line 29
    :sswitch_7
    const/16 p0, 0x15

    .line 30
    .line 31
    return p0

    .line 32
    :sswitch_8
    const/4 p0, 0x5

    .line 33
    return p0

    .line 34
    :sswitch_9
    const/16 p0, 0x8

    .line 35
    .line 36
    return p0

    .line 37
    :sswitch_a
    return v1

    .line 38
    :sswitch_b
    const/16 p0, 0xc

    .line 39
    .line 40
    return p0

    .line 41
    :sswitch_c
    const/16 p0, 0xd

    .line 42
    .line 43
    return p0

    .line 44
    :sswitch_d
    const/16 p0, 0x9

    .line 45
    .line 46
    return p0

    .line 47
    :sswitch_e
    const/16 p0, 0x12

    .line 48
    .line 49
    return p0

    .line 50
    :sswitch_f
    const/16 p0, 0x13

    .line 51
    .line 52
    return p0

    .line 53
    :sswitch_10
    const/16 p0, 0xf

    .line 54
    .line 55
    return p0

    .line 56
    :sswitch_11
    const/16 p0, 0xe

    .line 57
    .line 58
    return p0

    .line 59
    :sswitch_12
    const/16 p0, 0x16

    .line 60
    .line 61
    return p0

    .line 62
    :cond_0
    const/16 p0, 0x10

    .line 63
    .line 64
    return p0

    .line 65
    :cond_1
    const/16 p0, 0x14

    .line 66
    .line 67
    return p0

    .line 68
    :cond_2
    const/16 p0, 0x11

    .line 69
    .line 70
    return p0

    .line 71
    :sswitch_data_0
    .sparse-switch
        -0x100 -> :sswitch_12
        0x4 -> :sswitch_11
        0x8 -> :sswitch_10
        0x10 -> :sswitch_f
        0xff -> :sswitch_e
        0x101 -> :sswitch_d
        0x201 -> :sswitch_c
        0x401 -> :sswitch_b
        0x1002 -> :sswitch_a
        0x2002 -> :sswitch_9
        0x4002 -> :sswitch_8
        0xc002 -> :sswitch_7
        0x10004 -> :sswitch_6
        0x20004 -> :sswitch_5
        0x100008 -> :sswitch_4
        0x200000 -> :sswitch_3
        0x400000 -> :sswitch_2
        0x1000010 -> :sswitch_1
        0x2000001 -> :sswitch_0
    .end sparse-switch
.end method

.method public static varargs a([Z)J
    .locals 6

    .line 71
    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-boolean v4, p0, v3

    const/4 v5, 0x1

    shl-long/2addr v1, v5

    int-to-long v4, v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public static b(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method
