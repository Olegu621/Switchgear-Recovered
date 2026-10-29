.class public final Luf1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic g:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:Lhk2;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Map;

.field public final f:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Luf1;

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    const-string v3, "getId()Ljava/lang/String;"

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
    const-string v3, "pings"

    .line 16
    .line 17
    const-string v5, "getPings()Z"

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
    const-string v5, "pingInterval"

    .line 26
    .line 27
    const-string v6, "getPingInterval()Ljava/lang/Integer;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "maxPausedPings"

    .line 35
    .line 36
    const-string v7, "getMaxPausedPings()Ljava/lang/Integer;"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lsy1;

    .line 42
    .line 43
    const-string v7, "session"

    .line 44
    .line 45
    const-string v8, "getSession()Z"

    .line 46
    .line 47
    invoke-direct {v6, v1, v7, v8, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    new-instance v7, Lsy1;

    .line 51
    .line 52
    const-string v8, "boundaries"

    .line 53
    .line 54
    const-string v9, "getBoundaries()Ljava/util/List;"

    .line 55
    .line 56
    invoke-direct {v7, v1, v8, v9, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lsy1;

    .line 60
    .line 61
    const-string v9, "contexts"

    .line 62
    .line 63
    const-string v10, "getContexts()Ljava/util/List;"

    .line 64
    .line 65
    invoke-direct {v8, v1, v9, v10, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x7

    .line 69
    new-array v1, v1, [Lu21;

    .line 70
    .line 71
    aput-object v0, v1, v4

    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    aput-object v2, v1, v0

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    aput-object v3, v1, v0

    .line 78
    .line 79
    const/4 v0, 0x3

    .line 80
    aput-object v5, v1, v0

    .line 81
    .line 82
    const/4 v0, 0x4

    .line 83
    aput-object v6, v1, v0

    .line 84
    .line 85
    const/4 v0, 0x5

    .line 86
    aput-object v7, v1, v0

    .line 87
    .line 88
    const/4 v0, 0x6

    .line 89
    aput-object v8, v1, v0

    .line 90
    .line 91
    sput-object v1, Luf1;->g:[Lu21;

    .line 92
    .line 93
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbz;

    .line 5
    .line 6
    const/16 v1, 0xd

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lbz;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lmc1;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Luf1;->a:Ljava/util/Map;

    .line 16
    .line 17
    iput-object p1, p0, Luf1;->b:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, Lod;

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    invoke-direct {v0, p1, v1}, Lod;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Luf1;->c:Lhk2;

    .line 30
    .line 31
    iput-object p1, p0, Luf1;->d:Ljava/util/Map;

    .line 32
    .line 33
    iput-object p1, p0, Luf1;->e:Ljava/util/Map;

    .line 34
    .line 35
    new-instance p1, Lod;

    .line 36
    .line 37
    const/4 v0, 0x7

    .line 38
    invoke-direct {p1, p0, v0}, Lod;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Luf1;->f:Lhk2;

    .line 46
    .line 47
    return-void
.end method
