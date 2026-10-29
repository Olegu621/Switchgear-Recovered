.class public final Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$$serializer;,
        Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$Companion;

.field public static final d:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Z

.field public final b:Lmz2;

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->Companion:Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$Companion;

    .line 7
    .line 8
    new-instance v0, Lb10;

    .line 9
    .line 10
    const-class v1, Lmz2;

    .line 11
    .line 12
    invoke-static {v1}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Loe0;

    .line 17
    .line 18
    const-string v3, "com.usercentrics.sdk.models.settings.UsercentricsConsentType"

    .line 19
    .line 20
    invoke-static {}, Lmz2;->values()[Lmz2;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {v2, v3, v4}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    new-array v4, v3, [Lkotlinx/serialization/KSerializer;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v4}, Lb10;-><init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-object v2, v1, v3

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    aput-object v0, v1, v3

    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    aput-object v2, v1, v0

    .line 44
    .line 45
    sput-object v1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->d:[Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    return-void
.end method

.method public synthetic constructor <init>(IZLmz2;J)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x7

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->a:Z

    .line 10
    .line 11
    iput-object p3, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->b:Lmz2;

    .line 12
    .line 13
    iput-wide p4, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->c:J

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$$serializer;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public constructor <init>(ZLmz2;J)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-boolean p1, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->a:Z

    .line 29
    iput-object p2, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->b:Lmz2;

    .line 30
    iput-wide p3, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->c:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;

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
    check-cast p1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->b:Lmz2;

    .line 21
    .line 22
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->b:Lmz2;

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-wide v3, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->c:J

    .line 28
    .line 29
    iget-wide p0, p1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->c:J

    .line 30
    .line 31
    cmp-long p0, v3, p0

    .line 32
    .line 33
    if-eqz p0, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->b:Lmz2;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->c:J

    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UsercentricsConsentHistoryEntry(status="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", type="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->b:Lmz2;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", timestampInMillis="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    iget-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;->c:J

    .line 31
    .line 32
    invoke-static {v0, v2, v3, v1}, Lfm0;->m(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
