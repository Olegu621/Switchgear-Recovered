.class public final Lcom/usercentrics/tcf/core/model/gvl/Declarations;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/tcf/core/model/gvl/Declarations$$serializer;,
        Lcom/usercentrics/tcf/core/model/gvl/Declarations$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/tcf/core/model/gvl/Declarations$Companion;

.field public static final g:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/usercentrics/tcf/core/model/gvl/Declarations$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->Companion:Lcom/usercentrics/tcf/core/model/gvl/Declarations$Companion;

    .line 7
    .line 8
    new-instance v0, Lrt0;

    .line 9
    .line 10
    sget-object v1, Lvh2;->a:Lvh2;

    .line 11
    .line 12
    sget-object v2, Lcom/usercentrics/tcf/core/model/gvl/Purpose$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Purpose$$serializer;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v0, v1, v2, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lrt0;

    .line 19
    .line 20
    invoke-direct {v4, v1, v2, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lrt0;

    .line 24
    .line 25
    sget-object v5, Lcom/usercentrics/tcf/core/model/gvl/Feature$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Feature$$serializer;

    .line 26
    .line 27
    invoke-direct {v2, v1, v5, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 28
    .line 29
    .line 30
    new-instance v6, Lrt0;

    .line 31
    .line 32
    invoke-direct {v6, v1, v5, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lrt0;

    .line 36
    .line 37
    sget-object v7, Lcom/usercentrics/tcf/core/model/gvl/Stack$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Stack$$serializer;

    .line 38
    .line 39
    invoke-direct {v5, v1, v7, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 40
    .line 41
    .line 42
    new-instance v7, Lrt0;

    .line 43
    .line 44
    sget-object v8, Lcom/usercentrics/tcf/core/model/gvl/DataCategory$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/DataCategory$$serializer;

    .line 45
    .line 46
    invoke-direct {v7, v1, v8, v3}, Lrt0;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x6

    .line 50
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    aput-object v0, v1, v8

    .line 54
    .line 55
    aput-object v4, v1, v3

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v2, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v6, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v5, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x5

    .line 67
    aput-object v7, v1, v0

    .line 68
    .line 69
    sput-object v1, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->g:[Lkotlinx/serialization/KSerializer;

    .line 70
    .line 71
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->a:Ljava/util/Map;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->a:Ljava/util/Map;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->b:Ljava/util/Map;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput-object p3, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->b:Ljava/util/Map;

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->c:Ljava/util/Map;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    iput-object p4, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->c:Ljava/util/Map;

    .line 31
    .line 32
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 33
    .line 34
    if-nez p2, :cond_3

    .line 35
    .line 36
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->d:Ljava/util/Map;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    iput-object p5, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->d:Ljava/util/Map;

    .line 40
    .line 41
    :goto_3
    and-int/lit8 p2, p1, 0x10

    .line 42
    .line 43
    if-nez p2, :cond_4

    .line 44
    .line 45
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->e:Ljava/util/Map;

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    iput-object p6, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->e:Ljava/util/Map;

    .line 49
    .line 50
    :goto_4
    and-int/lit8 p1, p1, 0x20

    .line 51
    .line 52
    if-nez p1, :cond_5

    .line 53
    .line 54
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->f:Ljava/util/Map;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_5
    iput-object p7, p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->f:Ljava/util/Map;

    .line 58
    .line 59
    return-void
.end method
