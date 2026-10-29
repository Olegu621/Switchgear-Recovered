.class public final Lcom/usercentrics/sdk/UsercentricsReadyStatus;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/UsercentricsReadyStatus$$serializer;,
        Lcom/usercentrics/sdk/UsercentricsReadyStatus$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/UsercentricsReadyStatus$Companion;

.field public static final e:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/List;

.field public final c:Lcom/usercentrics/sdk/GeolocationRuleset;

.field public final d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/UsercentricsReadyStatus$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->Companion:Lcom/usercentrics/sdk/UsercentricsReadyStatus$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/UsercentricsServiceConsent$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsServiceConsent$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    aput-object v3, v1, v2

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aput-object v0, v1, v2

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    aput-object v3, v1, v0

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    aput-object v3, v1, v0

    .line 30
    .line 31
    sput-object v1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->e:[Lkotlinx/serialization/KSerializer;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(IZLjava/util/List;Lcom/usercentrics/sdk/GeolocationRuleset;Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-boolean p2, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 11
    .line 12
    iput-object p3, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->c:Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsReadyStatus$$serializer;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/usercentrics/sdk/UsercentricsReadyStatus$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public constructor <init>(ZLjava/util/ArrayList;Lcom/usercentrics/sdk/GeolocationRuleset;Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-boolean p1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 32
    iput-object p2, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 33
    iput-object p3, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->c:Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 34
    iput-object p4, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

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
    instance-of v1, p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;

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
    check-cast p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 21
    .line 22
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->c:Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->c:Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 45
    .line 46
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->c:Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, Lcom/usercentrics/sdk/GeolocationRuleset;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UsercentricsReadyStatus(shouldCollectConsent="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", consents="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", geolocationRuleset="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->c:Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", location="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->d:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
