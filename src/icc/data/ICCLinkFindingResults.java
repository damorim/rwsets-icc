package icc.data;

import java.util.ArrayList;
import java.util.List;

public class ICCLinkFindingResults
{
  public SymbolTable<VarInfo> varsST;
  public SymbolTable<IntentInfo> intentsST;
  public List<ICCLinkInfo<IntentInfo>> iccLinks;
  
  public ICCLinkFindingResults()
  {
    this(true);
  }
  
  public ICCLinkFindingResults(boolean init)
  {
    if (init)
    {
      this.varsST = new SymbolTable<VarInfo>();
      this.intentsST = new SymbolTable<IntentInfo>();
      this.iccLinks = new ArrayList<ICCLinkInfo<IntentInfo>>();
    }
  }
}
