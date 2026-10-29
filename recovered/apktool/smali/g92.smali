.class public abstract Lg92;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lf92;

.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v2, Lf92;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v2, Lg92;->Companion:Lf92;

    .line 7
    .line 8
    new-instance v0, Ld92;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v1, 0x2

    .line 13
    const-class v3, Lf92;

    .line 14
    .line 15
    const-string v4, "firstProcessorFunctionWrapper"

    .line 16
    .line 17
    const-string v5, "firstProcessorFunctionWrapper(Lcom/usercentrics/tcf/core/TCModel;Lcom/usercentrics/tcf/core/GVL;)Lcom/usercentrics/tcf/core/TCModel;"

    .line 18
    .line 19
    invoke-direct/range {v0 .. v7}, Ld92;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    move-object v8, v0

    .line 23
    new-instance v0, Ld92;

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    const-class v3, Lf92;

    .line 27
    .line 28
    const-string v4, "secondProcessorFunction"

    .line 29
    .line 30
    const-string v5, "secondProcessorFunction(Lcom/usercentrics/tcf/core/TCModel;Lcom/usercentrics/tcf/core/GVL;)Lcom/usercentrics/tcf/core/TCModel;"

    .line 31
    .line 32
    invoke-direct/range {v0 .. v7}, Ld92;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    new-array v1, v1, [Lq21;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    aput-object v8, v1, v2

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    aput-object v0, v1, v2

    .line 42
    .line 43
    invoke-static {v1}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lg92;->a:Ljava/util/List;

    .line 48
    .line 49
    return-void
.end method
