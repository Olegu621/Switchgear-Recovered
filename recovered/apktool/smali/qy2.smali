.class public final Lqy2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic e:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lhk2;

.field public final c:Lhk2;

.field public final d:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lqy2;

    .line 4
    .line 5
    const-string v2, "tracker"

    .line 6
    .line 7
    const-string v3, "getTracker()Ljava/lang/String;"

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
    const-string v3, "mediaTrackingId"

    .line 16
    .line 17
    const-string v5, "getMediaTrackingId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-static {v2, v1, v3, v5, v4}, Lfm0;->d(Lk22;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lsy1;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x2

    .line 24
    new-array v2, v2, [Lu21;

    .line 25
    .line 26
    aput-object v0, v2, v4

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    aput-object v1, v2, v0

    .line 30
    .line 31
    sput-object v2, Lqy2;->e:[Lu21;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqy2;->a:Ljava/util/Map;

    .line 5
    .line 6
    new-instance p1, Lpy2;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lpy2;-><init>(Lqy2;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lqy2;->b:Lhk2;

    .line 17
    .line 18
    new-instance p1, Lpy2;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p0, v0}, Lpy2;-><init>(Lqy2;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lqy2;->c:Lhk2;

    .line 29
    .line 30
    new-instance p1, Lpy2;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, v0}, Lpy2;-><init>(Lqy2;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lqy2;->d:Lhk2;

    .line 41
    .line 42
    return-void
.end method
