.class public final Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/id/scid_plugin/ConversionUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\u000b2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;",
        "",
        "<init>",
        "()V",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "",
        "rowStride",
        "pixelStride",
        "width",
        "height",
        "",
        "out",
        "offset",
        "outputPixelStride",
        "",
        "unpackPlane",
        "(Ljava/nio/ByteBuffer;IIII[BII)V",
        "",
        "Llw0;",
        "planes",
        "YUV_420_888toNV21",
        "([Llw0;II)[B",
        "scid_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final unpackPlane(Ljava/nio/ByteBuffer;IIII[BII)V
    .locals 5

    .line 1
    new-array p0, p2, [B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_0
    if-ge v1, p5, :cond_1

    .line 6
    .line 7
    mul-int v2, v1, p2

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0, v0, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move v2, v0

    .line 16
    move v3, v2

    .line 17
    :goto_1
    if-ge v2, p4, :cond_0

    .line 18
    .line 19
    aget-byte v4, p0, v3

    .line 20
    .line 21
    aput-byte v4, p6, p7

    .line 22
    .line 23
    add-int/2addr p7, p8

    .line 24
    add-int/2addr v3, p3

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method


# virtual methods
.method public final YUV_420_888toNV21([Llw0;II)[B
    .locals 17

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    mul-int v7, v0, v1

    .line 9
    .line 10
    div-int/lit8 v2, v7, 0x4

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    mul-int/2addr v2, v3

    .line 14
    add-int/2addr v2, v7

    .line 15
    new-array v14, v2, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aget-object v4, p1, v2

    .line 19
    .line 20
    invoke-interface {v4}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    aget-object v6, p1, v5

    .line 29
    .line 30
    invoke-interface {v6}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    aget-object v6, p1, v3

    .line 38
    .line 39
    invoke-interface {v6}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    aget-object v8, p1, v2

    .line 47
    .line 48
    invoke-interface {v8}, Llw0;->b()I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    aget-object v10, p1, v5

    .line 53
    .line 54
    invoke-interface {v10}, Llw0;->b()I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    aget-object v5, p1, v5

    .line 59
    .line 60
    invoke-interface {v5}, Llw0;->j()I

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-ne v8, v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {v4, v14, v2, v7}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    move v13, v7

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    move v5, v2

    .line 72
    move v12, v5

    .line 73
    move v13, v12

    .line 74
    :goto_0
    if-ge v5, v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v4, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v14, v13, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    add-int/2addr v13, v0

    .line 83
    add-int/2addr v12, v8

    .line 84
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    :goto_1
    div-int/lit8 v5, v1, 0x2

    .line 88
    .line 89
    div-int/lit8 v12, v0, 0x2

    .line 90
    .line 91
    if-ne v11, v3, :cond_4

    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/nio/Buffer;->remaining()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    mul-int v1, v12, v5

    .line 98
    .line 99
    if-lt v0, v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/nio/Buffer;->remaining()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-lt v0, v1, :cond_4

    .line 106
    .line 107
    move v0, v2

    .line 108
    :goto_2
    if-ge v0, v5, :cond_3

    .line 109
    .line 110
    mul-int v1, v0, v10

    .line 111
    .line 112
    move v3, v2

    .line 113
    :goto_3
    if-ge v3, v12, :cond_2

    .line 114
    .line 115
    mul-int v4, v3, v11

    .line 116
    .line 117
    add-int/2addr v4, v1

    .line 118
    add-int/lit8 v7, v13, 0x1

    .line 119
    .line 120
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    aput-byte v8, v14, v13

    .line 125
    .line 126
    add-int/lit8 v13, v13, 0x2

    .line 127
    .line 128
    invoke-virtual {v9, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    aput-byte v4, v14, v7

    .line 133
    .line 134
    add-int/lit8 v3, v3, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    return-object v14

    .line 141
    :cond_4
    add-int/lit8 v15, v7, 0x1

    .line 142
    .line 143
    const/16 v16, 0x2

    .line 144
    .line 145
    move-object/from16 v8, p0

    .line 146
    .line 147
    move v13, v5

    .line 148
    invoke-direct/range {v8 .. v16}, Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;->unpackPlane(Ljava/nio/ByteBuffer;IIII[BII)V

    .line 149
    .line 150
    .line 151
    move v2, v10

    .line 152
    move v3, v11

    .line 153
    const/4 v8, 0x2

    .line 154
    move-object/from16 v0, p0

    .line 155
    .line 156
    move-object v1, v6

    .line 157
    move v4, v12

    .line 158
    move-object v6, v14

    .line 159
    invoke-direct/range {v0 .. v8}, Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;->unpackPlane(Ljava/nio/ByteBuffer;IIII[BII)V

    .line 160
    .line 161
    .line 162
    return-object v14
.end method
