
/* RVA 8bae4 */

uint Inspect_8bae4(void)

{
  uint uVar1;
  ulong uVar2;
  
  if (cRam0000000000988f4c == '\0') {
    uVar2 = func_0x0013a3bc();
  }
  else {
    uVar2 = func_0x0013a3bc();
  }
  if ((uVar2 & 1) == 0) {
    return 0;
  }
  uVar1 = func_0x0014e540();
  return uVar1 & 1;
}



/* RVA 49a08 */

byte Inspect_49a08(void)

{
  int iVar1;
  
  if ((((bRam000000000098a1f4 & 1) == 0) || ((bRam000000000098a228 & 1) == 0)) ||
     (iVar1 = FUN_0050cde4(0x98b29c,&UNK_00180a90), iVar1 != 0)) {
    return 0;
  }
  return bRam000000000098b2a0 & 1;
}



/* RVA bee2c */

void Inspect_bee2c(void)

{
  int iVar1;
  
  if (((bRam000000000098a1f4 & 1) == 0) || ((bRam000000000098a228 & 1) == 0)) {
    uRam000000000098b2a0 = false;
  }
  else {
    iVar1 = func_0x0025a844();
    uRam000000000098b2a0 = iVar1 != 0;
  }
  return;
}



/* RVA 85834 */

/* WARNING: Removing unreachable block (ram,0x001858ac) */

