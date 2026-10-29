.class public final Lc92;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lc92;

    .line 4
    .line 5
    const-string v2, "schema"

    .line 6
    .line 7
    const-string v3, "getSchema()Ljava/lang/String;"

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
    const-string v3, "data"

    .line 16
    .line 17
    const-string v5, "getData()Ljava/util/Map;"

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
    sput-object v2, Lc92;->b:[Lu21;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
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
    iput-object p1, p0, Lc92;->a:Ljava/util/Map;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Lb92;
    .locals 4

    .line 1
    new-instance v0, Lb92;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lc92;->b:[Lu21;

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
    iget-object p0, p0, Lc92;->a:Ljava/util/Map;

    .line 13
    .line 14
    invoke-static {p0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    aget-object v2, v2, v3

    .line 22
    .line 23
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/util/Map;

    .line 32
    .line 33
    invoke-direct {v0, v1, p0}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method
