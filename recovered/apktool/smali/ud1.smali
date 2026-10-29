.class public final Lud1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic d:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lud1;

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    const-string v3, "getName()Ljava/lang/String;"

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
    const-string v3, "breakId"

    .line 16
    .line 17
    const-string v5, "getBreakId()Ljava/lang/String;"

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
    const-string v5, "breakType"

    .line 26
    .line 27
    const-string v6, "getBreakType()Ljava/lang/String;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "podSize"

    .line 35
    .line 36
    const-string v7, "getPodSize()Ljava/lang/Integer;"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    new-array v1, v1, [Lu21;

    .line 43
    .line 44
    aput-object v0, v1, v4

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    aput-object v2, v1, v0

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    aput-object v3, v1, v0

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    aput-object v5, v1, v0

    .line 54
    .line 55
    sput-object v1, Lud1;->d:[Lu21;

    .line 56
    .line 57
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
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, Lbz;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lmc1;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lud1;->a:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p1, p0, Lud1;->b:Ljava/util/Map;

    .line 17
    .line 18
    new-instance p1, Lod;

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    invoke-direct {p1, p0, v0}, Lod;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lud1;->c:Lhk2;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Ltd1;
    .locals 6

    .line 1
    new-instance v0, Ltd1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lud1;->d:[Lu21;

    .line 5
    .line 6
    aget-object v1, v2, v1

    .line 7
    .line 8
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v3, p0, Lud1;->b:Ljava/util/Map;

    .line 13
    .line 14
    invoke-static {v3, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aget-object v3, v2, v3

    .line 22
    .line 23
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, Lud1;->a:Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {v4, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    iget-object p0, p0, Lud1;->c:Lhk2;

    .line 36
    .line 37
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lwd1;

    .line 42
    .line 43
    const/4 v5, 0x3

    .line 44
    aget-object v2, v2, v5

    .line 45
    .line 46
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v4, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, v0, Ltd1;->a:Ljava/lang/String;

    .line 63
    .line 64
    iput-object v3, v0, Ltd1;->b:Ljava/lang/String;

    .line 65
    .line 66
    iput-object p0, v0, Ltd1;->c:Lwd1;

    .line 67
    .line 68
    iput-object v2, v0, Ltd1;->d:Ljava/lang/Integer;

    .line 69
    .line 70
    return-object v0
.end method