byte Inspect_85834(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  byte bVar6;
  char cVar7;
  bool bVar8;
  uint uVar9;
  byte bVar10;
  int iVar11;
  ulong uVar12;
  int *piVar13;
  int iVar14;
  long lVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  ulong uVar20;
  ulong uVar21;
  uint uVar22;
  byte bStack_134;
  byte abStack_120 [32];
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  byte abStack_d0 [56];
  undefined1 auStack_98 [32];
  ulong uStack_78;
  ulong uStack_70;
  
  iVar11 = iRam0000000000988f50;
  if (iRam0000000000988f50 == 0) {
    do {
      iVar11 = iRam000000000098b298;
      cVar7 = '\x01';
      bVar8 = (bool)ExclusiveMonitorPass(0x98b298,0x10);
      if (bVar8) {
        iRam000000000098b298 = 1;
        cVar7 = ExclusiveMonitorsStatus();
      }
    } while (cVar7 != '\0' || iVar11 != 0);
    uStack_f8 = 0;
    uStack_100 = 0;
    uStack_e8 = 0;
    uStack_f0 = 0;
    uStack_d8 = 0;
    uStack_e0 = 0;
    abStack_d0[8] = 0;
    abStack_d0[9] = 0;
    abStack_d0[10] = 0;
    abStack_d0[0xb] = 0;
    abStack_d0[0xc] = 0;
    abStack_d0[0xd] = 0;
    abStack_d0[0xe] = 0;
    abStack_d0[0xf] = 0;
    abStack_d0[0] = 0;
    abStack_d0[1] = 0;
    abStack_d0[2] = 0;
    abStack_d0[3] = 0;
    abStack_d0[4] = 0;
    abStack_d0[5] = 0;
    abStack_d0[6] = 0;
    abStack_d0[7] = 0;
    abStack_d0[0x18] = 0;
    abStack_d0[0x19] = 0;
    abStack_d0[0x1a] = 0;
    abStack_d0[0x1b] = 0;
    abStack_d0[0x1c] = 0;
    abStack_d0[0x1d] = 0;
    abStack_d0[0x1e] = 0;
    abStack_d0[0x1f] = 0;
    abStack_d0[0x10] = 0;
    abStack_d0[0x11] = 0;
    abStack_d0[0x12] = 0;
    abStack_d0[0x13] = 0;
    abStack_d0[0x14] = 0;
    abStack_d0[0x15] = 0;
    abStack_d0[0x16] = 0;
    abStack_d0[0x17] = 0;
    abStack_d0[0x28] = 0;
    abStack_d0[0x29] = 0;
    abStack_d0[0x2a] = 0;
    abStack_d0[0x2b] = 0;
    abStack_d0[0x2c] = 0;
    abStack_d0[0x2d] = 0;
    abStack_d0[0x2e] = 0;
    abStack_d0[0x2f] = 0;
    abStack_d0[0x20] = 0;
    abStack_d0[0x21] = 0;
    abStack_d0[0x22] = 0;
    abStack_d0[0x23] = 0;
    abStack_d0[0x24] = 0;
    abStack_d0[0x25] = 0;
    abStack_d0[0x26] = 0;
    abStack_d0[0x27] = 0;
    iVar11 = FUN_00114020(auStack_98);
    if ((iVar11 == 0) || (uVar12 = thunk_FUN_001378fc(auStack_98,&uStack_100), (uVar12 & 1) == 0)) {
      FUN_00236c8c(0x988f54,0,0x20);
      FUN_00236c8c(0x989f74,0,0x20);
      iRam0000000000988f50 = 2;
      FUN_00239498(auStack_98,0x20);
      FUN_00239498(&uStack_100,0x60);
      bStack_134 = 0;
      iRam000000000098b298 = 0;
    }
    else {
      uVar22 = 0;
      do {
        iVar11 = func_0x0014ed14(param_1,abStack_120);
        if (iVar11 == 0) {
          if (uVar22 < 3) {
            uStack_78 = (ulong)(*(uint *)(&UNK_008257f8 + (ulong)uVar22 * 4) / 1000000);
            uStack_70 = (ulong)((*(uint *)(&UNK_008257f8 + (ulong)uVar22 * 4) % 1000000) * 1000);
            do {
              while( true ) {
                uVar12 = FUN_0010ee7c(&UNK_0050ea30,&uStack_78,&uStack_78,0,0,0,0);
                uVar17 = (uint)uVar12;
                if (0xfffffffffffff000 < uVar12) break;
                if ((uVar17 == 0) || (piVar13 = (int *)FUN_00509664(), *piVar13 != 4))
                goto LAB_0018594c;
              }
              uVar1 = uVar17 + 1;
              uVar3 = ~uVar17 | 1;
              uVar4 = uVar1 + ~uVar17 * 2;
              uVar2 = (uVar1 + uVar3) * 2;
              iVar14 = uVar3 + uVar17;
              uVar3 = (uVar1 + uVar4 * 2) * 2;
              uVar2 = ((uVar2 | uVar17) ^ 1) + (uVar2 & uVar17);
              uVar4 = (uVar4 ^ 1) + (uVar1 & 1);
              uVar19 = iVar14 * 2;
              uVar1 = ((uVar4 ^ uVar1) + (uVar4 & uVar1) * 2) * 2;
              uVar4 = uVar19 - uVar17;
              uVar1 = (uVar17 << 1 | 1) + iVar14 * -2 + ~uVar19 + uVar1 + (uVar1 | uVar4) +
                      (uVar4 | uVar1 ^ 0xffffffff);
              uVar17 = (uVar2 + (uVar3 | uVar2 ^ 0xffffffff) + (uVar2 | uVar3)) * 2 + 2;
              iVar14 = (uVar1 + 1 + ~uVar1 * 2 | uVar17) + uVar1;
              uVar17 = uVar1 + 1 + uVar17 + (uVar17 + ~uVar17 * 2 | uVar1 ^ 0xffffffff | 1);
              uVar1 = -iVar14 - 2;
              iVar14 = uVar17 + iVar14 * 2 + (uVar1 | uVar17) + (uVar1 | uVar17 ^ 0xffffffff);
              uVar17 = iVar14 + 4;
              uVar1 = iVar14 + 5 + ~uVar17 * 2;
              uVar1 = (uVar17 & 1) + uVar1 + ~uVar1 * 2 + (~uVar17 * 2 + uVar17 | 1) + 1;
              uVar1 = uVar17 + iVar14 + 5 + uVar1 + (uVar1 | -iVar14 - 6U) +
                      (-iVar14 - 6U | uVar1 ^ 0xffffffff);
              uVar17 = uVar1 + 4;
              iVar14 = (uVar17 * 2 & 4) + (uVar17 ^ 2);
              uVar17 = ((uVar1 | 0xfffffffe) + (-iVar14 | 1U) + iVar14 * 2) - 2;
              uVar17 = (uVar17 * 2 & 4) + (uVar17 ^ 2);
              iVar14 = ~uVar17 + uVar17 * 2;
              piVar13 = (int *)FUN_00509664();
              *piVar13 = iVar14;
            } while (iVar14 == 4);
            goto LAB_0018594c;
          }
        }
        else {
          lVar15 = 0;
          uVar17 = (uint)(iVar11 != 1);
          do {
            bVar6 = abStack_120[lVar15];
            bVar10 = abStack_d0[lVar15];
            *(byte *)(lVar15 + 0x988f54) = bVar6;
            uVar16 = (uint)bVar6;
            uVar19 = uVar16 + 1 + ~(uint)bVar6 * 2;
            uVar9 = (uVar16 - 1) * 2 & 2;
            uVar2 = uVar19 + uVar16 + 1 + ((uint)bVar10 ^ uVar19 ^ 0xffffffff) +
                    (~uVar19 | bVar10 ^ 0xffffffff);
            uVar3 = uVar9 + (uVar16 - 1 ^ 1);
            uVar18 = (uint)bVar10;
            uVar1 = uVar2 + 2;
            uVar4 = ~uVar2 + uVar18 + (uVar2 + 1 | uVar18 ^ 0xffffffff);
            uVar19 = uVar19 + uVar16;
            uVar16 = (uVar4 ^ uVar1) + (uVar4 & uVar1) * 2;
            uVar4 = uVar3 + uVar19 + (-uVar3 & (uVar19 ^ 0xffffffff)) * 2 +
                    (uVar19 + (-uVar3 | uVar19 ^ 0xffffffff)) * 2 + 2;
            uVar19 = (uint)bVar10;
            uVar1 = uVar1 + uVar18 + (0xfe - uVar2 | uVar18 ^ 0xffffffff);
            uVar4 = (uVar4 - uVar19) + (uVar19 & (uVar4 ^ 0xffffffff));
            uVar4 = (uVar4 ^ uVar19 + 1) + (uVar4 & uVar19 + 1) * 2;
            uVar2 = (uVar3 ^ 0xfffffffe) + uVar9 + uVar3 * 2;
            iVar14 = uVar16 + (uVar1 | uVar16 ^ 0xffffffff) + (uVar16 | uVar1);
            uVar1 = iVar14 + 1;
            uVar4 = (uVar2 | -uVar4) + uVar4 + (~uVar4 + uVar4 * 2 | uVar2);
            iVar14 = iVar14 + 2;
            uVar4 = uVar4 + ~uVar4 * 2;
            uVar2 = uVar1 & (uVar4 ^ 0xffffffff);
            uVar2 = ((iVar14 + ~uVar1 * 2 & (uVar4 ^ 0xffffffff)) - (uVar1 + uVar2)) +
                    (iVar14 + uVar4 + uVar2) * 2;
            uVar3 = uVar2 + uVar17;
            uVar1 = (uVar17 ^ 1) + ~uVar17 * 2 + (uVar17 & 1) * 2;
            iVar14 = (uVar2 | uVar17) + 1;
            uVar4 = uVar2 + (uVar2 * 2 ^ 0xffffffff);
            uVar19 = (uVar2 | uVar17 ^ 0xffffffff) + uVar17 + iVar14;
            uVar16 = (~uVar3 | 1) + (uVar2 | uVar17) + (uVar3 | 1);
            iVar5 = (uVar19 * 2 & 4) + (uVar19 ^ 2);
            uVar1 = (uVar4 | uVar1 ^ 0xffffffff) + uVar2 + (uVar4 | uVar1) * 2 + 2;
            uVar19 = iVar5 + uVar1 + (-iVar5 | uVar1 ^ 0xffffffff) + (iVar5 - 1U & uVar1);
            uVar1 = (uVar2 + 1) * 3 + ~uVar2 * 4;
            iVar5 = uVar19 + ~uVar19 * 2;
            uVar4 = iVar5 + (uVar17 - uVar1) + 1;
            uVar18 = -(iVar5 + 2U | uVar17 + ~uVar1);
            uVar9 = (uVar17 - uVar1) + (uVar1 - uVar17) * 2;
            iVar5 = (uVar4 ^ uVar18) + (uVar4 & uVar18) * 2;
            uVar1 = uVar19 + uVar17 + ~uVar1 + (uVar9 + (-uVar19 | uVar9 ^ 0xffffffff)) * 2 + 2;
            uVar4 = (iVar5 * 2 ^ 0xffffffffU) + iVar5 * 4 + 2;
            uVar17 = ((uVar2 & uVar17 ^ 1) + (uVar2 & uVar17 & 1) * 2 + (iVar14 - uVar3) * 2) - 3;
            uVar1 = (uVar4 ^ uVar1) + (uVar4 & uVar1) * 2;
            uVar4 = (uVar17 ^ uVar16) + (uVar17 & uVar16) * 2;
            uVar2 = ~uVar1 + uVar1 * 2;
            uVar3 = uVar2 + (uVar4 & -uVar1);
            uVar17 = uVar4 + (uVar2 | uVar4 ^ 0xffffffff) + uVar3 + 1;
            uVar19 = uVar2 + uVar4;
            uVar16 = ~uVar17;
            uVar1 = ((uVar1 - 1 | uVar4) - (uVar4 + uVar1)) + uVar19;
            uVar17 = uVar1 + uVar17 * 3 + (uVar16 & (uVar1 ^ 0xffffffff)) * 2 +
                     (uVar16 | uVar1 ^ 0xffffffff) * 2 + 3;
            uVar12 = lVar15 + 2;
            uVar1 = (uVar19 ^ -uVar3) + (uVar3 ^ -(uVar2 & uVar4)) +
                    ((uVar19 & -uVar3) + (uVar3 & -(uVar2 & uVar4))) * 2;
            uVar21 = -lVar15 - 2U | 1;
            lVar15 = (-lVar15 - 2U | 0xfffffffffffffffe) + uVar12;
            uVar21 = (uVar21 ^ uVar12) + (uVar21 & uVar12) * 2;
            uVar12 = lVar15 + 1;
            uVar21 = (uVar21 & -lVar15 - 2U) + uVar12 + (uVar21 & uVar12);
            uVar12 = ~uVar21 * 2;
            uVar17 = uVar17 + uVar1 + 1 + (uVar17 & uVar1) +
                     (uVar17 + ~uVar17 * 2 + 1 | uVar1 + 1 + ~uVar1 * 2);
            uVar12 = uVar21 + (-uVar21 - 2 | uVar12) + (uVar21 + 1 | uVar12) + 2;
            uVar21 = (((uVar21 ^ 0x7ffffffffffffffe) + ~uVar21 * -2) - (uVar21 * 2 & 2)) * 2;
            uVar20 = uVar21 | uVar12;
            lVar15 = uVar21 + uVar12 + 1;
            uVar12 = (uVar21 + uVar12 | 1) + (uVar12 & 1) +
                     (uVar12 + ~uVar12 * 2 + 1 | uVar21 ^ 0xffffffffffffffff);
            lVar15 = (lVar15 - uVar20) + uVar12 + (uVar20 - lVar15 | uVar12 ^ 0xffffffffffffffff) +
                     (uVar12 & lVar15 + ~uVar20);
          } while (lVar15 != 0x20);
          bStack_134 = uVar17 == 0;
          iVar14 = 1;
          if (!(bool)bStack_134) {
            iVar14 = 2;
          }
          thunk_FUN_00188d44(auStack_98,&uStack_100,iVar14,abStack_120,0x989f74);
          iRam0000000000988f50 = iVar14;
          FUN_00239498(abStack_120,0x20);
          FUN_00239498(auStack_98,0x20);
          FUN_00239498(&uStack_100,0x60);
          iRam000000000098b298 = 0;
LAB_0018594c:
          if (iVar11 != 0) goto LAB_001858d0;
        }
        iVar11 = uVar22 + (~uVar22 | 2) + 1;
        iVar14 = uVar22 + (~uVar22 | 0xfffffffd) + 3;
        iVar5 = (uVar22 ^ 0xfffffffd) + 1;
        uVar17 = iVar14 + iVar11;
        uVar1 = iVar5 - iVar11;
        iVar11 = (uVar17 ^ uVar1) + ((iVar14 + iVar5) - (uVar17 | uVar1)) * 2;
        iVar14 = (uVar22 << 1 | 4) - uVar22;
        uVar1 = iVar11 * 2;
        uVar4 = iVar14 - 2;
        uVar22 = iVar11 * 2 | 1;
        uVar17 = (iVar14 + uVar22) - 3;
        uVar17 = (uVar17 ^ -(uVar1 | uVar4)) + (uVar17 & -(uVar1 | uVar4)) * 2;
        uVar22 = (uVar4 & 1) + (uVar1 + uVar4 | 1) + (uVar22 + ~uVar1 * 2 | 1U - iVar14) + 1;
        uVar22 = (uVar17 ^ uVar22) + (uVar17 & uVar22) * 2;
        uVar17 = ~uVar22 * 2 + uVar22 * 3;
        uVar22 = uVar17 + 1 + ~uVar17 * 2 + uVar17 * 2;
        iVar11 = (uVar22 | 1) + (uVar17 + 1 & 1) + ((uVar22 ^ 0xffffffff) & 0xfffffffe);
        uVar22 = (~uVar22 | 1) + (uVar17 * 2 & 2) + uVar22 * 2;
        uVar17 = -iVar11 - 2;
        uVar22 = uVar22 + iVar11 * 2 + (uVar17 | uVar22) + (uVar17 | uVar22 ^ 0xffffffff) + 4;
      } while (uVar22 != 4);
      FUN_00239498(abStack_120,0x20);
      FUN_00239498(auStack_98,0x20);
      FUN_00239498(&uStack_100,0x60);
      bStack_134 = 0;
      iRam000000000098b298 = 0;
    }
  }
  else {
    bVar10 = thunk_FUN_001bfb20(iRam0000000000988f50,0,0,0);
    bStack_134 = bVar10 & iVar11 == 1;
  }
LAB_001858d0:
  return bStack_134 & 1;
}



/* RVA 88604 */

void Inspect_88604(long param_1,undefined8 param_2,long param_3)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  ulong uVar4;
  
  if (((param_1 != 0) && (param_3 != 0)) && (lRam000000000098b290 == 0)) {
    lVar3 = (*(code *)&UNK_001821a4)(param_1,param_3);
    uVar4 = func_0x00145e28(param_1);
    if (((uVar4 & 1) == 0) && (lVar3 != 0)) {
      do {
        if (lRam000000000098b290 != 0) {
          ClearExclusiveLocal();
          (*(code *)&UNK_001bf184)(param_1,lVar3);
          return;
        }
        cVar1 = '\x01';
        bVar2 = (bool)ExclusiveMonitorPass(0x98b290,0x10);
        if (bVar2) {
          cVar1 = ExclusiveMonitorsStatus();
          lRam000000000098b290 = lVar3;
        }
      } while (cVar1 != '\0');
    }
  }
  return;
}



/* RVA 7ed20 */

void Inspect_7ed20(void)

{
  if (cRam0000000000988f4c == '\0') {
    return;
  }
  return;
}


