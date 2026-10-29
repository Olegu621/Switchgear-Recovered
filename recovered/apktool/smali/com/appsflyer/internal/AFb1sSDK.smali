.class public final Lcom/appsflyer/internal/AFb1sSDK;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFb1sSDK;",
        "",
        "Lcom/appsflyer/internal/AFh1mSDK;",
        "event",
        "",
        "rawData",
        "<init>",
        "(Lcom/appsflyer/internal/AFh1mSDK;[B)V",
        "",
        "afInfoLog",
        "()V",
        "AFAdRevenueData",
        "Lcom/appsflyer/internal/AFh1mSDK;",
        "getCurrencyIso4217Code",
        "getRevenue",
        "[B"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AFAdRevenueData:Lcom/appsflyer/internal/AFh1mSDK;

.field private final getRevenue:[B


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFh1mSDK;[B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1sSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFh1mSDK;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/appsflyer/internal/AFb1sSDK;->getRevenue:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final afInfoLog()V
    .locals 11

    .line 1
    const v0, 0x7dfc659b

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, -0x76de88c2

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :try_start_0
    sget-object v2, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    const v5, 0xe39f

    .line 23
    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v6}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    const-wide/16 v9, 0x0

    .line 34
    .line 35
    cmpl-double v3, v7, v9

    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x58

    .line 38
    .line 39
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    shr-int/lit8 v7, v7, 0x10

    .line 44
    .line 45
    sub-int v7, v5, v7

    .line 46
    .line 47
    int-to-char v7, v7

    .line 48
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    const/4 v9, 0x0

    .line 53
    cmpl-float v8, v8, v9

    .line 54
    .line 55
    rsub-int/lit8 v8, v8, 0x25

    .line 56
    .line 57
    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :goto_0
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    iget-object v3, p0, Lcom/appsflyer/internal/AFb1sSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFh1mSDK;

    .line 77
    .line 78
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1sSDK;->getRevenue:[B

    .line 79
    .line 80
    const/4 v4, 0x2

    .line 81
    :try_start_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    aput-object p0, v4, v7

    .line 85
    .line 86
    aput-object v3, v4, v6

    .line 87
    .line 88
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eqz p0, :cond_1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    const/16 p0, 0x30

    .line 96
    .line 97
    invoke-static {p0}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    rsub-int p0, p0, 0x88

    .line 102
    .line 103
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    shr-int/lit8 v3, v3, 0x10

    .line 108
    .line 109
    sub-int/2addr v5, v3

    .line 110
    int-to-char v3, v5

    .line 111
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    shr-int/lit8 v5, v5, 0x10

    .line 116
    .line 117
    rsub-int/lit8 v5, v5, 0x25

    .line 118
    .line 119
    invoke-static {p0, v3, v5}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Ljava/lang/Class;

    .line 124
    .line 125
    const-string v3, "getMonetizationNetwork"

    .line 126
    .line 127
    const-class v5, Lcom/appsflyer/internal/AFh1mSDK;

    .line 128
    .line 129
    const-class v6, [B

    .line 130
    .line 131
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {p0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :goto_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-virtual {p0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :catchall_0
    move-exception p0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    throw v0

    .line 156
    :cond_2
    throw p0
.end method
