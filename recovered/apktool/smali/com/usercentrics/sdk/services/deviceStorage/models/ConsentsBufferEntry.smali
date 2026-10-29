.class public final Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$$serializer;,
        Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$Companion;


# instance fields
.field public final a:J

.field public final b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$Companion;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IJLcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 10
    .line 11
    iput-object p4, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$$serializer;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method

.method public constructor <init>(JLcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-wide p1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 27
    iput-object p3, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

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
    check-cast p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

    .line 12
    .line 13
    iget-wide v3, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object p0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 25
    .line 26
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ConsentsBufferEntry(timestampInSeconds="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

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
    iget-object p0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->b:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
