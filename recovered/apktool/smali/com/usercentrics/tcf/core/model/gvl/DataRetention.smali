.class public final Lcom/usercentrics/tcf/core/model/gvl/DataRetention;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;,
        Lcom/usercentrics/tcf/core/model/gvl/DataRetention$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/tcf/core/model/gvl/DataRetention$Companion;


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

.field public final c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->Companion:Lcom/usercentrics/tcf/core/model/gvl/DataRetention$Companion;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x6

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    if-ne v2, v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    and-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iput-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 18
    .line 19
    :goto_0
    iput-object p3, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 20
    .line 21
    iput-object p4, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    sget-object p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p1, v2, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 31
    .line 32
    .line 33
    throw v1
.end method

.method public constructor <init>(Ljava/lang/Integer;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 36
    iput-object p2, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 37
    iput-object p3, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;->a:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v1, v0

    .line 22
    mul-int/lit8 v1, v1, 0x1f

    .line 23
    .line 24
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 25
    .line 26
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;->a:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v1

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DataRetention(stdRetention="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", purposes="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", specialPurposes="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
