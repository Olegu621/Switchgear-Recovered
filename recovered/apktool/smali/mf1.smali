.class public final Lmf1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lmf1;

    .line 4
    .line 5
    const-string v2, "previousQuality"

    .line 6
    .line 7
    const-string v3, "getPreviousQuality()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lj22;->a:Lk22;

    .line 14
    .line 15
    const-string v3, "newQuality"

    .line 16
    .line 17
    const-string v5, "getNewQuality()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-static {v2, v1, v3, v5, v4}, Lfm0;->d(Lk22;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lsy1;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Lsy1;

    .line 24
    .line 25
    const-string v5, "bitrate"

    .line 26
    .line 27
    const-string v6, "getBitrate()Ljava/lang/Integer;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "framesPerSecond"

    .line 35
    .line 36
    const-string v7, "getFramesPerSecond()Ljava/lang/Integer;"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lsy1;

    .line 42
    .line 43
    const-string v7, "automatic"

    .line 44
    .line 45
    const-string v8, "getAutomatic()Ljava/lang/Boolean;"

    .line 46
    .line 47
    invoke-direct {v6, v1, v7, v8, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x5

    .line 51
    new-array v1, v1, [Lu21;

    .line 52
    .line 53
    aput-object v0, v1, v4

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    aput-object v2, v1, v0

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    aput-object v3, v1, v0

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    aput-object v5, v1, v0

    .line 63
    .line 64
    const/4 v0, 0x4

    .line 65
    aput-object v6, v1, v0

    .line 66
    .line 67
    sput-object v1, Lmf1;->b:[Lu21;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lbz;

    .line 8
    .line 9
    const/16 v1, 0xc

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lbz;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lmc1;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lmf1;->a:Ljava/util/Map;

    .line 19
    .line 20
    return-void
.end method
