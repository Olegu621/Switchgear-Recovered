.class public final Lj20;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic g:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lhk2;

.field public final c:Lhk2;

.field public final d:Lhk2;

.field public final e:Lhk2;

.field public final f:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lj20;

    .line 4
    .line 5
    const-string v2, "namespace"

    .line 6
    .line 7
    const-string v3, "getNamespace()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lj22;->a:Lk22;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    new-array v1, v1, [Lu21;

    .line 20
    .line 21
    aput-object v0, v1, v4

    .line 22
    .line 23
    sput-object v1, Lj20;->g:[Lu21;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj20;->a:Ljava/util/Map;

    .line 5
    .line 6
    new-instance p1, Li20;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Li20;-><init>(Lj20;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lj20;->b:Lhk2;

    .line 17
    .line 18
    new-instance p1, Li20;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p0, v0}, Li20;-><init>(Lj20;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lj20;->c:Lhk2;

    .line 29
    .line 30
    new-instance p1, Li20;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, v0}, Li20;-><init>(Lj20;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lj20;->d:Lhk2;

    .line 41
    .line 42
    new-instance p1, Li20;

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-direct {p1, p0, v0}, Li20;-><init>(Lj20;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lj20;->e:Lhk2;

    .line 53
    .line 54
    new-instance p1, Li20;

    .line 55
    .line 56
    const/4 v0, 0x4

    .line 57
    invoke-direct {p1, p0, v0}, Li20;-><init>(Lj20;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lj20;->f:Lhk2;

    .line 65
    .line 66
    return-void
.end method
