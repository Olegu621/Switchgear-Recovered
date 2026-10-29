.class public final Lcz;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic c:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lcz;

    .line 4
    .line 5
    const-string v2, "documentId"

    .line 6
    .line 7
    const-string v3, "getDocumentId()Ljava/lang/String;"

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
    const-string v3, "documentVersion"

    .line 16
    .line 17
    const-string v5, "getDocumentVersion()Ljava/lang/String;"

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
    const-string v5, "documentName"

    .line 26
    .line 27
    const-string v6, "getDocumentName()Ljava/lang/String;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "documentDescription"

    .line 35
    .line 36
    const-string v7, "getDocumentDescription()Ljava/lang/String;"

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
    sput-object v1, Lcz;->c:[Lu21;

    .line 56
    .line 57
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
    iput-object p1, p0, Lcz;->a:Ljava/util/Map;

    .line 8
    .line 9
    new-instance v0, Lbz;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lbz;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lmc1;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcz;->b:Ljava/util/Map;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Laz;
    .locals 5

    .line 1
    new-instance v0, Laz;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lcz;->c:[Lu21;

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
    iget-object v3, p0, Lcz;->a:Ljava/util/Map;

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
    const/4 v4, 0x1

    .line 21
    aget-object v4, v2, v4

    .line 22
    .line 23
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v3, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v0, v1, v3}, Laz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    aget-object v1, v2, v1

    .line 38
    .line 39
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object p0, p0, Lcz;->b:Ljava/util/Map;

    .line 44
    .line 45
    invoke-static {p0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    iput-object v1, v0, Laz;->d:Ljava/lang/String;

    .line 54
    .line 55
    :cond_0
    const/4 v1, 0x3

    .line 56
    aget-object v1, v2, v1

    .line 57
    .line 58
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {p0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Ljava/lang/String;

    .line 67
    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    iput-object p0, v0, Laz;->e:Ljava/lang/String;

    .line 71
    .line 72
    :cond_1
    return-object v0
.end method
